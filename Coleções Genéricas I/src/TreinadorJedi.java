public class TreinadorJedi {
    String titulacao, nome;

    TreinadorJedi() { this("", ""); }

    TreinadorJedi(String titulacao, String nome) {
        this.titulacao = titulacao;
        this.nome = nome;
    }

    public String getDescricao() { return (titulacao + " " + nome); }
}
