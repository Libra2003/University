import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow
{
JButton jb1,jb2,jb3;

public MyWindow()
{
JFrame jf=new JFrame("Layout Managers");
jf.setSize(500,600);
//JButton jb1,jb2,jb3;
JPanel jp1,jp2;
JTextField jtf;
JComboBox jcb;
JCheckBox jc1,jc2,jc3,jc4;

JButton jb4,jb5,jb6;
	jb1=new JButton("Frame Btton 1");
	jb1.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{
		JOptionPane.showMessageDialog(null,"Btton  1 using Annonmous inner Class");
	}
	}
	);
	/*jb1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae)
	{

	JOptionPane.showMessageDialog(null,"Button One is Clicked");

	}

	}

					);*/
	jb2=new JButton("Frame Btton 2");
	jb2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
			JOptionPane.showMessageDialog(null,"Btton 2 using Annonmous inner Class");
	}
	}
	);
	/*jb2.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{	
	JOptionPane.showMessageDialog(null,"Button Two is Clicked");
	}
	}
	);*/
	jb3=new JButton("Frame Btton 3");
	jb3.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{
	JOptionPane.showMessageDialog(null,"Btton  3 using Annonmous inner Class");
	}
	}
	);	
/*jb3.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent ae)
	{

	JOptionPane.showMessageDialog(null,"Button Three is Clicked Handlin is done in annomous inner class");

	}

	}
	);*/
jf.add(jb1, BorderLayout.EAST);
jf.add(jb2, BorderLayout.WEST);
jf.add(jb3, BorderLayout.CENTER);

jp1=new JPanel();
jp1.setLayout(new GridLayout(2,3,8,15));

jtf=new JTextField(30);
jcb=new JComboBox();
jc1=new JCheckBox("First CheckBox");
jc2=new JCheckBox("Second CheckBox");
jc3=new JCheckBox("Third CheckBox");
jc4=new JCheckBox("Forth CheckBox");
jp1.add(jtf);
jp1.add(jcb);
jp1.add(jc1);
jp1.add(jc2);
jp1.add(jc3);
jp1.add(jc4);
	jf.add(jp1,BorderLayout.NORTH);

	jp2=new JPanel();
	jb4=new JButton("Panel Btton 4");
	jb5=new JButton("PANEL Btton 5");
	jb6=new JButton("PANEL Btton 6");
	jp2.add(jb4);
	jp2.add(jb5);
	jp2.add(jb6);
	jf.add(jp2,BorderLayout.SOUTH);
	jf.setVisible(true);
}
/*private class firstClass implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{

	JOptionPane.showMessageDialog(null,"Button One is Clicked inside firstClass InnerClass");

	}
}

private class secondClass implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{

	JOptionPane.showMessageDialog(null,"Button Two is Clicked inside secondClass InnerClass");

	}
}

private class thirdClass implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{

	JOptionPane.showMessageDialog(null,"Button Three is Clicked inside thirdClass InnerClass");

	}
}*/
/*public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==jb1)
	JOptionPane.showMessageDialog(null,"Button One is Clicked");
	else if(ae.getSource()==jb2)
	JOptionPane.showMessageDialog(null,"Button Two is Clicked");
	else if(ae.getSource()==jb3)
	JOptionPane.showMessageDialog(null,"Button Three is Clicked");

}*/
public static void main(String s[])
{
MyWindow mw=new MyWindow();
}
}