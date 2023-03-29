

package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Logout extends JFrame implements ActionListener{
    
    JButton yes, no;
    Logout(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Confirm");
        text.setBounds(120, 20, 100, 30);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(text);
        
        yes = new JButton("YES");
        yes.setBackground(Color.WHITE);
        yes.setForeground(Color.BLUE);
        yes.setBounds(40, 150, 100, 30);
        yes.addActionListener(this);
        add(yes);
        
        no = new JButton("NO");
        no.setBackground(Color.WHITE);
        no.setForeground(Color.BLUE);
        no.setBounds(170, 150, 100, 30);
        no.addActionListener(this);
        add(no);
        
        
        setBounds(200, 200, 300, 300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == yes){
                setVisible(false);
                dispose();
            } else if(ae.getSource() == no) {
                setVisible(false);
                new Reception();
            }
        }
    
    
    public static void main(String[] args){
        new Logout();
    }
}
