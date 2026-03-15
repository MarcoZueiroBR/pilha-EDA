import java.util.Arrays;

public class Pilha<T> {

    public T[] elementos;
    public int tamanho;


    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }


    public void empilha(T elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;
        }
    }

    public T desempilha(){
        T temp = elementos[tamanho-1];
        this.elementos[tamanho-1] = null;
        tamanho--;
        return temp;

    }

    public T topo(){
        return this.elementos[tamanho-1];
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    // Método para Inveter uma Pilha.
    public Pilha<T> inverte(){

        Pilha<T> aux = new Pilha<>(this.elementos.length);

        while (!this.estaVazia()){
            aux.empilha((T) this.desempilha());
        }

        this.elementos = aux.elementos;
        this.tamanho = aux.tamanho;

        return aux;
    }

    // Método para verificar se a Pilha é Palindromo ou não.
    public boolean verificarPalindromo(){
        int inicio = 0;
        int fim = this.tamanho - 1;
        while (inicio < fim) {
            if (elementos[inicio] != elementos[fim]) {
                System.out.println("Não é Palíndromo");
                return false;
            }
            inicio++;
            fim--;
        }
        System.out.println("É Palíndromo");
        return true;
    }

    // Método para inverter as palavras de uma pilha.
    public void inverterPalavra() {
        String resultado = "";

        for (int i = this.elementos.length - 1; i >= 0; i--) {
            if (this.elementos[i] != null) {
                resultado += this.elementos[i] + " ";
            }
        }

        System.out.println(resultado.trim());
    }

    // Formatando a Pilha com o StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);

            if (i < tamanho - 1){
                sb.append(", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }
}