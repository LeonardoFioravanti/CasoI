/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoileonardofioravanti;
import javax.swing.JOptionPane;
/**
 *
 * @author Aulas Heredia
 */
public class CasoILeonardoFioravanti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre;
    String mes;

    nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente: "));
    int codigodefactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la factura: "));
    mes = JOptionPane.showInputDialog("Ingrese el mes de la factura: ");
    int fechadelafactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de la factura: "));
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas que quiere registrar: "));
    int estadodelafactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de la factura, 1 para factura pagada, 2 para factura no pagada: "));
    int montodelafactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura: "));
    
    if (montodelafactura > 0){
        double interes = montodelafactura * 0.15 ;
        montodelafactura = (int) (montodelafactura + interes);
        montodelafactura = montodelafactura/4;
        

        }
        
    JOptionPane.showMessageDialog(null,"Cuota 1 " + montodelafactura + " Fecha de pago marzo 2024");        
    JOptionPane.showMessageDialog(null,"Cuota 2 " + montodelafactura + " Fecha de pago abril 2024");    
    JOptionPane.showMessageDialog(null,"Cuota 3 " + montodelafactura + " Fecha de pago mayo 2024");    
    JOptionPane.showMessageDialog(null,"Cuota 4 " + montodelafactura + " Fecha de pago junio 2024");    

            
        }
    
    
    }
    

