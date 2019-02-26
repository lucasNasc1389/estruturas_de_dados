/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author lucas
 */
public class TesteLinearVSConstante {
    public static void main(String[] args) {
       Vetor vetor = new Vetor();
       long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Object aluno = new Object();
            vetor.adiciona(aluno);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo em segundos" + tempo);
    }
}
