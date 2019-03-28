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
public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona(0, "Lucas");
        lista.adiciona(1, "Camila");
        lista.adiciona(0, "Vitor");
        
        System.out.println(lista);
    }
    
}
