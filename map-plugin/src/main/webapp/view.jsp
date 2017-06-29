
<%
	/**
	 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<%@ page import="javax.portlet.PortletPreferences"%>

<style>
.layersDiv .labelSpan {
	color: #AAA !important;
}
</style>

<h5 id="map-title" style="display:none">Air mass trajectories</h5>
<div style="width:100%;height:395px" id="map"></div>
<script type="text/javascript"
	src="//avaa.tdata.fi/commonjs/OpenLayers-2.13.1/OpenLayers.js"></script>

<script type="text/javascript">
	var COUNT = 96; //4*24h
	var body = document.getElementsByTagName("body")[0];

	body.addEventListener("load", init(), false);
	
	var currentTrajectoryLayers = [];

	function onFeatureSelect(feature) {
        selectedFeature = feature;
        popup = new OpenLayers.Popup.FramedCloud("chicken", 
                                 feature.geometry.getBounds().getCenterLonLat(),
                                 null,
                                 "<div style='font-size:.8em'>Feature: " + feature.id +"<br>Area: " + feature.geometry.getArea()+"</div>",
                                 null, true, onPopupClose);
        feature.popup = popup;
        map.addPopup(popup);
    }
    function onFeatureUnselect(feature) {
        map.removePopup(feature.popup);
        feature.popup.destroy();
        feature.popup = null;
    }    
	function init() {
		currentTrajectoryLayers = [];
		var fromProjection = new OpenLayers.Projection("EPSG:4326"); // transform from WGS 1984
		var toProjection = new OpenLayers.Projection("EPSG:900913"); // to Spherical Mercator Projection
		// try cache before loading from remote resource
	    cacheRead1 = new OpenLayers.Control.CacheRead({
	        eventListeners: {
	            activate: function() {
	                cacheRead2.deactivate();
	            }
	        }
	    });
	    // try loading from remote resource and fall back to cache
	    cacheRead2 = new OpenLayers.Control.CacheRead({
	        autoActivate: false,
	        fetchEvent: "tileerror",
	        eventListeners: {
	            activate: function() {
	                cacheRead1.deactivate();
	            }
	        }
	    });
	    cacheWrite = new OpenLayers.Control.CacheWrite({
	        imageFormat: "image/jpeg",
	        eventListeners: {
	            cachefull: function() {
	                if (seeding) {
	                    stopSeeding();
	                }
	                status.innerHTML = "Cache full.";
	            }
	        }
	    });

		map = new OpenLayers.Map('map', {
			controls : [ 
			       new OpenLayers.Control.Navigation({mouseWheelOptions: {interval: 100}}),
		           new OpenLayers.Control.PanZoom(),
		           new OpenLayers.Control.ArgParser(),
		           new OpenLayers.Control.Attribution(),
				   new OpenLayers.Control.LayerSwitcher({
						'ascending' : false
					}), new OpenLayers.Control.ScaleLine(),
					// new OpenLayers.Control.Permalink('permalink'),
					new OpenLayers.Control.MousePosition(),
					new OpenLayers.Control.OverviewMap(),
					cacheRead1, cacheRead2, cacheWrite,
					new OpenLayers.Control.KeyboardDefaults() ],
			numZoomLevels : 8,
			projection: new OpenLayers.Projection("EPSG:900913")
		});

		var options = {
			attribution: '&copy; <a style="color: green;" target="_blank" href="http://ows.terrestris.de/dienste.html">terrestris</a>. Data: &copy; <a style="color: green;" target="_blank" href="http://www.openstreetmap.org/copyright">OpenStreetMap contributors</a>'
		};
		 
		var ol_wms = new OpenLayers.Layer.WMS("background",
					"http://ows.terrestris.de/osm/service",
				{
					layers: "OSM-WMS",
					version: "1.1.0"
				},
				options);
		var wms_layer =  new OpenLayers.Layer.WMS("OSGeo (same origin - proxied)", "http://vmap0.tiles.osgeo.org/wms/vmap0", {
            layers: "basic"
        });
		
 /* 
		var gwc = new OpenLayers.Layer.WMS("Global Imagery",
				"http://maps.opengeo.org/geowebcache/service/wms", {
					layers : "bluemarble"
				}, {
					tileOrigin : new OpenLayers.LonLat(-180, -90)
				});
		
		var gphy = new OpenLayers.Layer.Google(
		        "Google Physical",
		        {type: G_PHYSICAL_MAP}
		    );
		    var gmap = new OpenLayers.Layer.Google(
		        "Google Streets" // the default
		    );
		    var ghyb = new OpenLayers.Layer.Google(
		        "Google Hybrid",
		        {type: G_HYBRID_MAP}
		    );
		    var gsat = new OpenLayers.Layer.Google(
		        "Google Satellite",
		        {type: G_SATELLITE_MAP}
		    );  */
 
		var kumpulaPos = new OpenLayers.Geometry.Point(24.961227, 60.202887).transform(fromProjection, toProjection);
		var hyytialaPos = new OpenLayers.Geometry.Point(24.294795, 61.847463).transform(fromProjection, toProjection);
		var varrioPos = new OpenLayers.Geometry.Point(29.610137, 67.755044).transform(fromProjection, toProjection);
		var puijoPos = new OpenLayers.Geometry.Point(27.65, 62.9).transform(fromProjection, toProjection);
		var siikaneva1Pos = new OpenLayers.Geometry.Point(24.192794, 61.832702).transform(fromProjection, toProjection);
		var siikaneva2Pos = new OpenLayers.Geometry.Point(24.169752, 61.837286).transform(fromProjection, toProjection);
		var pallasPos = new OpenLayers.Geometry.Point(24.11233, 67.96715).transform(fromProjection, toProjection);
		var aspvretenPos = new OpenLayers.Geometry.Point(17.383333, 58.800000).transform(fromProjection, toProjection);
		var birkenesPos = new OpenLayers.Geometry.Point(8.250000,58.383333).transform(fromProjection, toProjection);
		var preilaPos = new OpenLayers.Geometry.Point(21.0,55.916667).transform(fromProjection, toProjection);
		var vavihillPos = new OpenLayers.Geometry.Point(13.150000,56.016667).transform(fromProjection, toProjection);
		var erottajaPos = new OpenLayers.Geometry.Point(24.9454,60.1652).transform(fromProjection, toProjection);
		var torniPos = new OpenLayers.Geometry.Point(24.9387,60.1678).transform(fromProjection, toProjection);
		var kuivajarviPos = new OpenLayers.Geometry.Point(24.282,61.846).transform(fromProjection, toProjection);

	//	var varrioMarker = new OpenLayers.Marker(varrioPos);
		
		/*    var markers = addStations(); 
 		var markers = new OpenLayers.Layer.Markers("Stations"); */
	
		var image ="<%=request.getContextPath()%>/marker.png";
		var image_gold ="<%=request.getContextPath()%>/marker-gold.png";
		var image_blue ="<%=request.getContextPath()%>/marker-blue.png";
		var image_black ="<%=request.getContextPath()%>/marker-black.png";
		/*
		 * Layer style
		 */
		var layer_style = OpenLayers.Util.extend({},
				OpenLayers.Feature.Vector.style['default']);
		layer_style.fillOpacity = 1;
		layer_style.graphicOpacity = 1;
		layer_style.externalGraphic = image;
		layer_style.graphicWidth = 20;
		layer_style.graphicHeight = 24;
		layer_style.graphicYOffset = -24;
		
		var layer_style_gold = OpenLayers.Util.extend({},
				OpenLayers.Feature.Vector.style['default']);
		layer_style_gold.fillOpacity = 1;
		layer_style_gold.graphicOpacity = 1;
		layer_style_gold.externalGraphic = image_gold;
		layer_style_gold.graphicWidth = 15;
		layer_style_gold.graphicHeight = 18;
		layer_style_gold.graphicYOffset = -18;
		
		var layer_style_blue = OpenLayers.Util.extend({},
				OpenLayers.Feature.Vector.style['default']);
		layer_style_blue.fillOpacity = 1;
		layer_style_blue.graphicOpacity = 1;
		layer_style_blue.externalGraphic = image_blue;
		layer_style_blue.graphicWidth = 20;
		layer_style_blue.graphicHeight = 24;
		layer_style_blue.graphicYOffset = -24;
		
		var layer_style_black = OpenLayers.Util.extend({},
				OpenLayers.Feature.Vector.style['default']);
		layer_style_black.fillOpacity = 1;
		layer_style_black.graphicOpacity = 1;
		layer_style_black.externalGraphic = image_black;
		layer_style_black.graphicWidth = 20;
		layer_style_black.graphicHeight = 24;
		layer_style_black.graphicYOffset = -24;

		/*
		 * Tooltip titles. Note: titles do not work on all browsers
		 */

		var style_kumpula = OpenLayers.Util.extend({}, layer_style_black);
		style_kumpula.title = "Kumpula; east=24.961227; north=60.202887; elevation=45";
		
		var style_varrio = OpenLayers.Util.extend({}, layer_style_blue);
		style_varrio.title = "V�rri�; east=29.610137; north=67.755044; elevation=390";

		var style_hyytiala = OpenLayers.Util.extend({}, layer_style);
		style_hyytiala.title = "Hyyti�l�; east=24.294795; north=61.847463; elevation=179";

		var style_puijo = OpenLayers.Util.extend({}, layer_style_gold);
		style_puijo.title = "Puijo; east=27.65; north=62.9; elevation=306";
		
		var style_siikaneva1 = OpenLayers.Util.extend({}, layer_style_gold);
		style_siikaneva1.title = "Siikaneva 1; east=24.192794; north=61.832702; elevation=162";
		
		var style_siikaneva2 = OpenLayers.Util.extend({}, layer_style_gold);
		style_siikaneva2.title = "Siikaneva 2; east=24.169752; north=61.837286; elevation=162";

		var style_pallas = OpenLayers.Util.extend({}, layer_style_gold);
		style_pallas.title = "Pallas; east=24.11233; north=67.96715; elevation=566";
		
		var style_aspvreten = OpenLayers.Util.extend({}, layer_style_gold);
		style_aspvreten.title = "Aspvreten; east=17.383333; north=58.800000; elevation=30";
		
		var style_birkenes = OpenLayers.Util.extend({}, layer_style_gold);
		style_birkenes.title = "Birkenes; east=8.250000; north=58.383333; elevation=190";
		
		var style_preila = OpenLayers.Util.extend({}, layer_style_gold);
		style_preila.title = "Preila; east=21.0; north=55.916667; elevation=5";
		
		var style_vavihill = OpenLayers.Util.extend({}, layer_style_gold);
		style_vavihill.title = "Vavihill; east=13.150000; north=56.016667; elevation=172";
		
		var style_erottaja = OpenLayers.Util.extend({}, layer_style_black);
		style_erottaja.title = "Erottaja; east=24.9454; north=60.1652; elevation=23";
		
		var style_torni = OpenLayers.Util.extend({}, layer_style_black);
		style_torni.title = "Torni; east=24.9387; north=60.1678; elevation=15";
		
		var style_kuivajarvi = OpenLayers.Util.extend({}, layer_style_gold);
		style_kuivajarvi.title = "Kuivaj�rvi; east=24.282; north=61.846; elevation=?";
		
		var markers = new OpenLayers.Layer.Vector('Stations', {
			style : layer_style
		});
		markers
				.addFeatures([
								new OpenLayers.Feature.Vector(puijoPos, null,
										style_puijo),
								new OpenLayers.Feature.Vector(siikaneva1Pos, null,
										style_siikaneva1),
								new OpenLayers.Feature.Vector(pallasPos, null,
										style_pallas),
								new OpenLayers.Feature.Vector(aspvretenPos, null,
										style_aspvreten),
								new OpenLayers.Feature.Vector(birkenesPos, null,
										style_birkenes),
								new OpenLayers.Feature.Vector(preilaPos, null,
										style_preila),
								new OpenLayers.Feature.Vector(vavihillPos, null,
										style_vavihill),
								new OpenLayers.Feature.Vector(varrioPos, null,
										style_varrio),
								new OpenLayers.Feature.Vector(kumpulaPos, null, 
										style_kumpula),
								new OpenLayers.Feature.Vector(hyytialaPos, null,
										style_hyytiala),
								new OpenLayers.Feature.Vector(erottajaPos, null,
										style_erottaja),
								new OpenLayers.Feature.Vector(torniPos, null,
										style_torni),
								new OpenLayers.Feature.Vector(kuivajarviPos, null,
										style_kuivajarvi),
								new OpenLayers.Feature.Vector(siikaneva2Pos, null,
										style_siikaneva2)]);
		map.addLayers([markers, ol_wms]);

		if (!map.getCenter()) {
			map.zoomToMaxExtent();
		}

		map.setCenter(new OpenLayers.LonLat(21.90962, 63.91700).transform(
				fromProjection, toProjection), 4);
	}

	  // detect what the browser supports
    function detect(evt) {
        // detection is only done once, so we remove the listener.
        evt.object.events.unregister("loadend", null, detect);
        var tile = map.baseLayer.grid[0][0];
        try {
            var canvasContext = tile.getCanvasContext();
            if (canvasContext) {
                // will throw an exception if CORS image requests are not supported
                canvasContext.canvas.toDataURL();
            } else {
                status.innerHTML = "Canvas not supported. Try a different browser.";
            }
        } catch(e) {
            // we remove the OSM layer if CORS image requests are not supported.
            map.addLayer(wms_layer);
            map.setBaseLayer(wms_layer);
            evt.object.destroy();
        }
    }
		
	function drawTrajectories(lat, lon, ho, hei, da) {
		var lineLayer = new OpenLayers.Layer.Vector("Day:"+da+" At:"+ho+":00 "+hei+"m");
		var fromProjection = new OpenLayers.Projection("EPSG:4326"); // transform from WGS 1984
		var toProjection = new OpenLayers.Projection("EPSG:900913"); // to Spherical Mercator Projection              
		map.addControl(new OpenLayers.Control.DrawFeature(lineLayer,
				OpenLayers.Handler.Path));

		// This array will contain trajectory vertices. Now only temporary content
		var points = new Array();
		for (var i=0;i<COUNT;i++) {
			points[i] = new OpenLayers.Geometry.Point(lon[i], lat[i]).transform(fromProjection, toProjection);
		}
		var line = new OpenLayers.Geometry.LineString(points);
		//alert("Asetetaan v�ri h: "+h);
		if (ho < 13){
		var style = {
			strokeColor : '#0000ff',
			strokeOpacity : 0.9,
			strokeWidth : 1
		};
		}
		if (ho > 12){
		var style = {
			strokeColor : '#ff0000',
			strokeOpacity : 0.9,
			strokeWidth : 1
		};
		}
		var lineFeature = new OpenLayers.Feature.Vector(line, null, style);
		lineLayer.addFeatures([ lineFeature ]);
		currentTrajectoryLayers.push(lineLayer);
		return lineLayer;
	}
	
	Liferay.on('NewTrajectory', function(event, param) {
		if(currentTrajectoryLayers.length > 0) {
			for (var i = 0; i < currentTrajectoryLayers.length; i++) {
			    if(map.getLayerIndex(currentTrajectoryLayers[i]) != -1) {
			    	map.removeLayer(currentTrajectoryLayers[i]);	
			    }
			}
			currentTrajectoryLayers = [];
		}

		var s =  param.split(",");
		//var d = Date.parse(s[0]);
		var lat = new Array();
		var lon = new Array();
		var path = '<%= renderRequest.getContextPath() %>';
		//var url = path + "/query.jsp?year="+d.getFullYear()+"&month="+d.getMonth()+1+"&day="+d.getdate()+"&hour="+d.getHours();
		for (var hou = 1;hou < 24;hou = hou + 3) {
			var url = path + "/query.jsp?year="+s[0]+"&month="+s[1]+"&day="+s[2]+"&hour="+hou;	
			var data;
			var http_request = new XMLHttpRequest();
			http_request.open("GET", url, false);
			http_request.onreadystatechange = function () {
			    var done = 4, ok = 200;
			    var height = 0;
			    if (http_request.readyState == done && http_request.status == ok) {
			    	
			        data = JSON.parse(http_request.responseText);
			    }
			    if (data && data[0] !== undefined) {
			    	if (s[4] == "HEIGHT_100"){
						if (undefined !== data[0]._lat100) {
							for(var i=0;i<COUNT;i++) {	 
								lat[i] =  data[i]._lat100;
								lon[i] =  data[i]._lon100;
								height = 100;
							}
							
						} else {
							alert("data[0]: " + data[0]);
						}
			    	} //height 100
			    	if (s[4] == "HEIGHT_250"){
			    		if (undefined !== data[0]._lat250) {
							for(var i=0;i<COUNT;i++) {	 
								lat[i] =  data[i]._lat250;
								lon[i] =  data[i]._lon250;
								height = 250;
							}
							
						} else {
							alert("data[0]: " + data[0]);
						}
			    	} //height 250
			    	if (s[4] == "HEIGHT_500"){
			    		if (undefined !== data[0]._lat500) {
							for(var i=0;i<COUNT;i++) {	 
								lat[i] =  data[i]._lat500;
								lon[i] =  data[i]._lon500;
								height = 500;
							}
							
						} else {
							alert("data[0]: " + data[0]);
						}
			    	} //height 500
			    	var titleElem = document.getElementById("map-title");
			    	titleElem.style.display = "block";
				} //if data
				map.addLayer(drawTrajectories(lat, lon, hou, height, s[2]));
			 
			};
			http_request.send(null);
		}
	});
	
	Liferay.on('ResetTrajectory', function(event, param) {
		document.getElementById('map').innerHTML = "";
		init();
	});
</script>
