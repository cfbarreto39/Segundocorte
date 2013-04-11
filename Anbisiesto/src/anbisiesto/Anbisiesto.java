
package anbisiesto;
import javax.swing.JOptionPane;  

public class Anbisiesto {

   
    public static void main(String[] args) {
        
        
         
 int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año que desea calcular"));
 
 if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)))

JOptionPane.showMessageDialog(
   null,
   "El año es bisiesto");
else
JOptionPane.showMessageDialog(
   null,
   "El año no es bisiesto");
  

    }
}
