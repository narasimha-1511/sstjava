import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class ClicksCount implements ActionListener{
 
   int count = 0;// store number of clicks
 
   ClicksCount(){
       JFrame frame = new JFrame();
       JButton button1 = new JButton("Activate");
       JButton button2 = new JButton("Button2");
       button1.addActionListener(this);
 
       frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
       frame.add(button1);
       frame.add(button2);
       frame.getRootPane().setDefaultButton(button1); // sets default button
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(450,450);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
   }
 
   public void actionPerformed(ActionEvent e) {
       count++;
       System.out.println("You have clicked the ACTIVE button " + count + " times");
   }
      
   public static void main(String args[]){
 
       ClicksCount Clicks = new ClicksCount();
    }
}