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
public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        a1.setNome("Lucas");
        a2.setNome("Vitor");
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        
        Aluno a5 = new Aluno();
        
        System.out.println(lista);
        System.out.println(lista.contem(a5));
        System.out.println(lista.pega(2));
        
    }
}
