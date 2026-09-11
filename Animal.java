public class Animal extends Object {
    private String nome;
    private int peso;
    private String especie;

    private int valorDaConsulta = 100;
    private int valorDoExame = 50;
    
    public Animal(String nome, int peso, String especie) {
        this.nome = nome;
        this.peso = peso;
        this.especie = especie;
    }

    public void fazBarulho() {}

    @Override
    public String toString() {
        return "Animal [nome=" + nome + 
                       ", peso=" + peso + 
                       ", especie=" + especie + "]";
    }



    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    public int getValorDaConsulta() {
        return valorDaConsulta;
    }

    public int getValorDoExame() {
        return valorDoExame;
    }

    

    
}
