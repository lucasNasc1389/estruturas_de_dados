/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executandoListasLigadas;

import listasLigadas.ListaLigada;

/**
 *
 * @author lucas
 */
public class TesteAdicionaNoComeco {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona("John");
        lista.adicionaNoComeco("Lucas");
        lista.adicionaNoComeco("Rafael");
        
        System.out.println(lista);
    }
}
