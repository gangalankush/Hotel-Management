
package hotel.management.system;

import javax.swing.*;
    import java.awt.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener{
    
    JButton newCustomer, rooms, department, allEmployee, manager, customers, searchRoom, update, roomStatus, checkout, logout;
    Reception(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        newCustomer = new JButton("New Constumer Form"); 
        newCustomer.setBounds(10,30, 200, 30);
        newCustomer.setForeground(Color.BLUE);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        rooms = new JButton("Rooms"); 
        rooms.setBounds(10, 70, 200, 30);
        rooms.setForeground(Color.BLUE);
        rooms.addActionListener(this);
        add(rooms);
        
        department = new JButton("Department"); 
        department.setBounds(10, 110, 200, 30);
        department.setForeground(Color.BLUE);
        department.addActionListener(this);
        add(department);
        
        allEmployee = new JButton("All Employee"); 
        allEmployee.setBounds(10, 150, 200, 30);
        allEmployee.setForeground(Color.BLUE);
        allEmployee.addActionListener(this);
        add(allEmployee);
        
        customers = new JButton("Customer Info"); 
        customers.setBounds(10, 190, 200, 30);
        customers.setForeground(Color.BLUE);
        customers.addActionListener(this);
        add(customers);
        
        manager = new JButton("Manager Info"); 
        manager.setBounds(10, 230, 200, 30);
        manager.setForeground(Color.BLUE);
        manager.addActionListener(this);
        add(manager);
        
        checkout = new JButton("Checkout"); 
        checkout.setBounds(10, 270, 200, 30);
        checkout.setForeground(Color.BLUE);
        checkout.addActionListener(this);
        add(checkout);
        
        update = new JButton("Update Status"); 
        update.setBounds(10, 310, 200, 30);
        update.setForeground(Color.BLUE);
        update.addActionListener(this);
        add(update);
        
        roomStatus = new JButton("Update Room Status"); 
        roomStatus.setBounds(10, 350, 200, 30);
        roomStatus.setForeground(Color.BLUE);
        roomStatus.addActionListener(this);
        add(roomStatus);
        
        searchRoom = new JButton("Search Rooms"); 
        searchRoom.setBounds(10, 390, 200, 30);
        searchRoom.setForeground(Color.BLUE);
        searchRoom.addActionListener(this);
        add(searchRoom);
        
        logout = new JButton("Logout"); 
        logout.setBounds(10, 430, 200, 30);
        logout.setForeground(Color.BLUE);
        logout.addActionListener(this);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/rep.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(150, 20, 800, 470);
        add(image);
        
        setBounds(350, 200, 800, 570);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == newCustomer){
            setVisible(false);
            new AddCustomer();
        } else if(ae.getSource() == rooms){
            setVisible(false);
            new Room();
        } else if (ae.getSource() == department){
            setVisible(false);
            new Department();
        } else if (ae.getSource() == allEmployee){
            setVisible(false);
            new EmployeeInfo();
    }else if (ae.getSource() == manager){
            setVisible(false);
            new ManagerInfo();
    }
        else if (ae.getSource() == customers){
            setVisible(false);
            new CustomerInfo();
    }
        else if (ae.getSource() == searchRoom){
            setVisible(false);
            new SearchRoom();
    } else if (ae.getSource() == update){
            setVisible(false);
            new UpdateCheck();
    } else if (ae.getSource() == roomStatus){
        setVisible(false);
        new UpdateRoom();
    } else if (ae.getSource() == checkout){
        setVisible(false);
        new Checkout();
    } else if (ae.getSource() == logout){
        setVisible(false);
        new Logout();
    }
    }
    
        
    public static void main(String[] args){
        new Reception();
    }
}
