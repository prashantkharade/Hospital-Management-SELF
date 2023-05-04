import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.lang.*;

class frmReg extends JFrame implements ActionListener 
{
int i=0;
	JTextField txtpid,txtfname,txtlname,txtmname,txtadd,txtphone,txtage,txtweight,txtsex,txtbg,txtdate;
	JLabel lblfn,lblmn,lblln,lblage,lblid,lblsex,lblmale,lblfemale,lbladd,lblpho,lblbg,lblwt,lbldate,hn,hn1;
	JButton cmdSub,cmdBack,cmdExit,cmdReset;
	JRadioButton rb1,rb2;
	ButtonGroup grp;
	String dat;
	String month[]={"Jan","Feb","March","April","May","June","July","Augest","Sept","Oct","Nov","Dec"};
	public frmReg()
	{
		Container cont=new Container();
		getContentPane();
		setLayout(new BorderLayout());
		
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);			
		
		// Lable for Hospital name
		
		hn = new JLabel(" SINHGAD HOSPITAL");
		hn.setBounds(260,0,600,100);
		hn.setForeground(Color.red);
		hn.setFont(new Font("Times New Roman",Font.BOLD,30));		
		cont.add(hn);
		
		hn1 = new JLabel("( General & CIC Unit )");
		hn1.setBounds(392,25,600,100);
		hn1.setForeground(Color.darkGray);
		hn1.setFont(new Font("Times New Roman",Font.BOLD,14));		
		cont.add(hn1);		
		
		// label for id
		
