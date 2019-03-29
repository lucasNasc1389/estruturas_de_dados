/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

import java.util.LinkedList;
import java.util.List;
import objetosParaExemplos.Peca;

/**
 *
 * @author lucas
 */
public class Pilha {
    
    
    private List<Object> pecas =new LinkedList<Object>();
    
    
    public void insere(Peca peca) {
        this.pecas.add(peca);
    }
    
    public Peca remove() {
        return this.pecas.remove(this.pecas.size() - 1);
    }
    
    public boolean vazia() {
        return this.pecas.size() == 0;
    }
}
