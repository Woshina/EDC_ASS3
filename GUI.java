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

        }
        frame.setSize(600, 800);
        frame.setVisible(true);
    }

}