import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.util.List;

public class MainFrame extends JFrame implements ActionListener
{
	
	JPanel p,component;
	JLabel l1,hn,hn1;
    JButton cmdReg,cmdBill,cmdExit,cmdRpt,cmdSearch,cmdBack,cmdHelp;

	 
	public MainFrame()
	{
		
		Container cont=new Container();
		getContentPane();
		setLayout(new BorderLayout());
	    setTitle("Main Frame");   
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
	  	  	
	//  Button
	
	  	cmdReg=new JButton("Registration");
	  	cmdReg.setBounds(105,250,250,40);
	  	cmdReg.setVisible(true);
	  	cmdReg.setEnabled(true);
	  	cmdReg.addActionListener(this);
	  	cont.add(cmdReg);
		
		cmdSearch=new JButton("Search");
	  	cmdSearch.setBounds(410,250,250,40);
	  	cmdSearch.setVisible(true);
	  	cmdSearch.setEnabled(true);
	  	cmdSearch.addActionListener(this);
	  	cont.add(cmdSearch);
	  	
	  	cmdBill=new JButton("Bill");
	  	cmdBill.setBounds(105,300,250,40);
	  	cmdBill.setVisible(true);
	  	cmdBill.setEnabled(true);
	  	cmdBill.addActionListener(this);
	  	cont.add(cmdBill);	
	  	
	  	cmdRpt=new JButton("Report");
	  	cmdRpt.setBounds(410,300,250,40);
	  	cmdRpt.setVisible(true);
	  	cmdRpt.setEnabled(true);
	  	cmdRpt.addActionListener(this);
	  	cont.add(cmdRpt);
	  	
	  	cmdHelp=new JButton("Help");
	  	cmdHelp.setBounds(105,350,250,40);
	  	cmdHelp.setVisible(true);
	  	cmdHelp.setEnabled(true);
	  	cmdHelp.addActionListener(this);
	  	cont.add(cmdHelp);
	  	
	  	cmdBack=new JButton("Back");
		cmdBack.setBounds(410,350,250,40);
		cmdBack.setVisible(true);
		cmdBack.setEnabled(true);
		cmdBack.addActionListener(this);
		cont.add(cmdBack);		
	  	
	  	cmdExit=new JButton("Exit");
	  	cmdExit.setBounds(260,450,250,40);
	  	cmdExit.setVisible(true);
	  	cmdExit.setEnabled(true);
	  	cmdExit.addActionListener(this);
	  	cont.add(cmdExit);		  	
	  	
	  
	  	
	    // Label
	    
	    hn = new JLabel("SINHGAD HOSPITAL");
		hn.setBounds(260,0,600,100);
		hn.setForeground(Color.red);
		hn.setFont(new Font("Times New Roman",Font.BOLD,30));		
		cont.add(hn);
		
	    hn1 = new JLabel("( General & CIC Unit )");
		hn1.setBounds(392,25,600,100);
		hn1.setForeground(Color.gray);
		hn1.setFont(new Font("Times New Roman",Font.BOLD,14));		
		cont.add(hn1);		
	     
		l1 = new JLabel("Please Select Category:");
		l1.setBounds(45,160,600,100);
		l1.setForeground(Color.darkGray);
		l1.setFont(new Font("Georgia",Font.BOLD,18));		
		cont.add(l1);
		
		getContentPane().add(cont);
		setBounds(0,0,800,600);
		setResizable(false);
		setVisible(true);
		
	  
	  this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				enable(false);
				Exit_Frame ef=new Exit_Frame();
      		
			}
		});

	}


    public void actionPerformed(ActionEvent ae) 
    {
    	if(ae.getActionCommand()=="Registration")
    	{
    		frmReg1 r1= new frmReg1();
    	}
    	else if(ae.getActionCommand()=="Bill")    	
    	{
    		frmBill b = new frmBill();
    	}
    	else if(ae.getActionCommand()=="Search")    	
    	{
    		frmSearch ser = new frmSearch();
    	}
    	else if(ae.getActionCommand()=="Report")    	
    	{
    	   frmReport fr = new frmReport();
    	}
    	else if(ae.getActionCommand()=="Help")    	
    	{
    			{	
				try{
					Runtime r=Runtime.getRuntime();
					r.exec("C:\\Program Files\\Internet Explorer\\introduction.html");							
				}catch(Exception e){};
			}
    	}
    
        else if(ae.getActionCommand()=="Back")
    	{
    		HomePage hp= new HomePage();
    	}  
    	else if(ae.getActionCommand()=="Exit")    	
    	{
    		Exit_Frame f=new Exit_Frame();
    	}
    }
			
	public static void main(String args[])
	{
		MainFrame mf = new MainFrame();
	}
 } 
 
