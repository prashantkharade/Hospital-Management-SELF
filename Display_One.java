import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Display_One extends JFrame implements ActionListener

{
	JLabel hn,hn1,ser,plz;
	JButton btnok,btncan,btnback;
	JTextField txt;
	JTextArea ta;
	String str,q;
	
	public Display_One()
	{
		Container cont=new Container();
		getContentPane();
		setTitle("Search");   
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
		
			//  Button
	
	  	btnok=new JButton("OK");
	  	btnok.setBounds(550,165,100,30);
	  	btnok.setVisible(true);
	  	btnok.setEnabled(true);
	  	btnok.addActionListener(this);
	  	cont.add(btnok);
	  	
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
	  	  	
	  	 //   Label
	    
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
	     
		plz = new JLabel("Please, Enter Patients Id:");
		plz.setBounds(45,130,600,100);
		plz.setForeground(Color.darkGray);
		plz.setFont(new Font("Georgia",Font.BOLD,18));		
		cont.add(plz);
		
			//Textfield
	  
	  	txt = new JTextField(20);
	  	txt.setBounds(300,170,150,25);
	  	cont.add(txt);
		
			//TextArea
		
		ta = new JTextArea(40,50);
	  	ta.setBounds(50,250,700,200);
	  	ta.setEditable(false);
	//	ta.setFont(new Font("Times New Roman",Font.LAYOUT_LEFT_TO_RIGHT,20));		
		cont.add(ta);
		
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
		public void actionPerformed(ActionEvent e)
		{
		
			if(e.getActionCommand().equals("OK"))
				{
					disp_one();
				}
			else if(e.getActionCommand().equals("Back"))
				{
					frmReport fr = new frmReport();
				}
			else if(e.getActionCommand().equals("Cancel"))
				{
					HomePage hp = new HomePage();
				}			
         }	
         
      public void disp_one()
		{
			try
				{
				
					String url;    	 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
					q = "select pid,last_name,first_name,middle_name,address,phone,date,age,sex from registration where pid=?";
					PreparedStatement st=con.prepareStatement(q);


					st.setString(1,txt.getText());

					ResultSet rs = st.executeQuery();

					ta.setText("");
					ta.append("Pid   Surname     Firstname    Middlename              Address                Phone No            date               Age            Sex             Bill\n");
		            ta.append("------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");    					
				   	while(rs.next())
						{
						    String id=rs.getString(1);
						
				            String lnm=rs.getString(2);
				            String fnm=rs.getString(3);
							String mnm=rs.getString(4);
							String add=rs.getString(5);
				            String pho=rs.getString(6);
							String dat=rs.getString(7);
							String age=rs.getString(8);
				            String sex=rs.getString(9);
			
							ta.append(id+"        ");
							ta.append(lnm+"     ");
							ta.append(fnm+"     ");
							ta.append(mnm+"     ");
							ta.append(add+"           ");
							ta.append(pho+"        ");
							ta.append(dat+"          ");
							ta.append(age+"        ");
							ta.append(sex+"          ");
							
						 try
						 {	
						 	String q1="select total from bill where pid=?";
				         	PreparedStatement st1=con.prepareStatement(q1);
						 	st1.setString(1,id);
						 	ResultSet rs1 = st1.executeQuery();
						 	while(rs1.next())
						 	{
						 		  String bill=rs1.getString(1);
						 	  	  ta.append(bill+"       ");
						 	}
							
				         }
				         catch(Exception ae)
				         {
				         	System.out.println(ae);
				         }
				        
				      }
			con.close();
			rs.close();
			
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
        
         
	public static void main(String args[])
	{
		Display_One dis = new Display_One();
	}
}