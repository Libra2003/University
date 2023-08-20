import javax.swing.JOptionPane;
class Patient
{
    String Name;
    String Second_Name;
    int Age;
    void SetRecord()
    {
        Name=JOptionPane.showInputDialog( "Enter Name:" );
        Second_Name=JOptionPane.showInputDialog( "Enter Second_Name:" );
        String Age1 =JOptionPane.showInputDialog( "Enter Age:" );
        Age = Integer.parseInt( Age1 );
    }
    void ShowRecord()
    {
        JOptionPane.showMessageDialog(null,"Name:" +Name);
        JOptionPane.showMessageDialog(null,"Second_Name:" +Second_Name);
        JOptionPane.showMessageDialog(null,"Age:" +Age);
    }
    public static void main(String []s)
    {
        Patient In=new Patient();
        In.SetRecord();
        In.ShowRecord();

    }

}