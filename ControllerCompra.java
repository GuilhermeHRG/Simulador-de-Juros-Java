/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Compra;

/**
 *
 * @author Usuario
 */
public class ControllerCompra {
    //      VEIO DA VIEWa
    public Double compraVista(Double vlrCompra){
        // MODEL
        Compra c = new Compra();
        // VEIO DA MODEL
        c.setValor_compra(vlrCompra);
        // PEGA O RESULTADO DO QUE A MODEL CALCULAR
        Double resultado = c.simular();
        return resultado;
    }
    public Double compraPrazo(Double vlrCompra, Integer parcela){
        // MODEL
        
        Compra c = new Compra();
        // VEIO DA MODEL
        c.setValor_compra(vlrCompra);
        c.setNumParcela(parcela);
        
      
        
        // PEGA O RESULTADO DO QUE A MODEL CALCULAR
        Double resultado = c.simular(null);
        Double valt = c.simular(null);
        return resultado;
        
    }
    
}
