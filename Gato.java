public class Gato extends Animal {

    public Gato(String nome, int peso) {
        super(nome, peso, "gato");
    }
    
    @Override 
    public void fazBarulho() {
        System.out.println("Miau");
    }

    @Override
    public int getValorDoExame() {
        int valorPadrao = super.getValorDoExame();
        return valorPadrao - 10;
    }
}
