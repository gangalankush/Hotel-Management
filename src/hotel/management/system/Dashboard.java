
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    Dashboard(){
        setBounds(0, 0, 1550, 1000);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Main.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_FAST);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);
        add(image);
        
        JLabel text = new JLabel("The Majestic Palace");
        text.setBounds(1000, 80, 1000, 50);
        text.setFont(new Font("Tahoma",Font.PLAIN, 46));
        text.setForeground(Color.DARK_GRAY);
        image.add(text);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1550, 30);
        image.add(mb);
        
        JMenu hotel = new JMenu("Hotel Management");
        mb.add(hotel);
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        
        JMenu admin = new JMenu("Admin");
        //admin.setForeground(Color.red);
        mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("Add Employee");
        addemployee.addActionListener(this);
        admin.add(addemployee);
        
        JMenuItem addrooms = new JMenuItem("Add Rooms");
        addrooms.addActionListener(this);
        admin.add(addrooms);
        
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if ( ae.getActionCommand().equals("Add Employee")){
            new AddEmployee();
        } else if (ae.getActionCommand().equals("Add Rooms")){
            new AddRooms();
        } else if ( ae.getActionCommand().equals("RECEPTION")){
            new Reception();
        }
    }
    
    public static void main(String[] args){
        new Dashboard();
    }
}
