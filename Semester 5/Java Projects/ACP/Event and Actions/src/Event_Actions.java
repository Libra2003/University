import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event_Actions
{
    JButton jb1,jb2,jb3;

    public  Event_Actions()
    {
        JFrame jf=new JFrame("Layout Managers");
        jf.setSize(500,600);
        JButton jb1,jb2,jb3;
//        JPanel jp1,jp2;
//        JTextField jtf;
//        JComboBox jcb;
//        JCheckBox jc1,jc2,jc3,jc4;

        JButton jb4,jb5,jb6;
        jb1=new JButton("Frame Btton 1");


        jb2=new JButton("Frame Btton 2");

        jb3=new JButton("Frame Btton 3");

        jf.add(jb1, BorderLayout.EAST);
        jb1.setBounds(20,100,50,50);
        jf.add(jb2, BorderLayout.WEST);
        jf.add(jb3, BorderLayout.CENTER);

//        jp2=new JPanel();

        jf.setVisible(true);

        //Second Method
 class firstClass implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Button One is Clicked inside firstClass InnerClass");

    }
}

        //First Method
//    public void actionPerformed(ActionEvent ae)
//    {
//        if(ae.getSource()==jb1)
//            JOptionPane.showMessageDialog(null,"Button One is Clicked");
//        else if(ae.getSource()==jb2)
//            JOptionPane.showMessageDialog(null,"Button Two is Clicked");
//        else if(ae.getSource()==jb3)
//            JOptionPane.showMessageDialog(null,"Button Three is Clicked");
//
//    }

        //Third Process
//        jb1.addActionListener(new ActionListener() {
//            public void actionPerformed (ActionEvent ae)
//            {
//
//                JOptionPane.showMessageDialog(null, "Button One is Clicked");
//
//            }
//
//        });
//        jb2.addActionListener(new ActionListener() {
//            public void actionPerformed (ActionEvent ae)
//            {
//
//                JOptionPane.showMessageDialog(null, "Button two is Clicked");
//
//            }
//
//        });
//        jb3.addActionListener(new ActionListener() {
//            public void actionPerformed (ActionEvent ae)
//            {
//
//                JOptionPane.showMessageDialog(null, "Button three is Clicked");
//
//            }
//
//        });

        }

    public static void main(String args[])
    {

        Event_Actions mw=new  Event_Actions();
    }

};