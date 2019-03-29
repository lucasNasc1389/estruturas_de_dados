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
public class TesteTamanho {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona("Lucas");
        lista.adiciona("Vitor");
        
        System.out.println(lista.tamanho());
        
        lista.adiciona("camila");
        
        System.out.println(lista.tamanho());
    }
}
