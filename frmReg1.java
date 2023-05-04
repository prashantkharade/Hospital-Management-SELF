import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.lang.*;

public class frmReg1 extends JFrame implements ActionListener 
{
	JLabel hn,hn1,newpat,oldpat;
	JButton btnnew,btnold,btncan,btnback;;
	public frmReg1()
	{
		Container cont=new Container();
		getContentPane();
		setLayout(new BorderLayout());
		
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);			
			
			// Lable for Hospital name
		
		hn = new JLabel("SINHGAD HOSPITAL");
		hn.setBounds(260,0,600,100);
		hn.setForeground(Color.red);
		hn.setFont(new Font("Times New Roman",Font.BOLD,30));		
		cont.add(hn);
		
		hn1 = new JLabel("( General & CIC Unit )");
		hn1.setBounds(392,25,600,100);
		hn1.setForeground(Color.darkGray);
		hn1.setFont(new Font("Times New Roman",Font.BOLD,14));		
		cont.add(hn1);
		
		// label for new & old patient		
		
		newpat = new JLabel("Regisrtation  For  New  Patients:");
		newpat.setBounds(120,200,600,100);
		newpat.setFont(new Font("Georgia",Font.PLAIN,18));		
		cont.add(newpat);
		
		oldpat = new JLabel("Regisrtation  For  Old  Patients:");
		oldpat.setBounds(120,300,600,100);
		oldpat.setFont(new Font("Georgia",Font.PLAIN,18));		
		cont.add(oldpat);
		
		// button 
		
			// Button
		
		btnnew=new JButton("New");
		btnnew.setBounds(400,230,100,40);
		btnnew.setVisible(true);
		btnnew.setEnabled(true);
		btnnew.addActionListener(this);
		cont.add(btnnew);	
		
		btnold=new JButton("Old");
		btnold.setBounds(400,330,100,40);
		btnold.setVisible(true);
		btnold.setEnabled(true);
		btnold.addActionListener(this);
		cont.add(btnold);
		
		
		btncan=new JButton("Cancel");
	  	btncan.setBounds(590,480,100,30);
	  	btncan.setVisible(true);
	  	btncan.setEnabled(true);
	  	btncan.addActionListener(this);
	  	cont.add(btncan);
	  	
	  	btnback=new JButton("Back");
	  	btnback.setBounds(490,480,100,30);
	  	btnback.setVisible(true);
	  	btnback.setEnabled(true);
	  	btnback.addActionListener(this);
	  	cont.add(btnback);
			
			
		getContentPane().add(cont);
		setBounds(0,0,800,600);
		setResizable(false);
		setTitle("Regitration1");
		setVisible(true);
			
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			    {
				   dispose();
				   
      		    }
        });		   
		
	}
	
	 public void actionPerformed(ActionEvent ae) 
    {
    	if(ae.getActionCommand()=="New")
    	{
    		frmReg fr = new frmReg();
    	}
    	else if(ae.getActionCommand()=="Old")    	
    	{
    			regOld ro = new regOld();
	    }
	    else if(ae.getActionCommand()=="Back")    	
    	{
    			MainFrame mf = new MainFrame();
	    }
	    else if(ae.getActionCommand()=="Cancel")    	
    	{
    			HomePage hp = new HomePage();
	    }
	}    
	
	
	public static void main(String args[])
	{
		frmReg1 r1= new frmReg1();
	}

}
