import java.awt.*;
import javax.swing.JOptionPane;

class msgbox
{
	msgbox()
	{
	}
	msgbox(String msg,String title,Component c)
	{
		
		JOptionPane.showMessageDialog(c,(Object)msg,title,JOptionPane.OK_OPTION);
	}
}	