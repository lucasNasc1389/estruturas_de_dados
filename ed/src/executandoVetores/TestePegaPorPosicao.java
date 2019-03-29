/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executandoVetores;

import objetosParaExemplos.Aluno;
import objetosParaExemplos.Vetor;

/**
 *
 * @author User
 */
public class TestePegaPorPosicao {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        
        Object aluno1 = lista.pega(0);
        Object aluno2 = lista.pega(1);
        
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}
