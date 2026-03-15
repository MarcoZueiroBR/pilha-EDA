public class Teste01 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha.topo());
        pilha.desempilha();
        System.out.println(pilha.topo());
        pilha.empilha(3);


        System.out.println(pilha);




    }
}
