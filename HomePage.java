import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame
    implements ActionListener
{

    public HomePage()
    {
        Container container = new Container();
        getContentPane();
        setLayout(new BorderLayout());
        setDefaultCloseOperation(0);
        hn = new JLabel("SINHGAD HOSPITAL");
        hn.setBounds(175, 0, 600, 100);
        hn.setForeground(Color.red);
        hn.setFont(new Font("Times New Roman", 1, 50));
        container.add(hn);
        
        hn1 = new JLabel("( General & CIC Unit )");
        hn1.setBounds(448, 40, 600, 100);
        hn1.setForeground(Color.GRAY);
        hn1.setFont(new Font("Times New Roman", 1, 20));
        container.add(hn1);
        
        dn = new JLabel("Dr.Prashant kharade");
        dn.setBounds(500, 100, 600, 100);
        dn.setFont(new Font("Monotype Corsiva", 1, 25));
        container.add(dn);
        
        ql = new JLabel("M.B.B.S.(D.G.O)");
        ql.setForeground(Color.blue);
        ql.setBounds(520, 120, 600, 100);
        ql.setFont(new Font("Arial", 1, 14));
        container.add(ql);
        
        ql1 = new JLabel("(Neurology & Cardiology)");
        ql1.setForeground(Color.blue);
        ql1.setBounds(520, 135, 600, 100);
        ql1.setFont(new Font("Arial", 1, 14));
        container.add(ql1);
        
        fa = new JLabel("Facilities :");
        fa.setForeground(Color.black);
        fa.setBounds(80, 180, 600, 100);
        fa.setFont(new Font("Georgia", 1, 25));
        container.add(fa);
        
        fa1 = new JLabel("1. 24 Hours Emergency Service");
        fa1.setForeground(Color.darkGray);
        fa1.setBounds(80, 210, 600, 100);
        fa1.setFont(new Font("Arial", 1, 16));
        container.add(fa1);
        
        fa2 = new JLabel("2. Ultrasonography(2D & 3D)");
        fa2.setForeground(Color.darkGray);
        fa2.setBounds(80, 233, 600, 100);
        fa2.setFont(new Font("Arial", 1, 16));
        container.add(fa2);
        
        fa3 = new JLabel("3. X-ray");
        fa3.setForeground(Color.darkGray);
        fa3.setBounds(80, 256, 600, 100);
        fa3.setFont(new Font("Arial", 1, 16));
        container.add(fa3);
        
        fa4 = new JLabel("4. Operation Theater");
        fa4.setForeground(Color.darkGray);
        fa4.setBounds(80, 279, 600, 100);
        fa4.setFont(new Font("Arial", 1, 16));
        container.add(fa4);
        
        fa5 = new JLabel("5. Neurology Clinic");
        fa5.setForeground(Color.darkGray);
        fa5.setBounds(80, 302, 600, 100);
        fa5.setFont(new Font("Arial", 1, 16));
        container.add(fa5);
        
        fa6 = new JLabel("6. Endoscopy");
        fa6.setForeground(Color.darkGray);
        fa6.setBounds(80, 325, 600, 100);
        fa6.setFont(new Font("Arial", 1, 16));
        container.add(fa6);
        
        a1 = new JLabel("Address :");
        a1.setForeground(Color.black);
        a1.setBounds(80, 415, 600, 100);
        a1.setFont(new Font("Georgia", 1, 20));
        container.add(a1);
        
        a2 = new JLabel("25,Pune Station,Pune");
        a2.setForeground(Color.blue);
        a2.setBounds(80, 440, 600, 100);
        a2.setFont(new Font("Arial", 1, 14));
        container.add(a2);
        
        a3 = new JLabel("Pune");
        a3.setForeground(Color.blue);
        a3.setBounds(80, 460, 600, 100);
        a3.setFont(new Font("Arial", 1, 14));
        container.add(a3);
        
        a4 = new JLabel("Phone No:020-24558360/25");
        a4.setForeground(Color.blue);
        a4.setBounds(80, 480, 600, 100);
        a4.setFont(new Font("Arial", 1, 14));
        container.add(a4);
        
        cmdNext = new JButton("Next");
        cmdNext.setBounds(500, 470, 100, 40);
        cmdNext.setVisible(true);
        cmdNext.setEnabled(true);
        cmdNext.addActionListener(this);
        container.add(cmdNext);
        
        cmdExit = new JButton("Exit");
        cmdExit.setBounds(600, 470, 100, 40);
        cmdExit.setVisible(true);
        cmdExit.setEnabled(true);
        cmdExit.addActionListener(this);
        container.add(cmdExit);
        
        getContentPane().add(container);
        setBounds(0, 0, 800, 600);
        setResizable(true);
        setTitle("Home Page");
        setVisible(true);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent windowevent)
            {
                System.exit(0);
                Exit_Frame exit_frame = new Exit_Frame();
            }

            final HomePage this$0;

            
            {
                this$0 = HomePage.this;
               
            }
        });
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        Exit_Frame exit_frame;
        if(actionevent.getActionCommand() == "Next")
        {
            frmLogin frmlogin = new frmLogin();
            dispose();
        } else
        if(actionevent.getActionCommand() == "Exit")
            exit_frame = new Exit_Frame();
    }

    public static void main(String args[])
    {
        HomePage homepage = new HomePage();
    }

    JLabel hn;
    JLabel hn1;
    JLabel dn;
    JLabel ql;
    JLabel ql1;
    JLabel fa;
    JLabel fa1;
    JLabel fa2;
    JLabel fa3;
    JLabel fa4;
    JLabel fa5;
    JLabel fa6;
    JLabel a1;
    JLabel a2;
    JLabel a3;
    JLabel a4;
    JButton cmdNext;
    JButton cmdExit;
}
