package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener { 
    
    HotelManagementSystem() {
//        setSize(1366, 565);
//        setLocation(100, 100);
        setBounds(100, 100, 1366, 565);
        setLayout(null);
        
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash_1.jpeg"));
        JLabel image = new JLabel(img1);
        image.setBounds(0, -20, 1300, 565);
        add(image);
        
        JLabel txt1 = new JLabel("Welcome's You!");
        txt1.setBounds(480, 250, 500, 90);
        txt1.setForeground(Color.WHITE);
        txt1.setFont(new Font("serif", Font.PLAIN, 48));
        image.add(txt1);
        
        
        JButton next = new JButton("Next");
        next.setBounds(1000, 450, 150, 50);
        next.setBackground(Color.BLUE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        next.setFont(new Font("serif", Font.BOLD, 24));
        image.add(next);
        
        setVisible(true);
        
        while(true){
            txt1.setVisible(false);
            try{
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
            txt1.setVisible(true);
            try{
                Thread.sleep(500);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new HotelManagementSystem();
    }
    
}
