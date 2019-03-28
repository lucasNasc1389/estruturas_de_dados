/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasLigadas;

/**
 *
 * @author lucas
 */
public class ListaLigada {

    int totalDeElementos;

    private Celula primeira;

    private Celula ultima;

    public void adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }
    
     private Celula pegaCelula(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        return atual;
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(anterior.getProxima(), elemento);
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
    }

    public void remove(int posicao) {
    }

    public int tamanho() {
        return 0;
    }

    public boolean contem(Object o) {
        return false;
    }

    public void adicionaNoComeco(Object elemento) {
        if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }

        this.totalDeElementos++;
    }

    public void removeDoComeco() {
    }

    public void removeDoFim() {
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        StringBuilder buider = new StringBuilder();
        buider.append("[");

        Celula atual = primeira;

        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            buider.append(atual.getElemento());
            buider.append(",");
            atual = atual.getProxima();;
        }

        buider.append(atual.getElemento());
        buider.append("]");

        return buider.toString();
    }

}
