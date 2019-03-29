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
public class TesteContemElemento {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona("Lucas");
        lista.adiciona("Vitor");
        
        System.out.println(lista.contem("Lucas"));
        System.out.println(lista.contem("Camila"));
    }
}
