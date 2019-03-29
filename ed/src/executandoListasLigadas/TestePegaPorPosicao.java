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
public class TestePegaPorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona("Lucas");
        lista.adiciona("Vitor");
        lista.adiciona("Huguinho");
        lista.adiciona("Luizinho");
        lista.adiciona("Zézinho");
        
        System.out.println(lista);
        
        lista.adiciona(2, "User");
                
        System.out.println(lista);
        
        lista.removeDoFim();
        
        System.out.println(lista);
    }
}
