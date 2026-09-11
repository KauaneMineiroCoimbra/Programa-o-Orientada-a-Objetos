import java.security.cert.PolicyQualifierInfo;

public class Aula05 {
    public static void main(String[] args){
        //Produto p1 = new Produto("Leite",7.5,3);

        Produto p2 = new Leite(3, 20, 11, 2026);
        Produto p3 = new Arroz(1);

        //p2.mostraDescricao();
        //p3.mostraDescricao();

        OperacaoCompra compra = new Compra();
        compra.adicionaProduto( new Leite(4, 20, 11, 2026));
        compra.adicionaProduto( new Bolacha( 2, 1, 1, 2027) );
        compra.adicionaProduto( new Arroz(3) );
        compra.adicionaProduto( new Sal(1) );
        compra.finalizaCompra();
    }

}