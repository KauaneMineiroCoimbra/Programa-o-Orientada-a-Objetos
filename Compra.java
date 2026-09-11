import java.util.ArrayList;
import java.util.List;

public class Compra implements OperacaoCompra {

    List<Produto> produtos = new ArrayList();

    @Override
    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void finalizaCompra() {
        double total = 0;
        for( Produto produto : produtos ){
            total += produto.getPreco();
            produto.mostraDescricao();
            System.out.println(produto);
        }
        System.out.println("Total R$" + total);
    }
    
}
