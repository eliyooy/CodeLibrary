package module3;

//Java utilities libraries
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

//Processing library
import processing.core.PApplet;

//Unfolding libraries
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import module4.LandQuakeMarker;
import module4.OceanQuakeMarker;
//Parsing library
import parsing.ParseFeed;

/** EarthquakeCityMap
 * An application with an interactive map displaying earthquake data.
 * Author: UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 * Date: July 17, 2015
 * */
public class EarthquakeCityMap extends PApplet {

	// You can ignore this.  It's to keep eclipse from generating a warning.
	private static final long serialVersionUID = 1L;

	// IF YOU ARE WORKING OFFLINE, change the value of this variable to true
	private static final boolean offline = false;
	
	// Less than this threshold is a light earthquake
	public static final float THRESHOLD_MODERATE = 5;
	// Less than this threshold is a minor earthquake
	public static final float THRESHOLD_LIGHT = 4;

	/** This is where to find the local tiles, for working without an Internet connection */
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	// The map
	private UnfoldingMap map;
	
	//feed with magnitude 2.5+ Earthquakes
	private String earthquakesURL = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.atom";

	
	public void setup() {
		size(950, 600, OPENGL);

		if (offline) {
		    map = new UnfoldingMap(this, 200, 50, 700, 500, new MBTilesMapProvider(mbTilesString));
		    earthquakesURL = "2.5_week.atom"; 	// Same feed, saved Aug 7, 2015, for working offline
		}
		else {
			map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleMapProvider());
			// IF YOU WANT TO TEST WITH A LOCAL FILE, uncomment the next line
			//earthquakesURL = "2.5_week.atom";
		}
		
	    map.zoomToLevel(2);
	    MapUtils.createDefaultEventDispatcher(this, map);	
			
	    // The List you will populate with new SimplePointMarkers
	    List<Marker> markers = new ArrayList<Marker>();

	    //Use provided parser to collect properties for each earthquake
	    //PointFeatures have a getLocation method
	    List<PointFeature> earthquakes = ParseFeed.parseEarthquake(this, earthquakesURL);
	    
	    // These print statements show you (1) all of the relevant properties 
	    // in the features, and (2) how to get one property and use it	
	    for(int i=0; i<earthquakes.size(); i++) {
	    	if (earthquakes.size() > 0) {
		    	PointFeature f = earthquakes.get(i);
		    	//System.out.println(earthquakes.get(i).toString());
		    	//System.out.println(f.getProperties());
		    	Object magObj = f.getProperty("magnitude");
		    	float mag = Float.parseFloat(magObj.toString());

		    	
		    	
		    	Location locObj = f.getLocation();
		    	markers.add(new SimplePointMarker(locObj));
		    	

				float xvalue = locObj.x;
		    	float yvalue = locObj.y;
		    	float xlevel = map(xvalue, -200, 200, 0, 700);
		    	float ylevel = map(yvalue, -200, 200, 0, 500);
		    	//System.out.println(locObj.toString());
		    	SimplePointMarker dot = new SimplePointMarker(locObj);
		    	//System.out.println(dot.toString());
		    	//createMarker(f);
		    	//draw(xvalue, yvalue, 200, 200, 200);
		    	//System.out.println(xvalue);
		    	// PointFeatures also have a getLocation method
	    	}
	    }
	    
	    for(int i=0; i<earthquakes.size(); i++) {
	    map.addMarkers(markers); 
	    }
	    
	    
	 // Here is an example of how to use Processing's color method to generate 
	    // an int that represents the color yellow.  
	    int yellow = color(255, 255, 0);
	    
	    //TODO: Add code here as appropriate
	    // create the markers
	    
	    //draw()
	}
	
	// A suggested helper method that takes in an earthquake feature and 
	// returns a SimplePointMarker for that earthquake
	// TODO: Implement this method and call it from setUp, if it helps
	private SimplePointMarker createMarker(PointFeature feature)
	{
		
		return new SimplePointMarker(feature.getLocation());
	}
	
	public void getStoredLocation() {
		
	}

	
	public void draw() {
	    background(10);
	    map.draw();
	    addKey();
	    int black = color(0,0,0);
	    String quake = "Earthquake Key";
	    String high = "5.0+ magnitude";
	    String medium = "4.0+ magnitude";
	    String low = "Below 4.0";
	    rect(25, 50, 150, 300);
	    fill(black);
	    text(quake, 40, 90);
	    fill(255,0,0);
	    ellipse(50, 120, 30, 30);
	    fill(255,255,0);
	    ellipse(50,160,20,20);
	    fill(31,47,150);
	    ellipse(50,200,10,10);
	    fill(black);
	    text(high,70,120);
	    fill(black);
	    text(medium,70, 160);
	    fill(black);
	    text(low,70,200);
	    fill(255,255,255);
	    	    
	    
	    }


	// helper method to draw key in GUI
	// TODO: Implement this method to draw the key
	private void addKey() 
	{	
		// Remember you can use Processing's graphics methods here
	
	}
}