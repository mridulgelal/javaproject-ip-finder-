import java.net.InetAddress;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class GetMyIPAddress
{
   public static void main(String args[]) throws Exception
   {
      
      InetAddress myIP=InetAddress.getLocalHost();
 
     
      System.out.println("Your Address is:");
      JOptionPane.showMessageDialog(null,myIP.getHostAddress(), "Your IP Address is:", JOptionPane.PLAIN_MESSAGE);
  }
}