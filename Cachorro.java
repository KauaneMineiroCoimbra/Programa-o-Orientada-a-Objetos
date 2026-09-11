public class Cachorro extends Animal {

    public Cachorro(String nome, int peso) {
        super(nome, peso, "Cachorro");
    }

    @Override
    public void fazBarulho() {
        System.out.println("Auau");
    }

    @Override 
    public int getValorDaConsulta() {
        if( getPeso() > 15 ){
            return super.getValorDaConsulta() + 20;
        } else {
            return super.getValorDaConsulta();
        }
    }

    @Override 
    public int getValorDoExame() {
        return super.getValorDoExame() + 2 * getPeso();
    }
    


}
