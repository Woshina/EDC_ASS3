import nz.sodium.*;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import swidgets.*;
import java.util.ArrayList;
/**
 * An example of how to use the GpsService class
 */
public class Test {
    // create GpsEvent data from create stream
    GpsEvent E1= new GpsEvent("Tracker0",42.124, 100.12312,5.1231);
    GpsEvent E2= new GpsEvent("Tracker2",50.1234, 120.312,12.1231);
    GpsEvent E3= new  GpsEvent("Tracker4",43.1234, 111.112,30.1231);
    GpsEvent E4= new GpsEvent("Tracker5",39.1234, 101.12312,50.31);
    GpsEvent E5= new GpsEvent("Tracker1",41.1234, 120.12312,30.1231);
    GpsEvent E6= new GpsEvent("Tracker0",42.124, 100.12312,5.1231);
    GpsEvent E7=new GpsEvent("Tracker7",49.1234, 121.112,30.1231);
    List<GpsEvent> GpsStream= new List<GpsEvent>();
     GpsStream.add(E1);
     GpsStream.add(E2);
     GpsStream.add(E3);
     GpsStream.add(E4);
     GpsStream.add(E5);
     GpsStream.add(E6);
     GpsStream.add(E7);
     // used to check the final output of tracker 0
    Cell<String> Tracker0cheer= new Cell<String>("Tracker0 | lat:42.124 lon:100.12312 alt:5.1231");
    // used to check the final output of last event
    Cell<String> last= new Cell<String>("Tracker7 | lat:49.1234 lon:121.112 alt:30.1231");
    STextField lastHold = new STextField("");
    STextField last = new STextField("");
    Cell<String> lastT = last.sUserChanges.hold(lastHold.toString());
     Stream<GpsEvent> Gstream=GpsStream.Stream();
       for(Stream<GpsEvent> s:  Gstream){
        //listen to stream and add the last coming event in the cell
        s.listen((GpsEvent ev) -> {
            lastHold.setText(last.getText());

            last .selectAll();
            last .replaceSelection(ev.name + "," + ev.latitude +  " , " + ev. longitude+","+ev.altitude);

        });
        // add filter to filter event in the stream
        Cell<String> Tracker0 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker0")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker1 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker1")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker2 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker2")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker3 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker3")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker4 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker4")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker5 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker5")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker6 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker6")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker7 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker7")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker8 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker8")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
        Cell<String> Tracker9 = s.map((GpsEvent ev) -> {
            if (ev.name.equals("Tracker9")){
                String output = ev.name + " lat: " + ev.latitude +  " lon: " + ev. longitude;
                return output;} else { return null;}

        }).hold("");
    }
 if (Tracker0.equals( Tracker0cheer)){
        System.out.println("Test for display tracker infomation passed");

    }
  if (LastT.equals( last)){
        System.out.println("Test for display last coming event passed");

    }
}
