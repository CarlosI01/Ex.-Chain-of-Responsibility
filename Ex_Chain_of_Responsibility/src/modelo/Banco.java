/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 59399
 */
public class Banco implements IManejador {

    private IManejador sucesor;

    @Override
    public void peticion(int monto) {
        Cajero_Automatico ca= new Cajero_Automatico();
        setSource(ca);
        
        Cajero_Sucursal cs= new Cajero_Sucursal();
        ca.setSource(cs);
        
        Acesor_Financiero af=new Acesor_Financiero();
        cs.setSource(af);
        sucesor.peticion(monto);
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
