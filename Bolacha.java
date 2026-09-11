public class Bolacha extends ProdutorPerecivel {

    public Bolacha( int quantidade, int diaValidade, int mesValidade, int anoValidade) {
        super("Bolacha", 4.5, quantidade, diaValidade, mesValidade, anoValidade);
    }

    @Override
    public void mostraDescricao() {
        System.out.println("Bolacha Oero 250g");
    }

    
    
}
