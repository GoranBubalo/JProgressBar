import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame;
    JProgressBar bar;

    ProgressBarDemo(){


        frame = new JFrame();
        bar = new JProgressBar(0,100);

        bar.setValue(0);
        bar.setBounds(0,0,450,50);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setStringPainted(true);
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true);


        frame.add(bar);

        fill();

    }
    public  void fill(){
        int counter = 100;
        while (counter>0){
            bar.setValue(counter);
           try{
            Thread.sleep(50);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
           counter -= 1;
        }
        bar.setString("You Have Died");
    }
}
