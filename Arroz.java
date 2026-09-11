public class Arroz extends ProdutoNaoPerecivel {

    public Arroz(int quantidade) {
        super("Arroz", 7.0, quantidade);
    }

    @Override
    public void mostraDescricao() {
        System.out.println("Arroz Tio Pedro 1kg");
    }

    
    
}
