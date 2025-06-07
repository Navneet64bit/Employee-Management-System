
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener
{
    Splash()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(250,50,1000,80);
        heading.setFont(new Font("serif",Font.PLAIN,50));
        heading.setForeground(Color.red);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1050,500);
        add(image);
        
        JButton clickhere = new JButton("Mammy");
        clickhere.setBounds(300,400,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
       
        
        setSize(970,550);
        setLocation(150,50);
        setVisible(true);
        
        while(true)
        {
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch (Exception e)
            {
                
            }
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }catch (Exception e)
            {
                
            }
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    public static void main(String args[])
    {
        new Splash();
    }
}
