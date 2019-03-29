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
public class TesteAdicionaPorPosicao {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");
        a3.setNome("Ana");

        Vetor lista = new Vetor();

        lista.adiciona(0, a1);
        lista.adiciona(1, a2);
        lista.adiciona(2, a3);
        
        System.out.println(lista);
        
    }
}
