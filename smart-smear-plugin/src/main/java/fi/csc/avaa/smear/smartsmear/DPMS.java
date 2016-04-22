/**
 * 
 */
package fi.csc.avaa.smear.smartsmear;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;

import fi.csc.smear.db.model.HyyDMPS;

/** visualize DMPS database
 * @author pj (based code by Heikki Junnila).
 *
 */
public class DPMS {
	
	private final static long VUOROKAUSI = 24*3600*1000; //24h
	private final static int YZOOM = 2;
	private final static int L = 50; //height without YZOOM
	private final static int XMARGIN = 50;
	private final static int YMARGIN = 20;
	/*private static final String[] COLORMAP = {"0202AA","0202B6","0202C1","0202CC","0202D8","0202E3","0202EE",
		"0202FA","0202FF","0202FF","0202FF","0202FF","020BFF","0217FF","0222FF","022DFF",
		"0239FF","0244FF","024FFF","025BFF","0266FF","0271FF","027DFF","0288FF","0294FF",
		"029FFF","02AAFF","02B6FF","02C1FF","02CCFF","02D8FF","02E3FF","02EEFF","02FAFF",
		"02FFFF","02FFFF","02FFFF","02FFFF","0BFFFF","17FFFF","22FFFF","2DFFFA","39FFEE",
		"44FFE3","4FFFD8","5BFFCC","66FFC1","71FFB6","7DFFAA","88FF9F","94FF94","9FFF88",
		"AAFF7D","B6FF71","C1FF66","CCFF5B","D8FF4F","E3FF44","EEFF39","FAFF2D","FFFF22","FFFF17","FFFF0B",
		"FFFF02","FFFF02","FFFF02","FFFF02","FFFA02","FFEE02","FFE302","FFD802","FFCC02","FFC102","FFB602",
		"FFAA02","FF9F02","FF9402","FF8802","FF7D02","FF7102","FF6602","FF5B02","FF4F02","FF4402","FF3902",
		"FF2D02","FF2202","FF1702","FF0B02","FF0202","FF0202","FF0202","FF0202","FA0202","EE0202","E30202",
		"D80202","CC0202","C10202","B60202"};*/
	private static final Color[] COLOR = {new Color(2,2,170), new Color(2,2,182),
		new Color(2,2,193), new Color(2,2,204), new Color(2,2,216), new Color(2,2,227),
		new Color(2,2,238), new Color(2,2,250), new Color(2,2,255), new Color(2,2,255),
		new Color(2,2,255), new Color(2,2,255), new Color(2,11,255), new Color(2,23,255),
		new Color(2,34,255), new Color(2,45,255), new Color(2,57,255), new Color(2,68,255),
		new Color(2,79,255), new Color(2,91,255), new Color(2,102,255), new Color(2,113,255),
		new Color(2,125,255), new Color(2,136,255), new Color(2,148,255), new Color(2,159,255),
		new Color(2,170,255),
		new Color(2,182,255), new Color(2,193,255), new Color(2,204,255), new Color(2,216,255),
		new Color(2,227,255), new Color(2,238,255), new Color(2,250,255), new Color(2,255,255),
		new Color(2,255,255), new Color(2,255,255), new Color(2,255,255), new Color(11,255,255),
		new Color(23,255,255), new Color(34,255,255), new Color(45,255,250), new Color(57,255,238),
		new Color(68,255,227), new Color(79,255,216), new Color(91,255,204), new Color(102,255,193),
		new Color(113,255,182), new Color(125,255,170), new Color(136,255,159), new Color(148,255,148),
		new Color(159,255,136), new Color(170,255,125), new Color(182,255,113), new Color(193,255,102),
		new Color(204,255,91), new Color(216,255,79), new Color(227,255,68), new Color(238,255,57),
		new Color(250,255,45), new Color(255,255,34), new Color(255,255,23), new Color(255,255,11),
		new Color(255,255,2), new Color(255,255,2), new Color(255,255,2), new Color(255,255,2),
		new Color(255,250,2), new Color(255,238,2), new Color(255,227,2), new Color(255,216,2),
		new Color(255,250,2), new Color(255,238,2), new Color(255,227,2), new Color(255,216,2),
		new Color(255,204,2), new Color(255,193,2), new Color(255,182,2), new Color(255,170,2),
		new Color(255,159,2), new Color(255,148,2), new Color(255,136,2), new Color(255,125,2),
		new Color(255,113,2), new Color(255,102,2), new Color(255,91,2), new Color(255,79,2),
		new Color(255,68,2), new Color(255,57,2), new Color(255,45,2), new Color(255,34,2),
		new Color(255,23,2), new Color(255,11,2), new Color(255,2,2), new Color(255,2,2),
		new Color(255,2,2), new Color(255,2,2), new Color(250,2,2), new Color(238,2,2),
		new Color(227,2,2), new Color(216,2,2), new Color(204,2,2), new Color(193,2,2),
		new Color(182,2,2)
	};
	private Vizualisation viz;
	/**
	 * 
	 */
	public DPMS(Vizualisation viz) {
		this.viz = viz;
	}

