import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class regOld extends JFrame implements ActionListener
{
	JLabel hn,hn1,plz,lbldate;
	JButton btnok,btncan,btnback;
	JTextField txt;
	String dat;
	String month[]={"Jan","Feb","March","April","May","June","July","Augest","Sept","Oct","Nov","Dec"};
	
	public regOld()
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
		
		    // Label for patients id
		    
		plz = new JLabel("Please,  Enter  Patients  Id:");
		plz.setBounds(45,190,600,100);
		plz.setForeground(Color.darkGray);
		plz.setFont(new Font("Georgia",Font.PLAIN,18));		
		cont.add(plz); 
		
			//Textfield
	  
	  	txt = new JTextField(10);
	  	txt.setBounds(300,230,75,25);
	  	cont.add(txt);
	  	
	  	// code for System date
		
		Calendar cal=Calendar.getInstance();
		dat=cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+
				"-"+cal.get(Calendar.DATE);	
		lbldate = new JLabel("Date:      "+dat);
		lbldate.setBounds(500,120,600,100);
		lbldate.setFont(new Font("Arial",Font.BOLD,14));		
		cont.add(lbldate);    				
	  	
	  	
	  		//  Button
	
	  	btnok=new JButton("OK");
	  	btnok.setBounds(350,400,100,30);
	  	btnok.setVisible(true);
	  	btnok.setEnabled(true);
	  	btnok.addActionListener(this);
	  	cont.add(btnok);
	  	
	  	btncan=new JButton("Cancel");
	  	btncan.setBounds(450,400,100,30);
	  	btncan.setVisible(true);
	  	btncan.setEnabled(true);
	  	btncan.addActionListener(this);
	  	cont.add(btncan);
	  	
	  	btnback=new JButton("Back");
	  	btnback.setBounds(250,400,100,30);
	  	btnback.setVisible(true);
	  	btnback.setEnabled(true);
	  	btnback.addActionListener(this);
	  	cont.add(btnback);
	  		  	
	    getContentPane().add(cont);
		setBounds(0,0,800,600);
		setResizable(false);
		setVisible(true);
		setTitle("Old Patiant Registation");
		
		this.addWindowListener(new WindowAdapter() {
		     public void windowClosing(WindowEvent e) {
				enable(false);
				Exit_Frame ef=new Exit_Frame();
      		
			}
		});
	}
		
			public void actionPerformed(ActionEvent e)
		{
		
			if(e.getActionCommand().equals("OK"))
				{
					Update_Record();
				}
			else if(e.getActionCommand().equals("Back"))
				{
					MainFrame mf = new MainFrame();
				}
			else if(e.getActionCommand().equals("Cancel"))
				{
					HomePage hp = new HomePage();
				}			
			   	
	   }
	   public void Update_Record()
	   {
	   	String url;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false\",\"root\", \"Ppk@3721");
			
			System.out.println("Connection OK");
			String q = "update registration set date=? where pid=?";	
			PreparedStatement st = con.prepareStatement(q);	
			st.setString(1,dat);
			st.setString(2,txt.getText());
			//ResultSet rs = st.executeQuery();
			st.executeUpdate();	

			//rs.close();
			st.close();
			con.close();
			
			//Class.forName("com.mysql.cj.jdbc.Driver");

			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
			
			//System.out.println("Connection OK");
			 		
			//String q="insert into registration(pid,first_name,middle_name,last_name,address,phone,date,age,sex,blood_group,weight) values(?,?,?,?,?,?,?,?,?,?,?)";
			
			//PreparedStatement st = con.prepareStatement(q);
	   }
	   catch(Exception e)
	   {
	   		System.out.println(e);
	   }
	   JOptionPane.showMessageDialog(null,"You have Succesfuly Updated Record","Thanks...!",JOptionPane.PLAIN_MESSAGE);		
}
	public static void main(String args[])
	{
		regOld ro = new regOld();
	}
	   
	
}
