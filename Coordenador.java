public class Coordenador extends Professor {
    private String curso;

    public Coordenador(String nome, int idade, int salario, String curso) {
        super(nome, idade, salario, 40);
        this.curso = curso;
        setCargo("Coordenador");
    }


    public void fazReuniao() {
        System.out.println("Coordenador " + getNome() + 
                " faz reunião com os professores de " +
                  this.curso );
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
