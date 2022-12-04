/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_chain_of_responsibility;

import javax.swing.JOptionPane;
import modelo.Banco;

/**
 *
 * @author 59399
 */
public class Ex_Chain_of_Responsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int monto= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto aretirar"));
        Banco bn= new Banco();
        bn.peticion(monto);
    }
    
}
