import java.awt.Color;
import javax.swing.*;

public class gold {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("MY APP");
        frame1.setSize(400,500);
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setLocation(10, 10);
        frame1.getContentPane().setBackground(new Color(204, 255, 255));

        JButton button = new JButton("Click me for a Quote!");
        button.setBounds(100, 100, 200, 80);
        button.setVisible(true);
        button.setBackground(new Color(178 , 202 , 255));
        frame1.add(button);
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame1 , "WELCOME TO MY WORLD!"));
        
        JButton button1 = new JButton("Click to Register");
        button1.setBounds(100, 200, 200, 80);
        button1.setBackground(new Color(250, 240, 220));
        frame1.add(button1);
        button1.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(frame1, "Enter your Password : ");
        if(name != null && name.equals("PASSWORD"))
            JOptionPane.showMessageDialog(frame1 , "Lock Opened");
        else    
            JOptionPane.showMessageDialog(frame1 , "Wrong Password");
            
        });
    
    
    }
    
}
