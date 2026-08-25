public class ContaBancaria {
    private Pessoa titular;
    private double saldo = 0.0;
    private boolean aberta = false;
    private double chequeEspecial;

    public ContaBancaria( Pessoa _titular, double _chequeEspecial ){
        this.titular = _titular;
        this.chequeEspecial = _chequeEspecial;
    }

    public void extrato() {
        System.out.println("################");
        System.out.println("Titular: " + this.titular.getNomeCompleto() );
        System.out.println("saldo: R$" + this.saldo);
        
        String status = "fechada";
        if(this.aberta){
            status = "aberta";
        }
        System.out.println("status: " + status);
    }

    public boolean saca( double valor ){
        if( !aberta ){
            System.out.println("Conta fechada.");
            return false;
        }

        if( valor < 0.0 ){
            System.out.println("Valor inválido.");
            return false;
        }

        if( valor > this.saldo + this.chequeEspecial ){
            System.out.println("Saldo insuficiente");
            return false;
        }

        System.out.println( "Saque de R$" + valor + " realizado com sucesso." );
        this.saldo -= valor;
        return true;
    }


    public void deposita( double valor ){
        if( !aberta ){
            System.out.println("Conta fechada.");
            return;
        }

        if( valor < 0.0 ){
            System.out.println("Valor inválido.");
            return;
        }

        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " recebido com sucesso.");
    }

    public void abreConta() {
        if( aberta ){
            System.out.println("Conta já está aberta.");
            return;
        }
        
        System.out.println("Conta de " + titular.getNomeCompleto() + " aberta.");
        this.aberta = true;
    }

    public void fechaConta() {
        if( !aberta ){
            System.out.println("Conta já está fechada.");
            return;
        }

        System.out.println("Conta de " + titular.getNomeCompleto() + " fechada.");
        this.aberta = false;
    }







}
