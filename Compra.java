/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Compra {

    private Double valor_compra, taxa;
    private String tipo;
    private Integer numParcela;
    private Double valor_copra;
    
    

    

    /**
     * @return the valor_compra
     */
    public Double getValor_compra() {
        return valor_compra;
    }

    /**
     * @param valor_compra the valor_compra to set
     */
    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    /**
     * @return the taxa
     */
    public Double getTaxa() {
        return taxa;
    }

    /**
     * @param taxa the taxa to set
     */
    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the numParcela
     */
    public Integer getNumParcela() {
        return numParcela;
    }

    /**
     * @param numParcela the numParcela to set
     */
    public void setNumParcela(Integer numParcela) {
        this.numParcela = numParcela;
    }
    public Double simular() {
        if (valor_compra < 1500) {
            return valor_compra * 0.85;
        } else if (valor_compra > 5000) {
            return valor_compra * 0.93;
        } else {
            return valor_compra * 0.90;
        }
        
    }
    
    
    public Double simular(Double taxa ) {
        
        if (numParcela<=24){
        if (numParcela <= 10 ) {
            return valor_compra;
        } else if (numParcela > 10 && numParcela <= 15 ) {
             taxa = 0.03;
               return valor_compra *(Math.pow(1+taxa, numParcela));
        } else if (numParcela>15 ){
            taxa = 0.05;
            
            return valor_compra *(Math.pow(1+taxa, numParcela));
        }} else {
            return 0.0;
        }
        return null; 
}
}

