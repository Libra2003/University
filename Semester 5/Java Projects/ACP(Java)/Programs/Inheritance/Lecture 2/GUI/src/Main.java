import javax.swing.*;
import java.awt.*;

public class Main {
    static void sucks() {
        JFrame MF = new JFrame("Main Menu");
        MF.setSize(400, 500);
        JButton fb, sb;
        JPanel fp;
        JTextField jtf;
        JComboBox jcb;
        JCheckBox fcb, scb;

        fb = new JButton("Enter");
        sb = new JButton("cancel");
        MF.add(fb, BorderLayout.EAST);
        MF.add(sb, BorderLayout.WEST);

        fp = new JPanel();
        fp.setLayout(new GridLayout(2, 3));

        jtf = new JTextField(15);
        jcb = new JComboBox();
        fcb = new JCheckBox("Teacher");
        scb = new JCheckBox("Staff");

        fp.add(jtf);
        fp.add(jcb);
        fp.add(scb);
        fp.add(fp, BorderLayout.CENTER);
        MF.setVisible(true);
    }

    public static void main(String[] args) {
        sucks();

    }
}