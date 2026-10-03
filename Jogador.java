import java.util.Scanner;
import java.util.Random;

public class Jogador extends Criatura {

    private int ataquePerto = 50;
    private int ataqueLonge = 150;

    public Jogador(String nome) {
        super(nome, 1000);
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha sua arma: ");
        System.out.println("1) Faca - dano: " + this.ataquePerto);
        System.out.println("2) Arco e Flecha - dano: " + this.ataqueLonge + " - chance 50%");

        int escolha = sc.nextInt();
        while( escolha < 1 || escolha > 2 ){
            System.out.print("Número inválido, digite novamente: ");
            escolha = sc.nextInt();
        }

        if( escolha == 1 ){
            criatura.tomaDano(this.ataquePerto);
        } else if ( escolha == 2 ) {
            Random rd = new Random();
            int sorteio = rd.nextInt(100);
            if( sorteio < 50 ){
                criatura.tomaDano(this.ataqueLonge);
            } else {
                System.out.println("Errou!");
            }
        }

    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Não contava com minha astúcia.");        
    }

    @Override
    public void fraseMorte() {
        System.out.println("pipipipipipipipi");
    }
    
}
