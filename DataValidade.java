public class DataValidade implements Validador {

    private int dia;
    private int mes;
    private int ano;

    public DataValidade(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public boolean estaValido(int diaHoje, int mesAtual, int anoAtual) {
        if( this.ano != anoAtual ){
            return anoAtual < ano;
        }
        if( this.mes != mesAtual ){
            return mesAtual < mes;
        }
        if( this.dia != diaHoje ){
            return diaHoje < dia;
        }
        return true;
    }

}
