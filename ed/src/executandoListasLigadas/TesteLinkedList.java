/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executandoListasLigadas;

import objetosParaExemplos.Aluno;
import java.util.LinkedList;

/**
 *
 * @author lucas
 */
public class TesteLinkedList {
    public static void main(String[] args) {
        
        Aluno maria = new Aluno();
        maria.setNome("Maria");
        
        Aluno manoel = new Aluno();
        manoel.setNome("Manoel");
        
        Aluno jose = new Aluno();
        jose.setNome("José");
        
        LinkedList listaLigada = new LinkedList();
        
        listaLigada.add(maria);
        listaLigada.add(manoel);
        
        System.out.println(listaLigada);
        
        listaLigada.add(1, jose);
        
        System.out.println(listaLigada);
        
        
    }
}
