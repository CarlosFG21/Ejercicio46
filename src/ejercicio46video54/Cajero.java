
package ejercicio46video54;

import java.util.*;
import javax.swing.JOptionPane;

public class Cajero {
 
    public void caje(){
        
        final int saldo_inicial = 1000;
        float ingreso,saldo_actual,retiro;
        
        int opcion;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A SU CAJERO AUTOMATICO\n"
                + "\n1. INGRESAR DINERO A LA CUENTA"
                + "\n2. RETIRAR DINERO DE LA CUENTA" 
                + "\n3. SALIR"));
       
        switch(opcion){
            
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("DIGITE LA CANTIDAD QUE DESEA INGRESAR EN CUENTA: "));
            saldo_actual = saldo_inicial + ingreso; 
            JOptionPane.showMessageDialog(null,"DINERO EN CUENTA: "+ saldo_actual);
            break;
            
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("DIGITE LA CANTIDAD QUE DESEA RETIRAR DE LA CUENTA: "));
            if(retiro>saldo_inicial){
                JOptionPane.showMessageDialog(null,"NO CUENTA CON EL SALDO SUFICIENTE PARA ESTE RETIRO");
            }else{
                saldo_actual = saldo_inicial-retiro;
                JOptionPane.showMessageDialog(null,"DINERO EN CUENTA: " + saldo_actual);
                        
            }
            break;
            
            case 3: break;
            default: JOptionPane.showMessageDialog(null,"SE EQUIVOCO DE OPCION DE MENU");
            
        }
    }
}
