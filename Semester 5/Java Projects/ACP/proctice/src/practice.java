import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Gui implements ActionListener {
    Gui() {
        JFrame j = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JButton b1 = new JButton("Display selected");

        JButton b2 = new JButton("Clear Text Fields");

        JCheckBox c1 = new JCheckBox("Name");
        JCheckBox c2 = new JCheckBox("Company");
        JCheckBox c3 = new JCheckBox("Email");
        JCheckBox c4 = new JCheckBox("Phone");
        JCheckBox c5 = new JCheckBox("Name");
        JCheckBox c6 = new JCheckBox("Company");
        JCheckBox c7 = new JCheckBox("Email");
        JCheckBox c8 = new JCheckBox("Phone");
        JTextField name = new JTextField(10);
        JTextField comp = new JTextField(10);
        JTextField emai = new JTextField(10);
        JTextField phon = new JTextField(10);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1 ) {
                    if (c1.isSelected()) {
                        String n = name.getText();
                        JOptionPane.showMessageDialog(null, n);
                    }
                }

            }
        });

        p1.add(c1);
        p1.add(c2);p1.add(c3);p1.add(c4);
        p1.setSize(50,200);

        p2.add(name);
        p2.add(comp);
        p2.add(emai);
        p2.add(phon);
        p4.add(c5);
        p4.add(c6);
        p4.add(c7);
        p4.add(c7);
        p4.add(c8);
        p3.add(b2);
        p3.setSize(300,50);
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.setLayout(new FlowLayout());
        p1.setLayout(new GridLayout(2,4));
        p2.setLayout(new GridLayout(2,4));
        p4.setLayout(new GridLayout(5,1));
        p2.setSize(50,200);
        p4.setSize(50,200);
        //j.setSize(400,400);
        j.add(p1);
        j.add(p2);
//        j.add(p3);
        j.setLayout(new GridLayout());
        j.add(p3);
        j.setLayout(new FlowLayout(FlowLayout.CENTER));
        j.pack();
        j.setResizable(false);
        j.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == b1)
    }
}


public class practice {
    public static void main(String[] args) {
        Gui g = new Gui();
    }
}