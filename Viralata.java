public class Viralata extends Cachorro {

    public Viralata(String nome, int peso) {
        super(nome, peso);
    }
    public Viralata(int peso){
        super("SemNome", peso);
    }

    @Override
    public int getValorDoExame() {
        return 0;
    }
    
}
