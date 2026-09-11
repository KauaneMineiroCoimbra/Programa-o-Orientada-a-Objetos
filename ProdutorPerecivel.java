public abstract class ProdutorPerecivel extends Produto {

    private Validador validade;

    public ProdutorPerecivel(String nome, double preco, int quantidade,
           int diaValidade, int mesValidade, int anoValidade
    ) {
        super(nome, preco, quantidade);
        validade = new DataValidade(diaValidade, mesValidade, anoValidade);
    }

    @Override
    public boolean estaValido(int diaHoje, int mesAtual, int anoAtual) {
        return this.validade.estaValido( diaHoje, mesAtual, anoAtual );
    }

    
    
}
