import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class frmReport extends JFrame implements ActionListener
{
	JRadioButton rbsin,rball,rbipd,rbopd;
	ButtonGroup grp;
    JButton btnok,btncan,btnback;
	JLabel hn,hn1,lblrep,lblsin,lblall,lblipd,lblopd;
	
	public frmReport()
	{
		Container cont=new Container();
		getContentPane();
		setLayout(new BorderLayout());
	    setTitle("Main Frame");   
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
		
		// Label
		
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
		
		lblrep = new JLabel("Report");
		lblrep.setBounds(350,110,600,100);
		lblrep.setForeground(Color.BLACK);
		lblrep.setFont(new Font("Times New Roman",Font.PLAIN,30));		
		cont.add(lblrep);
		
		lblsin = new JLabel("Report  of  Single  Patient  ");
		lblsin.setBounds(240,180,600,100);
		lblsin.setForeground(Color.BLUE);
		lblsin.setFont(new Font("Arial",Font.BOLD,16));		
		cont.add(lblsin);	
		
		lblall = new JLabel("Report  of  All  Patients");
		lblall.setBounds(240,230,600,100);
		lblall.setForeground(Color.BLUE);
		lblall.setFont(new Font("Arial",Font.BOLD,16));		
		cont.add(lblall);	
		
		lblipd = new JLabel("Report  of  I.P.D  Patients");
		lblipd.setBounds(240,280,600,100);
		lblipd.setForeground(Color.BLUE);
		lblipd.setFont(new Font("Arial",Font.BOLD,16));		
		cont.add(lblipd);	
		
		lblopd = new JLabel("Report  of  O.P.D.  Patients");
		lblopd.setBounds(240,330,600,100);
		lblopd.setForeground(Color.BLUE);
		lblopd.setFont(new Font("Arial",Font.BOLD,16));		
		cont.add(lblopd);	
			
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
	  		  	
	  	// Radio Button
	  	
	  	grp=new ButtonGroup(); 
		rbsin=new JRadioButton();
		rbsin.setBounds(200,220,20,20);
		rbsin.setVisible(true);
	    grp.add(rbsin);
	    cont.add(rbsin);
		
		rball=new JRadioButton();
		rball.setBounds(200,270,20,20);
		rball.setVisible(true);
	    grp.add(rball);
	    cont.add(rball);	 
	    
	    rbipd=new JRadioButton();
		rbipd.setBounds(200,320,20,20);
		rbipd.setVisible(true);
	    grp.add(rbipd);
	    cont.add(rbipd); 
	    
	    rbopd=new JRadioButton();
		rbopd.setBounds(200,370,20,20);
		rbopd.setVisible(true);
	    grp.add(rbopd);
	    cont.add(rbopd);
	    
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
    	if(ae.getActionCommand().equals("OK"))
    	{
    	     if(rball.isSelected()==true)
    	      { 
    				Display_All da = new Display_All();
         	  }
         	  else if(rbsin.isSelected()==true)
         	  {
         	  	    Display_One dis = new Display_One();
         	  }
         	  else if(rbopd.isSelected()==true)
         	  {
         	  	   Display_opd disopd = new Display_opd();
         	  }
         	  else if(rbipd.isSelected()==true)
         	  {
         	  	   Display_ipd disipd = new Display_ipd();
         	  }
        }
        else if(ae.getActionCommand().equals("Back"))
        {
        	MainFrame mf = new MainFrame();
        }
         else if(ae.getActionCommand().equals("Cancel"))
        {
        	HomePage hp = new HomePage();
        }
     }  
      
	public static void main(String args[])
	{
		frmReport fr = new frmReport();
	}
	
}