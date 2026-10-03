public class Escudo extends Defesa {
    
    private int reducao;

    public Escudo(int reducao) {
        if( reducao < 0 ){
            reducao = 0;
        }
        this.reducao = reducao;
    }

    @Override
    public int danoReduzido( int dano ){
        if( this.reducao > dano ){
            return 0;
        }
        return dano - this.reducao;
    }

}
