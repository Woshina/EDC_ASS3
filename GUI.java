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
public class GUI {

    public static void main(String[] args){;
        // Initialise the GPS Service
        GpsService serv = new GpsService();
        // Retrieve Event Streams
        Stream<GpsEvent>[] streams = serv.getEventStreams();
        JFrame frame = new JFrame("GUI");
        final JPanel gui = new JPanel();
        gui.setBorder( new TitledBorder("GPS Viewer") );

        //JToolBar tb = new JToolBar();
        final JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(350, 500));
        panel.setBorder( new TitledBorder("Tracker Data") );
        final JPanel search_panel = new JPanel();
        final JPanel Last_panel = new JPanel();
        final JPanel Search_result = new JPanel();
        Last_panel.setBorder( new TitledBorder("Last Tracker Data") );
        Last_panel.setPreferredSize(new Dimension(400, 50));

        gui.add(panel);
        gui.add(Last_panel, BorderLayout.SOUTH);
        frame.add(gui);
        STextField lastHold = new STextField("");
        STextField last = new STextField("");
        Cell<String> lastT = last.sUserChanges.hold(lastHold.toString());
        STextField All = new STextField("");
        SLabel LAST = new SLabel(lastT);
        Last_panel.add( LAST );
        // Attach a handler method to each stream
        for(Stream<GpsEvent> s : streams){
            s.listen((GpsEvent ev) -> {
                lastHold.setText(last.getText());

                last .selectAll();
                last .replaceSelection(ev.name + "," + ev.latitude +  " , " + ev. longitude+","+ev.altitude);
                All.replaceSelection(ev.toString());

            });
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
            Stream<GpsEvent> AllTracker = s.map((GpsEvent ev) -> {

                return ev;

            });


            SLabel label= new SLabel(Tracker0 );
            panel.add(label, BorderLayout.SOUTH);
            SLabel label1= new SLabel(Tracker1 );
            panel.add(label1,BorderLayout.SOUTH);
            SLabel label2= new SLabel(Tracker2 );
            panel.add(label2);
            SLabel label3= new SLabel(Tracker3 );
            panel.add(label3);
            SLabel label4= new SLabel(Tracker4 );
            panel.add(label4);
            SLabel label5= new SLabel(Tracker5);
            panel.add(label5, BorderLayout.NORTH);
            SLabel label6= new SLabel(Tracker6 );
            panel.add(label6, BorderLayout.CENTER);
            SLabel label7= new SLabel(Tracker7 );
            panel.add(label7, BorderLayout.NORTH);
            SLabel label8= new SLabel(Tracker8 );
            panel.add(label8, BorderLayout.NORTH);
            SLabel label9= new SLabel(Tracker9 );
            panel.add(label9, BorderLayout.CENTER);






        }
        frame.setSize(900, 800);
        frame.setVisible(true);

    }

}
