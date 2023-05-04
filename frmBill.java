import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class frmBill extends JFrame implements ActionListener 

{
	JLabel hn,hn1,bill,plz,tot,icu,gen,spl;
	JButton btnok,btncan,btnback;
	JTextField txt1,txt2,txticu,txtgen,txtspl;
	JTextArea ta;
	JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11;
	JCheckBox arr[] = new JCheckBox[11];
	String ope[] = {"CTscan","MRI","NPT","physio","ViThy","AngioPl","HeartTrans","ArteByp","Vasio","Medic","consult"};
	
	int cha[]=new int[11];
	public frmBill()
	{
		
		Container cont=new Container();
		getContentPane();
		setTitle("Bill");   
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
	  	  	
	//  Button
	
	  	btnok=new JButton("OK");
	  	btnok.setBounds(490,490,100,30);
	  	btnok.setVisible(true);
	  	btnok.setEnabled(true);
	  	btnok.addActionListener(this);
	  	cont.add(btnok);
	  	
	  	 	
	  	btncan=new JButton("Cancel");
	  	btncan.setBounds(590,490,100,30);
	  	btncan.setVisible(true);
	  	btncan.setEnabled(true);
	  	btncan.addActionListener(this);
	  	cont.add(btncan);
	  	
	  	btnback=new JButton("Back");
	  	btnback.setBounds(390,490,100,30);
	  	btnback.setVisible(true);
	  	btnback.setEnabled(true);
	  	btnback.addActionListener(this);
	  	cont.add(btnback);
	  		  	
       // Label
	    
	    bill = new JLabel("Bill");
		bill.setBounds(360,60,600,100);
		bill.setForeground(Color.black);
		bill.setFont(new Font("Georgia",Font.BOLD,22));		
		cont.add(bill);
		
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
	     
		plz = new JLabel("Please, Enter Patient Id:");
		plz.setBounds(45,110,600,100);
		plz.setForeground(Color.darkGray);
		plz.setFont(new Font("Georgia",Font.BOLD,18));		
		cont.add(plz);
		
		tot = new JLabel("Total Amount:");
		tot.setBounds(100,450,600,100);
		tot.setForeground(Color.darkGray);
		tot.setFont(new Font("Georgia",Font.BOLD,18));		
		cont.add(tot);
		
			
		//Textfield
	  
	  	txt1 = new JTextField(10);
	  	txt1.setBounds(300,150,80,25);
	  	cont.add(txt1);
		
		txt2 = new JTextField(10);
	  	txt2.setBounds(250,490,80,25);
	  	txt2.setEditable(false);
	  	cont.add(txt2);	
	  	
	  	// lable for general room
	  	
	  	gen = new JLabel("General Room(days)");
		gen.setBounds(550,175,600,100);
		gen.setForeground(Color.black);
		gen.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(gen);
		
		// Text Field for general room
		
		txtgen = new JTextField(10);
	  	txtgen.setBounds(555,250,80,25);
	  	cont.add(txtgen);
		
		//  Label for special room
		
		spl = new JLabel("Special Room(days)");
		spl.setBounds(550,250,600,100);
		spl.setForeground(Color.black);
		spl.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(spl);
		
		
		// Text Field for general room
		
		txtspl = new JTextField(10);
	  	txtspl.setBounds(555,325,80,25);
	  	cont.add(txtspl);
		
		
		//  Labl for IUC
		
		icu = new JLabel("I.C.U.(days)");
		icu.setBounds(550,325,600,100);
		icu.setForeground(Color.black);
		icu.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(icu);
		
		txticu = new JTextField(10);
	  	txticu.setBounds(555,400,80,25);
	  	cont.add(txticu);

				
		cb1 = new JCheckBox("Brain CT scan");
		cb1.setBounds(100,200,150,50);
		cb1.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb1);		
	     
		cb2 = new JCheckBox("MRI");
		cb2.setBounds(100,250,150,50);
		cb2.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb2);		
		
		cb3 = new JCheckBox("NPT");
		cb3.setBounds(100,300,150,50);
		cb3.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb3);		
		
		cb4 = new JCheckBox("Physiotherapy");
		cb4.setBounds(100,350,150,50);
		cb4.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb4);		
		
		cb5 = new JCheckBox("Vision Therapy");
		cb5.setBounds(100,400,150,50);
		cb5.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb5);		
		
		cb6 = new JCheckBox("Angioplasty");
		cb6.setBounds(310,200,200,50);
		cb6.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb6);	
		
		cb7 = new JCheckBox("Heart transplant");
		cb7.setBounds(310,250,200,50);
		cb7.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb7);		
		
		cb8 = new JCheckBox("Artery Bypass");
		cb8.setBounds(310,300,200,50);
		cb8.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb8);		
		
		cb9 = new JCheckBox("Vasodilators");
		cb9.setBounds(310,350,200,50);
		cb9.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb9);
		
		cb10 = new JCheckBox("Medication");
		cb10.setBounds(310,400,200,50);
		cb10.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb10);		
		
		cb11 = new JCheckBox("Consulting Fees");
		cb11.setBounds(550,140,200,50);
		cb11.setFont(new Font("Times New Roman",Font.PLAIN,18));
		cont.add(cb11);		
		
		arr[0]=cb1;
		arr[1]=cb2;
		arr[2]=cb3;
		arr[3]=cb4;
		arr[4]=cb5;
		arr[5]=cb6;
		arr[6]=cb7;
		arr[7]=cb8;
		arr[8]=cb9;
		arr[9]=cb10;
		arr[10]=cb11;
				
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
		if(ae.getActionCommand().equals("Back"))
		{
			MainFrame mf = new MainFrame();
		}  
		 if(ae.getActionCommand().equals("OK"))
		{
			Add_Bill();
		}
	    else if(ae.getActionCommand().equals("Cancel"))
		{
			HomePage hp = new HomePage();
		}			 
    }	
         
    public void Add_Bill() 
    {
    int gen=0,spl=0,icu=0;
    int total=0;
   
    String t1 = txtgen.getText();
    String t2 = txtspl.getText();
	String t3 = txticu.getText();
	
	char ch;
	for(int i=0;i<t1.length();i++)
	{
		ch=t1.charAt(i);
		if(!Character.isDigit(ch))
		{
			JOptionPane.showMessageDialog(null,"Please Enter General Room In Days Format","Eroor",JOptionPane.ERROR_MESSAGE);		
			txtgen.setText("");
			return;
		}
	} 
	
	for(int i=0;i<t2.length();i++)
	{
		ch=t2.charAt(i);
		if(!Character.isDigit(ch))
		{
			JOptionPane.showMessageDialog(null,"Please Enter Special Room In Days Format","Eroor",JOptionPane.ERROR_MESSAGE);		
			txtspl.setText("");
			return;
		}
	} 
			
	for(int i=0;i<t3.length();i++)
	{
		ch=t3.charAt(i);
		if(!Character.isDigit(ch))
		{
			JOptionPane.showMessageDialog(null,"Please Enter I.C.U. Room In Days Format","Eroor",JOptionPane.ERROR_MESSAGE);		
			txticu.setText("");
			return;
		}
	} 		
	
   // String url;
    try
    {
    	System.out.print("error1");
//    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//			url="jdbc:odbc:hosp";
//			Connection con = DriverManager.getConnection(url);	    
//    		String q1 = "select charges from charge where oprative  = 'gen_room' " ;
//			PreparedStatement st1 = con.prepareStatement(q1);
//			ResultSet rs1 = st1.executeQuery();
    		//Connection connection = null;
    		Statement st = null;
	        Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Ppk@3721");
			
			System.out.println("Connection OK");
			
			String sql = "select charges from charge where operative  = 'gen_room' ";
			System.out.println("Connection OK1");
			
			PreparedStatement st1 = con.prepareStatement(sql);
			ResultSet rs=st1.executeQuery();
			System.out.println("Connection OK2");
			while(rs.next())
				{
					  gen = rs.getInt(1);
					  System.out.println("Connection OK3");
				}
			
			
			String q2 = "select charges from charge where operative  = 'spl_room' " ;
			PreparedStatement st2 = con.prepareStatement(q2);
			ResultSet rs2 = st2.executeQuery();
			while(rs2.next())
				{
					  spl = rs2.getInt(1);
				}
			
			String q3 = "select charges from charge where operative = 'icu' " ;
			PreparedStatement st3 = con.prepareStatement(q3);
			ResultSet rs3 = st3.executeQuery();
			while(rs3.next())
				{
				  	 icu = rs3.getInt(1);
				}
	  	gen=gen*(Integer.parseInt(t1));
   		spl=spl*(Integer.parseInt(t2));
   		icu=icu*(Integer.parseInt(t3));
   		
   		 //this is for geting lnm,fnm from Reg
   		System.out.print("error");
   		
	  String q4 = "select last_name,first_name from registration where pid=?";
	  PreparedStatement st4=con.prepareStatement(q4);
	  st4.setString(1,txt1.getText());
	  ResultSet rs4 = st4.executeQuery();
	  String l=null;
	  String f=null;
	  while(rs4.next())
	  {
	   	 l = rs4.getString(1);
	     f = rs4.getString(2);
	  }
   		
   		 for(int i=0;i<11;i++)
   		 {
   			 if(arr[i].isSelected()==true)
   			 {
   				 try
   				 	{
		  
				    	String q6 = "select charges from charge where operative=?";
				    	PreparedStatement st6 = con.prepareStatement(q6);
						st6.setString(1,ope[i]);
						ResultSet rs6 = st6.executeQuery();
						while(rs6.next())
						{
				    	cha[i] = rs6.getInt(1);	
						}
				       }
		       catch(Exception e)
		       {
		       	System.out.println(e);
		       }
   			 }
   		 }
   		 
   		System.out.print("error before bill\n");
   		
   		
	   String q5="insert into bill values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	   PreparedStatement st5 = con.prepareStatement(q5);
	   st5.setInt(1,cha[0]);
	   st5.setInt(2,cha[1]);
	   st5.setInt(3,cha[2]);
	   st5.setInt(4,cha[3]);
	   st5.setInt(5,cha[4]);
	   st5.setInt(6,cha[5]);
	   st5.setInt(7,cha[6]);
	   st5.setInt(8,cha[7]);
	   st5.setInt(9,cha[8]);
	   st5.setInt(10,cha[9]);
	   st5.setInt(11,gen);
	   st5.setInt(12,spl);
	   st5.setInt(13,icu);
	   st5.setString(14,txt1.getText());
	   System.out.print("\nerror in bill");
	   st5.setString(15,l.toString());
	   st5.setString(16,f.toString());
	   
		   for(int i=0;i<11;i++)
		   {
		   	  total = total + cha[i];
		   }  
		   
	   total=total+gen+spl+icu; 
	   System.out.print("error in total creation\n");
	   st5.setInt(17,total);					 
	   st5.setInt(18,cha[10]);
	   
	   txt2.setText(" "+total);
	   
	   System.out.print("error before execute / close\n");
	   int r=st5.executeUpdate();
	   
	   
	   
	    rs.close();
	   st1.close();
						
	   rs2.close();
	   st2.close();
	   
	   rs3.close();
	   st3.close();
	
	   rs4.close();
	   st4.close();
	   
	   st5.close();
	   
	   con.close();

	   System.out.print("final close");
    	}
    	catch(Exception e)
    	 {
    		System.out.println("catch error");
    	 }   
       }

        public static void main(String args[])
		{
			frmBill fb = new frmBill();
		}	
 }
				