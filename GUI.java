import nz.sodium.*;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
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
        JFrame frame = new JFrame("GPS GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Attach a handler method to each stream
        for(Stream<GpsEvent> s : streams){
           //for each stream filter the event with Tracker0 and put in cell string
            Cell<String> Tracker0 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker0")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label= new SLabel(Tracker0 );
            frame.add(label);
                        Cell<String> Tracker1 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker1")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label1= new SLabel(Tracker1 );
            frame.add(label1);
            Cell<String> Tracker2 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker2")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label2= new SLabel(Tracker2 );
            frame.add(label2);
            Cell<String> Tracker3 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker3")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label3= new SLabel(Tracker3 );
            frame.add(label3);
            Cell<String> Tracker4 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker4")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label4= new SLabel(Tracker4 );
            frame.add(label4);
            Cell<String> Tracker5 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker5")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label5= new SLabel(Tracker5 );
            frame.add(label5);
            Cell<String> Tracker6 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker6")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label6= new SLabel(Tracker6 );
            frame.add(label6);
            Cell<String> Tracker7 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker7")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label7= new SLabel(Tracker7 );
            frame.add(label7);
            Cell<String> Tracker8 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker8")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label8= new SLabel(Tracker8 );
            frame.add(label8);
            Cell<String> Tracker9 = s.map((GpsEvent ev) -> {
                if (ev.name.toString().equals("Tracker9")){
                    String output = ev.toString();
                    return output;
                } else {
                    return null;
                }
            }).hold("");
            SLabel label9= new SLabel(Tracker9);
            frame.add(label9);

        }
        frame.setSize(600, 800);
        frame.setVisible(true);
    }

}
