public abstract class ProdutoNaoPerecivel extends Produto {

    public ProdutoNaoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public boolean estaValido( int diaHoje, int mesAtual, int anoAtual ) {
        return true;
    }
    
}
