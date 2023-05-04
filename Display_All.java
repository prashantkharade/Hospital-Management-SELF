import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Display_All extends JFrame 
{
	
	public Display_All()
	{
		Container cont=new Container();
		getContentPane();
		setTitle("Display All");   
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
	  	  	
	  	getContentPane().add(cont);
		setBounds(0,0,800,600);
		setResizable(false);
		setVisible(true);
	
	    this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				enable(false);
				frmReport fr = new frmReport();
      		
			}
		});      
		  	
	}
	
	 public void paint(Graphics g)
	 {
	 	g.drawString("Report  of  All  Patients",300,75);
	 	g.drawLine(30,100,770,100);  // 1'st horizontal
	 	g.drawLine(30,100,30,575);   //1 vertical
	 	g.drawLine(770,100,770,575);  // 2 verti
	 	g.drawLine(30,575,770,575);    // bottom
	 	g.drawLine(80,100,80,575);
	 	g.drawString("Pid",50,120);
	 	g.drawLine(300,100,300,575);
	 	g.drawString("Name",180,120);
	 	g.drawLine(380,100,380,575);
	 	g.drawString("Address",315,120);
	 	g.drawLine(475,100,475,575);
	 	g.drawString("Phone No",400,120);
	 	g.drawLine(580,100,580,575);
	 	g.drawString("Date",510,120);
	 	g.drawLine(640,100,640,575);
	 	g.drawString("Age",600,120);
	 	g.drawLine(700,100,700,575);
	 	g.drawString("Sex",655,120);
	 	g.drawString("Bill",720,120);
	 	g.drawLine(30,130,770,130);
	 	
	 	try
	 		{
//	 		String url;    	 
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
//			q = "select pid,last_name,first_name,middle_name from registration where last_name=?";
//			PreparedStatement st=con.prepareStatement(q);
//			st.setString(1,txt.getText());
//			ResultSet rs = st.executeQuery();
			
			String no="0";
			String url;    	 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
			String q1 = "select pid,last_name,first_name,middle_name,address,phone,date,age,sex from registration"; 
			PreparedStatement st1=con.prepareStatement(q1);
			ResultSet rs1 = st1.executeQuery();
			
			int i=50,j=150;
			int k=90,l=150;
			int m=175,n=150;
			int p=240,q=150;
			int r=310,s=150;
			int u=395,v=150;
			int w=490,x=150;
			int y=600,z=150;
			int a=655,b=150;
			int c=715,d=150;
			
			
			while(rs1.next())
			{
			    no=rs1.getString(1);
				String last=rs1.getString(2);
				String first=rs1.getString(3);
				String middle=rs1.getString(4);
				String add=rs1.getString(5);
				String phone=rs1.getString(6);
				String dat=rs1.getString(7);
				String age=rs1.getString(8);
				String sex=rs1.getString(9);
				
				g.drawString(no,i,j);
				i+=0.1;
				j+=20; 
				g.drawString(last,k,l);
				k+=0.1;
				l+=20; 
				g.drawString(first,m,n);
				m+=0.1;
				n+=20; 
				g.drawString(middle,p,q);
				p+=0.1;
				q+=20; 
				g.drawString(add,r,s);
				r+=0.1;
				s+=20; 
				g.drawString(phone,u,v);
				u+=0.1;
				v+=20; 
				g.drawString(dat,w,x);
				w+=0.1;
				x+=20; 
				g.drawString(age,y,z);
				y+=0.1;
				z+=20; 
				g.drawString(sex,a,b);
				a+=0.1;
				b+=20; 
				
		try
		{
			
			String q2 = "select total from bill where pid=?";
			PreparedStatement st2=con.prepareStatement(q2);
			st2.setString(1,no);
			ResultSet rs2= st2.executeQuery();
		    while(rs2.next())
		    {
		    	String tot=rs2.getString(1);
		        	
		    	    g.drawString(tot,c,d);
				    c+=0.1;
				    d+=20; 
			   
		    	
		    }
	   }
	     catch(Exception e)
		 {
		    	System.out.println(e);
		 }
			
		}
	
		con.close();
	}	
	catch(Exception e)
	{
		System.out.println(e);
	}	
}
	public static void main(String args[])
	{
		Display_All da = new Display_All();
	}
}