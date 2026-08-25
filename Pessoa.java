public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa( String _nome, String _sobrenome, int _idade ) {
        setNome(_nome);
        setSobrenome(_sobrenome);
        setIdade(_idade);
    }

    public void mostraInfo() {
        System.out.println(
            this.nome + " " + this.sobrenome + ", " + this.idade + " anos de idade."
        );
    }

    private void setNome( String _nome ){
        this.nome = _nome;
    }
    private void setSobrenome( String _sobrenome ){
        this.sobrenome = _sobrenome;
    }
    private void setIdade( int _idade ){
        if( _idade < 0 ){
            _idade = 0;
        }
        this.idade = _idade;
    }

    private String getNome() {
        return this.nome;
    }
    private String getSobrenome() {
        return this.sobrenome;
    }
    private int getIdade() {
        return this.idade;
    }
    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public void fazAniversario() {
        this.idade = this.idade + 1;
    }
    public boolean isMaiorDeIdade() {
        //if( this.idade >= 18 ){
        //    return true;
        //} else {
        //    return false;
        //}
        return this.idade >= 18;
    }








}
