import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class javaapplet extends Applet implements ActionListener
{
	int value = 0;
	int a;
	long f;
	Button com = new Button();
	TextField t=new TextField(10);
	Label lb1=new Label();
	Label lb2=new Label();
	String str1,str;
	public void init()
	{
		lb1.setText("Enter the number in the box");
		add(lb1);
		add(t);
		add(com);
		t.setText("0");	
		com.setLabel("COMPUTE");
		com.addActionListener(this);
	}
	public void paint (Graphics g)
    {
    }
	public void actionPerformed(ActionEvent e)
	{
		f=1;
		try
        {
            str1=t.getText();
			a=Integer.parseInt(str1);
        }
        catch(Exception x)
        {
        }
		remove(com);
		remove(lb1);
        lb2.setText("Factorial is :");
		add(lb2);
        for(int i=1;i<=a;i++)
			f=f*i;
        str=String.valueOf(f);
		t.setText(str);
		add(t);
	}
}
