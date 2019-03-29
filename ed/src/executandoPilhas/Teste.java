/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executandoPilhas;

import java.util.Stack;
import objetosParaExemplos.Peca;
import pilhas.Pilha;

/**
 *
 * @author lucas
 */
public class Teste {
    public static void main(String[] args) {
        
        Stack pilha = new Stack();
        
        Peca pecaInsere = new Peca();
        pilha.push(pecaInsere);
                
        Peca pecaRemove = (Peca) pilha.pop();
        
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
        }
    }
}
