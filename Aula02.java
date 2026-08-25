public class Aula02 {
    public static void main(String [] args){
        System.out.println("Oi");

        Pessoa p1 = new Pessoa( "Ludovica", "Azanha", 33 );
        //p1.nome = "Ludovica";
        //p1.sobrenome = "Azanha";
        //p1.idade = 33;
        //p1.setNome("Ludovica");
        //p1.setSobrenome("Azanha");
        //p1.setIdade(33);
        //System.out.println( p1.nome );
        //System.out.println( p1.sobrenome );
        //System.out.println( p1.idade );
        //System.out.println( p1.getNome() );
        //System.out.println( p1.getSobrenome() );
        //System.out.println( p1.getIdade() );
        p1.mostraInfo();

        Pessoa p2 = new Pessoa( "João", "dos Santos", 20 );
        //p2.setNome("João");
        //p2.setSobrenome("dos Santos");
        //p2.setIdade(20);
        p2.mostraInfo();

        Pessoa p3 = new Pessoa( "Maria", "da Silva", 50 );
        //p3.setNome("Maria");
        //p3.setSobrenome("da Silva");
        //p3.setIdade(50);
        p3.mostraInfo();

        Pessoa p4 = new Pessoa( "Pedro", "Nogueira", -5 );
        //p4.setNome("Pedro");
        //p4.setSobrenome("Nogueira");
        //p4.setIdade(-5);
        p4.mostraInfo();

        p1.fazAniversario();
        p2.fazAniversario();
        p3.fazAniversario();
        p4.fazAniversario();

        p1.mostraInfo();
        p2.mostraInfo();
        p3.mostraInfo();
        p4.mostraInfo();

        //Pessoa p5 = new Pessoa();
        //p5.mostraInfo();


        //--PARTE 2
        Pessoa t1 = new Pessoa("Carlos", "Rodrigues", 30);
        ContaBancaria c1 = new ContaBancaria(t1, 100.0);
        c1.abreConta();
        c1.deposita(1000.0);

        ContaBancaria c2 = new ContaBancaria( new Pessoa("Rui","Sá",15), 300 );
        c2.abreConta();
        c2.deposita(3000.0);

        c1.extrato();
        c2.extrato();

        //--simulação de transferencia de c1 para c2
        double valor = 200.0;
        boolean validado = c1.saca(valor);
        if( validado ){
            c2.deposita(valor);
        }

        c1.extrato();
        c2.extrato();

        c1.saca(100.0);
    }
} 