package ec.edu.ister.vista;

import ec.edu.ister.modelo.Enamorada;
import ec.edu.ister.modelo.Puntos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Aplicacion {

    public static void main(String[] args) {
        Enamorada en1 = new Enamorada();
        Enamorada en2 = new Enamorada();
        Enamorada en3 = new Enamorada("Jenny", "Jordán", "1234567890");
        Puntos p1 = new Puntos();
        
        Scanner input = new Scanner(System.in);
        String n=JOptionPane.showInputDialog("ingresa el nombre");
      //  System.out.println("Ingrese nombre");
        en1.setNombre(n);
      //  System.out.println("ingrese apellido");
        en1.setApellido(JOptionPane.showInputDialog("ingresa el apellido"));
        //System.out.println("ingrese ci");
        en1.setCedula(JOptionPane.showInputDialog("ingresa el ci"));
        //Enamorada.banar();
       p1.setX(JOptionPane.showInputDialog("Ingrese X"));
       p1.setY(JOptionPane.showInputDialog("Ingrese Y"));
        JOptionPane.showMessageDialog(null,en1.toString());
        JOptionPane.showMessageDialog(null,p1.toString());
        
        //System.out.println(en1.toString());
        //JOptionPane.showInputDialog()
        
        
        
       
        
        
        

    }

}
