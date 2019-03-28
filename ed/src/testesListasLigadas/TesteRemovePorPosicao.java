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
public class TesteRemovePorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona("Lucas");
        lista.adiciona("Vitor");
        lista.adiciona("Slash");
        
        System.out.println(lista);
        
        lista.remove(1);
        
        System.out.println(lista);
    }
}
