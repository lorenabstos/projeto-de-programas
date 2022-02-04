public class IniciadoJedi {
    int anoNascimento;
    String nome, especie;

    IniciadoJedi() { this("", "", 0); }

    IniciadoJedi(String nome, String especie, int anoNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    public String getDescricao() {
        return (nome + " (especie=" + especie + ", nascimento=" + getAnoNascimento() + ")");
    }

    public String getAnoNascimento() {
        if (anoNascimento < 0) { return anoNascimento*(-1) + " ABY"; }
        else { return anoNascimento + " DBY"; }
    }
}
