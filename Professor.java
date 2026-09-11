public class Professor extends Pessoa {
    
    private int salario;
    private int cargaHoraria;

    public Professor(String nome, int idade, int salario, int cargaHoraria) {
        super(nome, idade, "Professor");
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public void recebeSalario() {
        System.out.println(getNome() + " recebe salário de R$" + this.salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    

    

}
