/**
 * 
 */
package fi.csc.avaa.smear.smartsmear.email;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import fi.csc.avaa.vaadin.email.SendEmailThread;

/**
 * Runs the email action and generates the email contents and sends it.
 * 
 * @author jmlehtin
 *
 */
public class SmearSendEmail extends SendEmailThread<String> {

	private static final String FROM_EMAIL_ADDRESS = "no-reply@avaa.tdata.fi";
	private static final String SUBJECT = "Smart Smear data download available";
	private static final String SUBJECT_ERROR = "Generating Smart Smear data failed";
	private static final String BODY_TEXT_1 = "<p>You queried AVAA SmartSMEAR application for the following data:</p>";
	private static final String BODY_TEXT_2 = "<p>The data is available as ! file at: <a href='!'>!</a></p>";
	private static final String URL_PART_PATH = "tmp/";
	private static final String BASE_URL = "http://avaa.tdata.fi/";
	private Map<String, List<String>> selectedVars;
	private Date startDate;
	private Date endDate;
	private String qualityVal;
	
	
	
	public SmearSendEmail(String toEmailAddress, Supplier<String> actionSupplier, Map<String, List<String>> selectedVars, String qualityVal, Date startDate, Date endDate) {
		super(toEmailAddress, actionSupplier);
		this.selectedVars = selectedVars;
		this.startDate = startDate;
		this.endDate = endDate;
		this.qualityVal = qualityVal;
	}
	
	@Override
	public void doRun() {
		String filename = actionSupplier.get();
		if(filename != null) {
			StringBuffer sb = new StringBuffer();
			String body1 = BODY_TEXT_1.replaceFirst("!", BASE_URL + URL_PART_PATH + filename);
			sb.append(body1);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
			sb.append("Start date: " + sdf.format(startDate) + "<br>");
			sb.append("End date: " + sdf.format(endDate) + "<br>");
			sb.append("Quality: " + qualityVal + "<br><br>");
			sb.append("<b>Stations and variables</b><br><p>");
			for(Map.Entry<String, List<String>> entry : selectedVars.entrySet()) {
				String station = entry.getKey();
				List<String> vars = entry.getValue();
				sb.append(station + ": ");
				for(int i=0; i < vars.size(); i++) {
					String var = vars.get(i);
					sb.append(var);
					if(i <= vars.size()-2) {
						sb.append(", ");
					}
				}
				sb.append("<br>");
			}
			sb.append("</p>");
			String body2 = BODY_TEXT_2.replaceFirst("!", filename.substring(filename.lastIndexOf(".")+1)).replaceAll("!", BASE_URL + URL_PART_PATH + filename);
			sb.append(body2);
			sendMail(FROM_EMAIL_ADDRESS, SUBJECT, sb.toString(), true);
		} else {
			sendMail(FROM_EMAIL_ADDRESS, SUBJECT_ERROR, "", false);
		}
	}

	
}
