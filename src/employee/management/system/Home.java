
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener
{
    JButton add,view,remove,update;
    public Home()
    {
       setLayout(null);
       
       JLabel heading = new JLabel("Welcome To Employee Details");
        heading.setBounds(550,25,400,40);
        heading.setFont(new Font("serif",Font.BOLD,30));
        heading.setForeground(Color.BLACK);
        add(heading);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);
        
        add = new JButton("Add Employee");
        add.setBounds(570, 85, 150, 35);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("view Employees");
        view.setBounds(740, 85, 150, 35);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("update Employee");
        update.setBounds(570, 150, 150, 35);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("remove Employee");
        remove.setBounds(740, 150, 150, 35);
        remove.addActionListener(this);
        image.add(remove);
        
        
       
       setSize(1020,530);
       setLocation(160,60);
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()== add){
           setVisible(false);
           new AddEmployee();
       } else if(ae.getSource()==view){
           setVisible(false);
           new ViewEmployee();
       }else if(ae.getSource()==update){
           setVisible(false);
           new ViewEmployee();
       }else{
           setVisible(false);
           new RemoveEmployee();
       }
    }
    
    public static void main(String[] args)
    {
        new Home();
    }
}
