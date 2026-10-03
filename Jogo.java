public class Jogo {
    public static void main(String[] args){
        
        Jogador jogador = new Jogador("Ludovica");
        Inimigo inimigo = new Demonion();

        System.out.println("Começa a Batalha");
        System.out.println("#####################");
        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();
        
        while(true) {
            System.out.println("##########################\n");

            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if( inimigo.estaVivo() ){
                inimigo.fazAtaque(jogador);
            }

            
            //--finalização do jogo
            if( !jogador.estaVivo() ){
                jogador.fraseMorte();
                System.out.println(inimigo.getNome() + " ganhou!");
                break;
            }

            if( !inimigo.estaVivo() ){
                inimigo.fraseMorte();
                System.out.println(jogador.getNome() + " ganhou");
                break;
            }
        }

    }
}