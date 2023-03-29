
package hotel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.awt.event.*;

public class UpdateRoom extends JFrame implements ActionListener{
    
    Choice ccustomer;
    JTextField tfroom, tfavailable, tfstatus;
    JButton check, update, back;
    
    UpdateRoom() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Update Room Status");
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        text.setBounds(30, 20, 250, 30);
        add(text);
        
        ccustomer = new Choice();
        ccustomer.setBounds(200, 80, 150, 25);
        add(ccustomer);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                ccustomer.add(rs.getString("number"));
            }
                    
        } catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblid = new JLabel("Customer Id");
        lblid.setBounds(30, 80, 100, 20);
        add(lblid);
        
        JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(30, 120, 100, 20);
        add(lblroom);
        
        
        tfroom = new JTextField();
        tfroom.setBounds(200, 120, 150, 25);
        add(tfroom);
        
        
        JLabel lblavailable = new JLabel("Availablility");
        lblavailable.setBounds(30, 160, 100, 20);
        add(lblavailable);
        
        
        tfavailable = new JTextField();
        tfavailable.setBounds(200, 160, 150, 25);
        add(tfavailable);
        
        
        JLabel lblstatus = new JLabel("Cleaning Status");
        lblstatus.setBounds(30, 200, 100, 20);
        add(lblstatus);
        
        
        tfstatus= new JTextField();
        tfstatus.setBounds(200, 200, 150, 25);
        add(tfstatus);
        
        
        
        check = new JButton("Check");
        check.setBackground(Color.WHITE);
        check.setForeground(Color.BLACK);
        check.setBounds(30, 300, 100, 30);
        check.addActionListener(this);
        add(check);
        
        update = new JButton("Update");
        update.setBackground(Color.WHITE);
        update.setForeground(Color.BLACK);
        update.setBounds(150, 300, 100, 30);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
         back.setBackground(Color.WHITE);
         back.setForeground(Color.BLACK);
         back.addActionListener(this);
         back.setBounds(270, 300, 100, 30);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(350, 10, 200, 200);
        add(image);
        
        
        setBounds(300, 200, 980, 400);
        setVisible(true);
        
     
}
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == check) {
            String id = ccustomer.getSelectedItem();
            String query = "select * from customer where number = '"+id+"'";
            try {
                Conn c = new Conn();
                
                 ResultSet rs = c.s.executeQuery(query);
                 while(rs.next()){
                     tfroom.setText(rs.getString("room"));
                      
                      
//                      
                 }
                 
                 ResultSet rs2 = c.s.executeQuery("select * from room where roomnumber = '"+tfroom.getText() +"'");
                 while(rs2.next()){
                         tfavailable.setText(rs2.getString("availability"));
                     tfstatus.setText(rs2.getString("cleaning_status"));
                    
                 }
            } catch (Exception e) {
                e.printStackTrace();
                
            }
           
        } else if(ae.getSource() == update) {
            String number = ccustomer.getSelectedItem();
            String room = tfroom.getText();
            String available = tfavailable.getText();
            String status = tfstatus.getText();
          
            
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate("update room set availability = '"+available+"',cleaning_status = '"+status+"' where roomnumber = '"+room+ "'");
                
                JOptionPane.showMessageDialog(null, "Data Update Successfully");
                
                setVisible(false);
                new Reception();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
            new Reception();
            
        }
    }
    
    public static void main (String[] args){
        new UpdateRoom();
        
    }
  
    
}
