public class Aula03 {
    public static void main(String[] args){
        
        //Pessoa p1 = new Pessoa( "Ludovica", 33, "Professora" );
        //Pessoa p2 = new Pessoa( "José", 22, "Aluno" );

        //portaria(p1);
        //portaria(p2);

        Professor p1 = new Professor("Ludovica", 33, 600000, 8);
        Aluno a1 = new Aluno( "José", 22, "TADS" );

        p1.passaCatraca();
        p1.recebeSalario();
        
        a1.passaCatraca();
        a1.fazAvaliacao(8.0);

        //-----
        portaria(a1);
        portaria(p1);

        sistemaAvaliativo(a1, 8.0);
        rh(p1);


        Professor p2 = new Professor("João", 50, 2000000, 20);
        p2.passaCatraca();
        p2.recebeSalario();

        Aluno a2 = new Aluno("Maria", 23, "TADS");
        a2.passaCatraca();
        a2.fazAvaliacao(9.0);

        Pessoa v1 = new Pessoa("Pedro", 40, "visitante");
        v1.passaCatraca();
        //Professor p3 = new Pessoa("a",1,"a");

        portaria(p2);
        portaria(a2);
        portaria(v1);

        rh(p2);

        sistemaAvaliativo(a2, 10.0);

        //------------
        Coordenador c1 = new Coordenador("Rogério", 38, 10000000, "TADS");
        c1.fazReuniao();
        c1.recebeSalario();
        c1.passaCatraca();

        portaria(c1);
        rh(c1);
        coordenacao(c1);
    }

    public static void portaria( Pessoa pessoa ) {
        pessoa.passaCatraca();
    }

    public static void sistemaAvaliativo( Aluno aluno, double nota ) {
        aluno.fazAvaliacao(nota);
    }

    public static void rh( Professor professor ){
        professor.recebeSalario();
    }

    public static void coordenacao( Coordenador coordenador ){
        coordenador.fazReuniao();
    }
}