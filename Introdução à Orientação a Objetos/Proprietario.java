package LAB3;

public class Proprietario { //classe proprietário
    //atributos
    String nome;
    int cnh, anoNascimento;

    //métodos construtores
    Proprietario() {
        this("",0, 0);
    }

    Proprietario(String nome, int cnh, int anoNascimento) {
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;
    }

    //métodos
    public int getIdade(int anoReferencia) {
        return anoReferencia - anoNascimento;
    }

    public String getDescricao() {
        return ("LAB3.Proprietario: nome=" + nome + ", cnh=" + cnh + ", anoNascimento=" + anoNascimento + ". ");
    }
}
