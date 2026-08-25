//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("fiat", "azul", "fusca", 1992,
                "AAA1111", 1.0, 15, "gasolina", false );
        //c1.marca = "fiat";
        //c1.cor = "azul";
        //c1.modelo = "fusca";
        //c1.ano = 1992;
        //c1.placa = "AAA1111";
        //c1.motor = 1.0;
        //c1.roda = 15;
        //c1.combustivel = "gasolina";
        //c1.automatico = false;
        c1.mostraInfo();

        System.out.println("-----");

        Carro c2 = new Carro("Honda", "vermelho", "Civic", 2026, "zzz5555",
                2.0, 17, "flex", true           );
        c2.mostraInfo();


        c1.andar();
        c1.frear();

        c2.andar();
        c2.frear();

        for( var i = 0; i < 10; i++ ){
            c1.andar();
        }

        c1.abastecer();
        c1.andar();
    }
}