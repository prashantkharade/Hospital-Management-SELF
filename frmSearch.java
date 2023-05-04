import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class frmSearch extends JFrame implements ActionListener
{
	JLabel hn,hn1,ser,plz;
	JButton btnok,btncan,btnback;
	JTextField txt;
	JTextArea ta;
	String str,q;
	public frmSearch()
	{
		
		Container cont=new Container();
		getContentPane();
		setTitle("Search");   
	  	this.setFocusable(true);
	//  Button
	
	  	btnok=new JButton("Search");
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
	     
		plz = new JLabel("Please, Enter Surname:");
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
	  	ta.setBounds(90,250,600,200);
	  	ta.setEditable(false);
		ta.setFont(new Font("Times New Roman",Font.LAYOUT_LEFT_TO_RIGHT,20));		
		cont.add(ta);
		
		
		getContentPane().add(cont);
		setBounds(0,0,800,600);
		setResizable(false);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
		     public void windowClosing(WindowEvent e)
		      {
				
				dispose();
      		
			}
		});
		

	}
	
	public void actionPerformed(ActionEvent e)
		{
		
			if(e.getActionCommand().equals("Search"))
				{
					display();
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
         
     
    public void display()
		{
			String str = txt.getText();
			char ch;
			for(int i=0;i<str.length();i++)
			{
				ch=str.charAt(i);
				if(Character.isDigit(ch))
				{
					JOptionPane.showMessageDialog(null,"Please Enter Correct Surname","Eroor",JOptionPane.ERROR_MESSAGE);		
					txt.setText("");
					return;
				}
			} 
			try
				{
//				Class.forName("com.mysql.cj.jdbc.Driver");
//
//				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
//				
//				System.out.println("Connection OK");
//				 		
//				String q="insert into registration(pid,first_name,middle_name,last_name,address,phone,date,age,sex,blood_group,weight) values(?,?,?,?,?,?,?,?,?,?,?)";
//				
//				PreparedStatement st = con.prepareStatement(q);
					String url;    	 
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
					q = "select pid,last_name,first_name,middle_name from registration where last_name=?";
					PreparedStatement st=con.prepareStatement(q);
					st.setString(1,txt.getText());
					ResultSet rs = st.executeQuery();
					
					ta.setText("");
					ta.append("Patient Id    Surname    Firstname        FathersName\n ");
		            ta.append("-----------------------------------------------------------------------------------\n");    					
				   	while(rs.next())
						{
							String pid=rs.getString(1);
						
				            String lnm=rs.getString(2);
				            String fnm=rs.getString(3);
							String mnm=rs.getString(4);
				
							ta.append(pid+"                    ");
							ta.append(lnm+"          ");
							ta.append(fnm+"      ");
							ta.append(mnm+"        ");
							ta.append("\n");
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
		frmSearch f = new frmSearch();
	}	
}			