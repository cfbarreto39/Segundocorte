package porcentajedia;
import javax.swing.JOptionPane;


public class PorcentajeDia {

    public static void main(String[] args) {
       
         
 int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Para calcular el porcentaje de dia \n transcurrido digite la hora "));
 int b = Integer.parseInt(JOptionPane.showInputDialog(null,"digite los minutos "));
 int c = Integer.parseInt(JOptionPane.showInputDialog(null,"digite los segundos "));
 

     double seg = ((a*3600)+(b*60)+c);
     double porcentaje = ((seg*100)/86400);
     
JOptionPane.showMessageDialog(
   null,
   "El porcentaje del dia transcurrido es " + String.valueOf(porcentaje) );

     
    }
}
