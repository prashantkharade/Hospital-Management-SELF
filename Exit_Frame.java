import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.color.*;

class Exit_Frame extends JFrame implements ActionListener
{
	Font fn,ft;
	String msg;
	JLabel l1;	
	JLabel l2,l3;
	Color c1,c2,c3,c4;	
	JButton b1;
	
	Exit_Frame()
	{
		JFrame f=new JFrame();
	
		Container c=new Container();
		f.getContentPane();
		f.setLayout(new BorderLayout());
		
		f.setLocation(200,100);
		f.setTitle("Thanks...!");
		
		f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
        f.setAlwaysOnTop(true);
		f.setFocusable(true);
		
		
		fn=new Font("Monotype Corsiva",Font.ITALIC,60);
		ft=new Font("Georgia",Font.BOLD+Font.ITALIC,18);
		
		c1=new Color(255,100,100);
		c2=new Color(100,100,255);
		c3=new Color(50,200,100);
	
		l1=new JLabel("Thanks...");
		l1.setBounds(140,20,300,100);
		l1.setFont(fn);
		l1.setForeground(c1);
		c.add(l1);
		 
		l2=new JLabel("Design And Developed By:");
		l2.setBounds(42,70,400,150);
		l2.setFont(ft);
		l2.setForeground(c2);
		c.add(l2);
		
		l3=new JLabel("Prashant kharade ");
		l3.setBounds(42,120,400,150);		
		l3.setFont(ft);
		l3.setForeground(c2);
		c.add(l3);
		
			
		b1=new JButton("OK");
		b1.setBounds(170,250,80,40);
		b1.setMnemonic('k');
		b1.setFont(ft);
		b1.setBackground(c3);
		b1.addActionListener(this);
		c.add(b1);
		
		f.getContentPane().add(c);
		f.setBounds(200,150,450,350);
		f.setResizable(false);
		f.setVisible(true);
	
			
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("OK"))
		{
			System.exit(0);
		}
	}
	
}

