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
public class TesteDeTempoDoContem {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        long inicio = System.currentTimeMillis();
        
        // Adicionado 30000 alunos e
        // verificando se eles foram realmente adicionados
        for (int i = 1; i < 30000; i++) {
            Aluno alunos = new Aluno();
            vetor.adiciona(alunos);
            if (!vetor.contem(alunos)) {
                System.out.println("Erro aluno " + alunos + "não adicionado");
            }
        }
        
        // Verificando se o Vetor não encontra alunos não adicionados.
        for (int i = 0; i < 30000; i++) {
            Aluno alunos = new Aluno();
            if(vetor.contem(alunos))
                System.out.println("Erro: aluno " + alunos + " foi add.");
        }
        
         long fim = System.currentTimeMillis();
         double tempo = (fim - inicio) / 1000.0;
         System.out.println("Tempo " + tempo);
    }    
}
