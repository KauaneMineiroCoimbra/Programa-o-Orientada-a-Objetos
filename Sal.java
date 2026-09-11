public class Sal extends ProdutoNaoPerecivel {

    public Sal(int quantidade) {
        super("Sal", 3.50, quantidade);
    }

    @Override
    public void mostraDescricao() {
        System.out.println("Sal Tartaruga 500g");
    }
    
}
