public class Pessoa {
    private String nome;
    private int idade;
    private String cargo;
    private boolean dentro = false;
    
    public Pessoa(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }


    public void passaCatraca() {
        if( this.dentro ){
            System.out.println(this.cargo + " " + this.nome + " sai.");
        } else {
            System.out.println(this.cargo + " " + this.nome + " entra.");
        }
        this.dentro = !this.dentro;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isDentro() {
        return dentro;
    }

    public void setDentro(boolean dentro) {
        this.dentro = dentro;
    }

    

    
}