		lblid = new JLabel("Patient ID:");
		lblid.setBounds(120,90,600,100);
		lblid.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblid);
		
		// TextField for id
		
		txtpid = new JTextField(10);
		txtpid.setBounds(250,130,100,25);
		cont.add(txtpid);
		
		// label for first name
		
		lblfn = new JLabel("First Name:");
		lblfn.setBounds(120,150,600,100);
		lblfn.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblfn);
		
		//TextField For fn
		
		txtfname = new JTextField(10);
		txtfname.setBounds(250,190,100,25);
		cont.add(txtfname);
		
		// label for middle name
			
		lblmn = new JLabel("Middle Name:");
		lblmn.setBounds(420,150,600,100);
		lblmn.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblmn);
		
		// TextField for mn
		
		txtmname = new JTextField(10);
		txtmname.setBounds(530,190,100,25);
		cont.add(txtmname);
		
		// label for last name
				
		lblln = new JLabel("Last Name:");
		lblln.setBounds(120,210,600,100);
		lblln.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblln);
		
		// TextField for ln
		
		txtlname = new JTextField(10);
		txtlname.setBounds(250,250,100,25);
		cont.add(txtlname);
		
		// Label for address
		
		lbladd = new JLabel("Address:");
		lbladd.setBounds(420,210 ,600,100);
		lbladd.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lbladd);
		
		// Text Field for add
		
		txtadd = new JTextField(10);
		txtadd.setBounds(530,250,100,25);
		cont.add(txtadd);
		
		// label for phone no
		 
		lblpho = new JLabel("Phone Number:");
		lblpho.setBounds(120,270,600,100);
		lblpho.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblpho);
		
		// Text Field for Phone No.
		
		txtphone = new JTextField(10);
		txtphone.setBounds(250,310,100,25);
		cont.add(txtphone);
		
		// code for System date
		
		Calendar cal=Calendar.getInstance();
		dat=cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+
						"-"+cal.get(Calendar.DATE);	
		lbldate = new JLabel("Date:      "+dat);
		lbldate.setBounds(420,90,600,100);
		lbldate.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lbldate);    				
	
		// label for age name
	
		lblage = new JLabel("Age:");
		lblage.setBounds(420,270,600,100);
		lblage.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblage);
		
		// TextField for age
		
		txtage = new JTextField(10);
		txtage.setBounds(530,310,100,25);
		cont.add(txtage);
		
		// label for sex
			
		lblsex = new JLabel("Sex:");
		lblsex.setBounds(120,330 ,600,100);
		lblsex.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblsex); 
		
		// Text Field for Sex
		
		txtsex = new JTextField(10);
		txtsex.setBounds(250,370,100,25);
		cont.add(txtsex);  
		

		// Label for blood group
		
		lblbg = new JLabel("Blood Group:");
		lblbg.setBounds(420,330,600,100);
		lblbg.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblbg);
		
		
		// Text Field for Blood Group
		
		txtbg = new JTextField(10);
		txtbg.setBounds(530,370,100,25);
		cont.add(txtbg);
			
		// Label for weigth
	
		lblwt = new JLabel("Weight:");
		lblwt.setBounds(120,390,600,100);
		lblwt.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lblwt);
	    
	   // Text Field for Weight
	     	
		txtweight = new JTextField(10);
		txtweight.setBounds(250,430,100,25);
		cont.add(txtweight);
		



		// Button
		
		cmdBack=new JButton("Back");
		cmdBack.setBounds(200,490,100,40);
		cmdBack.setVisible(true);
		cmdBack.setEnabled(true);
		cmdBack.addActionListener(this);
		cont.add(cmdBack);	
		
		cmdSub=new JButton("Submit");
		cmdSub.setBounds(300,490,100,40);
		cmdSub.setVisible(true);
		cmdSub.setEnabled(true);
		cmdSub.addActionListener(this);
		cont.add(cmdSub);
		
		cmdReset=new JButton("Reset");
		cmdReset.setBounds(400,490,100,40);
		cmdReset.setVisible(true);
		cmdReset.setEnabled(true);
		cmdReset.addActionListener(this);
		cont.add(cmdReset);		
		
		cmdExit=new JButton("Exit");
		cmdExit.setBounds(500,490,100,40);
		cmdExit.setVisible(true);
		cmdExit.setEnabled(true);
		cmdExit.addActionListener(this);
		cont.add(cmdExit);	                       
		
	
		
		getContentPane().add(cont);
		setBounds(0,0,800,600);
		setResizable(false);
		setTitle("Regitration Form");
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
    	if(ae.getActionCommand()=="Submit")
    	 {	
    	 	Add_Record();
    	 }    	
        else if(ae.getActionCommand()=="Back")
    	 {
    		 MainFrame hp = new MainFrame();
    	 }  
    	else if(ae.getActionCommand()=="Exit")  	 
    	 {
    		 Exit_Frame ef=new Exit_Frame();
    	 }
    	else if(ae.getActionCommand()=="Reset")  	 
    	 {
    		 clearText();
    	 }
    	 
    }
    
    
    // to clear the text boxes
    
    void clearText()
    {
    	txtpid.setText("");
    	txtfname.setText("");
    	txtmname.setText("");
    	txtlname.setText("");
    	txtadd.setText("");
    	txtphone.setText("");
    	txtsex.setText("");
    	txtage.setText("");
    	txtweight.setText("");
    	txtbg.setText("");
    }
    
    //add record in database
    
    public void Add_Record()
	{
   		
		String url;
		try
		{
			String str=txtfname.getText();
			char ch;
			for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i);
				if(Character.isDigit(ch))
				{
					 JOptionPane.showMessageDialog(null,"Please Enter Correct First Name","Eroor",JOptionPane.ERROR_MESSAGE);		
					 txtfname.setText("");
					 return;
			    }
			}
			
			String str1 = txtmname.getText();
			for(int i=0;i<str1.length();i++)
			{
				ch=str1.charAt(i);
				if(Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Middle Name","Eroor",JOptionPane.ERROR_MESSAGE);		
					txtmname.setText("");
					return;
				}
			} 
		
			String str2 = txtlname.getText();
			for(int i=0;i<str2.length();i++)
			{
				ch=str2.charAt(i);
				if(Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Last Name","Eroor",JOptionPane.ERROR_MESSAGE);		
					txtlname.setText("");
					return;
				}
			} 
			
			String str3 = txtadd.getText();
			for(int i=0;i<str3.length();i++)
			{
				ch=str3.charAt(i);
				if(Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Address","Eroor",JOptionPane.ERROR_MESSAGE);		
					txtadd.setText("");
					return;
				}
			} 
			
			String str4 = txtphone.getText();
			for(int i=0;i<str4.length();i++)
			{
				ch=str4.charAt(i);
				if(!Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Phone Number","Eroor",JOptionPane.ERROR_MESSAGE);		
					txtphone.setText("");
					return;
				}
			} 
			
			String str5 = txtage.getText();
			for(int i=0;i<str5.length();i++)
			{
				ch=str5.charAt(i);
				if(!Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Age","Eroor",JOptionPane.ERROR_MESSAGE);		
					txtage.setText("");
					return;
				}
			} 
			
			String str6 = txtsex.getText();
			for(int i=0;i<str6.length();i++)
			{
				ch=str6.charAt(i);
				if(Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Sex","Eroor",JOptionPane.ERROR_MESSAGE);		
					txtsex.setText("");
					return;
				}
			} 
			
			String str7 = txtbg.getText();
			for(int i=0;i<str7.length();i++)
			{
				ch=str7.charAt(i);
				if(Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Blood Group","Eroor",JOptionPane.ERROR_MESSAGE);		
					txtbg.setText("");
					return;
				}
			}
			
			String str8 = txtweight.getText();
			for(int i=0;i<str8.length();i++)
			{
				ch=str8.charAt(i);
				if(!Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Weight","Eroor",JOptionPane.ERROR_MESSAGE);		
					txtweight.setText("");
					return;
				}
			} 
			 
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
			
			System.out.println("Connection OK");
			 		
			String q="insert into registration(pid,first_name,middle_name,last_name,address,phone,date,age,sex,blood_group,weight) values(?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement st = con.prepareStatement(q);
	
			
			st.setString(1,txtpid.getText());
			st.setString(2,txtfname.getText());
			st.setString(3,txtmname.getText());
			st.setString(4,txtlname.getText());
			st.setString(5,txtadd.getText());
			st.setString(6,txtphone.getText());
			st.setString(7,dat);
			st.setString(8,txtage.getText());
			st.setString(9,txtsex.getText());
			st.setString(10,txtbg.getText());
			st.setString(11,txtweight.getText());
				
			st.executeUpdate();
			
			msgbox m=new msgbox("Values Inserted","Error",null);      
			
			st.close();
			con.close();
			System.out.println("Connection close");
			
		}
		
		catch(Exception e)
		{
				msgbox m=new msgbox(e.toString(),"Error",null);
			
		}
		
		JOptionPane.showMessageDialog(null,"You Have Sucessfully Added Record","Thanks...!",JOptionPane.PLAIN_MESSAGE);		
		System.out.println(i);										
							
	}
    
	
	public static void main(String args[])
	 {
		frmReg fr = new frmReg();
	 }
 
}
       