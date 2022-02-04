import java.util.ArrayList;
import java.util.Objects;

public class SessaoJedi {
    String nome;
    TreinadorJedi treinador;
    ArrayList<IniciadoJedi> iniciados = new ArrayList<>();

    SessaoJedi() { this("", null); }

    SessaoJedi(String nome, TreinadorJedi treinador) {
        this.nome = nome;
        this.treinador = treinador;
    }

    public void addIniciado(IniciadoJedi iniciado) {
        this.iniciados.add(iniciado);
        //iniciados.removeIf(iniciadoJedi -> iniciadoJedi == iniciado);
    }

    IniciadoJedi getIniciado(String nome) {
        for (IniciadoJedi iniciado : this.iniciados) {
            if (Objects.equals(iniciado.nome, nome)) { return iniciado; }
        }
        return null;
    }

    public double getMediaAnoNascimento() {
        int acumulador=0, contador=0;
        for (IniciadoJedi iniciado : iniciados) {
            contador++;
            acumulador += iniciado.anoNascimento;
        }
        return (double)acumulador/contador;
    }

    public String getDescricao() {
        int i=1;
        StringBuilder jediIniciado = new StringBuilder();
        for (IniciadoJedi iniciado : iniciados) {
            jediIniciado.append(String.format("- Iniciado %d: %s\n", i, iniciado.getDescricao()));
            i++;
        }
        return String.format("--> SESSÃO %s (Treinador: %s)\n%s", this.nome, treinador.getDescricao(), jediIniciado);
    }
}
