public class Leite extends ProdutorPerecivel {

    public Leite( int quantidade, 
        int diaValidade, int mesValidade, int anoValidade) {
        super("Leite", 7.5, quantidade,
            diaValidade, mesValidade, anoValidade
        );
    }

    @Override
    public void mostraDescricao() {
        System.out.println("Leite Toca 1L");
    }
    
}
