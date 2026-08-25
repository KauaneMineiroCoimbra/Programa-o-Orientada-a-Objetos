public class Carro {

    String marca;
    String cor;
    String modelo;
    int ano;
    String placa;
    double motor;
    int roda;
    String combustivel;
    boolean automatico;

    int tanque = 100;

    //--Constructor
    Carro(
            String _marca, String _cor, String _modelo,
            int _ano,
            String _placa, double _motor, int _roda,
            String _combustivel, boolean _automatico
    ){
        this.marca = _marca;
        this.cor = _cor;
        this.modelo = _modelo;
        this.ano = _ano;
        this.placa = _placa;
        this.motor = _motor;
        this.roda = _roda;
        this.combustivel = _combustivel;
        this.automatico = _automatico;
    }

    public void mostraInfo() {
        System.out.println(
                "marca = " + marca +
                "\ncor = " + cor +
                "\nmodelo = " + modelo +
                "\nano = " + ano +
                "\nplaca = " + placa +
                "\nmotor = " + motor +
                "\nroda = " + roda +
                "\ncombustivel = " + combustivel +
                "\nautomatico = " + automatico
        );
    }

    public void andar() {
        if( tanque > 0 ) {
            System.out.println("O " + modelo + " está andando.");
            tanque -= 10;
        } else {
            System.out.println("O " + modelo + " está sem combustível.");
        }
    }
    public void frear() {
        System.out.println("O carro está freando.");
    }
    public void abastecer(){
        System.out.println("Abastecendo");
        tanque = 100;
    }

}