	StreamResource getHyde(Date start, Date end) {
		Date start2 = new Date(start.getTime());
		Date end2 = new Date(end.getTime());
		if (end2.getTime()-start2.getTime() > VUOROKAUSI) { //> 24h
			end2.setTime(start2.getTime()+VUOROKAUSI); // kuva kasvaa levyttä ajan mukana, joten rajataan aika
		}
		final List<HyyDMPS> data = viz.getDataInRange(HyyDMPS.class, start2, end2, null);
		if (data != null && !data.isEmpty()) {
			final float dmps[][] = new float[data.size()][L + 1];
			for (int i = 0; i < data.size(); i++) {
				HyyDMPS d =  data.get(i);
				dmps[i][50] = d.getD282e1();
				dmps[i][49] = d.getD316e1();
				dmps[i][48] = d.getD355e1();
				dmps[i][47] = d.getD398e1();
				dmps[i][46] = d.getD447e1();
				dmps[i][45] = d.getD501e1();
				dmps[i][44] = d.getD562e1();
				dmps[i][43] = d.getD631e1();
				dmps[i][42] = d.getD708e1();
				dmps[i][41] = d.getD794e1();
				dmps[i][40] = d.getD891e1();
				dmps[i][39] = d.getD100e2();
				dmps[i][38] = d.getD112e2();
				dmps[i][37] = d.getD126e2();
				dmps[i][36] = d.getD141e2();
				dmps[i][35] = d.getD158e2();
				dmps[i][34] = d.getD178e2();
				dmps[i][33] = d.getD200e2();
				dmps[i][32] = d.getD224e2();
				dmps[i][31] = d.getD251e2();
				dmps[i][30] = d.getD282e2();
				dmps[i][29] = d.getD316e2();
				dmps[i][28] = d.getD355e2();
				dmps[i][27] = d.getD398e2();
				dmps[i][26] = d.getD447e2();
				dmps[i][25] = d.getD501e2();
				dmps[i][24] = d.getD562e2();
				dmps[i][23] = d.getD631e2();
				dmps[i][22] = d.getD708e2();
				dmps[i][21] = d.getD794e2();
				dmps[i][20] = d.getD891e2();
				dmps[i][19] = d.getD100e3();
				dmps[i][18] = d.getD112e3();
				dmps[i][17] = d.getD126e3();
				dmps[i][16] = d.getD141e3();
				dmps[i][15] = d.getD158e3();
				dmps[i][14] = d.getD178e3();
				dmps[i][13] = d.getD200e3();
				dmps[i][12] = d.getD224e3();
				dmps[i][11] = d.getD251e3();
				dmps[i][10] = d.getD282e3();
				dmps[i][9] = d.getD316e3();
				dmps[i][8] = d.getD355e3();
				dmps[i][7] = d.getD398e3();
				dmps[i][6] = d.getD447e3();
				dmps[i][5] = d.getD501e3();
				dmps[i][4] = d.getD562e3();
				dmps[i][3] = d.getD631e3();
				dmps[i][2] = d.getD708e3();
				dmps[i][1] = d.getD794e3();
				dmps[i][0] = d.getD891e3();				
			}
			StreamResource st =  new StreamResource(new StreamSource() {
				private static final long serialVersionUID = 4343017200085844911L;
				@Override
				public InputStream getStream() {
					BufferedImage bi = new BufferedImage(data.size()+XMARGIN, YZOOM*L+YMARGIN, BufferedImage.TYPE_INT_ARGB);
					Graphics2D g = bi.createGraphics();
					g.setComposite(AlphaComposite.Src); 	
					for (int m = 0; m < L; m++) {
						for (int n = 0; n < data.size(); n++) {
							float dat=dmps[n][m];
							if (dat < 1) {
								dat = 1;
							}
							double logDat = Math.log10(dat);
							if(logDat > 4)   {logDat=4;}
							if(logDat < 0.1) {logDat=0.1;}
							int ind= (int) Math.round(logDat*25);
							if (dat < 0.01) {
								g.setColor(Color.WHITE);
							} else {
								g.setColor(COLOR[ind]);
							}
							g.drawLine(XMARGIN+n, YZOOM*m, XMARGIN+n, YZOOM*m+1);
						}				
					}
					g.setColor(Color.BLACK);
					g.drawString("1000", 15, 10);
					g.drawString("100", 21, 41);
					g.drawString("10", 27, 72);
					g.drawString("1", 33, YZOOM*L+5);
					g.drawString("time 24h", data.size()-20,  YZOOM*L+15 );
					Font theFont = g.getFont();
					AffineTransform at = new AffineTransform();
					at.rotate(Math.toRadians(-90));
					Font theDerivedFont = theFont.deriveFont(at);
					g.setFont(theDerivedFont);
					g.drawString("Diameter [nm]", 12, YZOOM*L);
					try {
						ByteArrayOutputStream bos = new ByteArrayOutputStream();
						ImageIO.write(bi, "png", bos);
						return new ByteArrayInputStream(bos.toByteArray());
					} catch (IOException e) {
						e.printStackTrace();
						return null;
					}
				}
			}, "DPMSvizH.png");
			st.setCacheTime(600000L); //600s
			return st;

		} else {
			System.err.println("There was no DPMS data");
		}
		System.err.println("DPMS returning null");
		return null;
	}
	
	
}
