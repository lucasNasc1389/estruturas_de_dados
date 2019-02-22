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
public class TesteAddEmDeterminadaPosicao {
    public static void main(String[] args) {
        
        Aluno a0 = new Aluno();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno intrusoA5 = new Aluno();
        
        a0.setNome("Lucas");
        a1.setNome("Vitor");
        a2.setNome("Zezinho");
        a3.setNome("Huguinho");
        a4.setNome("Luizinho");
        intrusoA5.setNome("Petista");
        
        Vetor lista = new Vetor();
     
        lista.adiciona(a0);
        lista.adiciona(1, a1);
        lista.adiciona(2, a2);
        lista.adiciona(3, a3);
        lista.adiciona(4, a4);
        
        System.out.println(lista);
        
        System.out.println(" ");
        
        lista.adiciona(1, intrusoA5);
        
        System.out.println(lista);
    }
}
