package LAB3;

public class Placa {
    int tipo;
    String placa;

    Placa() {
        this("", 0);
    }

    Placa(String placa, int tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getTipoString() {
        switch (this.tipo) {
            case 1:
                return ("Normal");
            case 2:
                return ("Servico");
            case 3:
                return ("Oficial");
            case 4:
                return ("Auto Escola");
            case 5:
                return ("Prototipo");
            case 6:
                return ("Colecionador");
            default:
                return ("Outros");
        }
    }

    public boolean temEstacionamentoLivre() {
        return this.tipo == 2 || this.tipo == 3;
    }

    public String getDescricao() {
        return ("LAB3.Placa: placa=" + placa + ", tipo=" + getTipoString() + ", estacionamentoLivre=" + temEstacionamentoLivre() + ". ");
    }

}
