public class Teste02 {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(13);

        pilha.empilha("E");
        pilha.empilha("U");
        pilha.empilha("G");
        pilha.empilha("O");
        pilha.empilha("S");
        pilha.empilha("T");
        pilha.empilha("O");
        pilha.empilha("D");
        pilha.empilha("E");
        pilha.empilha("J");
        pilha.empilha("A");
        pilha.empilha("V");
        pilha.empilha("A");
        System.out.println(pilha);

        System.out.println(pilha);

        pilha.verificarPalindromo();
        pilha.inverterPalavra();


        
    }
}
