/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesListasLigadas;

import listasLigadas.ListaLigada;

/**
 *
 * @author lucas
 */
public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        
        System.out.println(lista);
        
        lista.adiciona("Dunha");
        
        System.out.println(lista);
    }
}
