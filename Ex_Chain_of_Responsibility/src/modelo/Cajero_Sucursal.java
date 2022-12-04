/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author 59399
 */
public class Cajero_Sucursal implements IManejador {

    private IManejador sucesor;

    @Override
    public void peticion(int monto) {
        if (monto > 100 && monto < 300) {
            JOptionPane.showConfirmDialog(null, "La peticion fue atendida por el cajero de la sucursal..");
        } else {
            sucesor.peticion(monto);
        }
    }

    @Override
    public IManejador getSource() {
        return sucesor;
    }

    @Override
    public void setSource(IManejador sucesor) {
        this.sucesor = sucesor;
    }

}
