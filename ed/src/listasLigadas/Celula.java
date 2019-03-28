/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasLigadas;

/**
 *
 * @author lucas
 */
public class Celula {
    
    private Celula proxima;
    
    private Celula anterior;
    
    private Object elemento;
    
    public Celula(Celula proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getAnterior() {
        return anterior;
    }
    

    public Object getElemento() {
        return elemento;
    }
}