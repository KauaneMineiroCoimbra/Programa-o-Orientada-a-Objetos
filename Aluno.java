public class Aluno extends Pessoa {

    private String curso;
    private int periodo = 1;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade, "Aluno");
        this.curso = curso;
    }


    public void fazAvaliacao( double nota ){
        if( nota >= 6.0 ) {
            System.out.println(getNome() + " está aprovado.");
            periodo++;
        } else {
            System.out.println(getNome() + " não atingiu a média.");
        }
    }



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    
    
}
