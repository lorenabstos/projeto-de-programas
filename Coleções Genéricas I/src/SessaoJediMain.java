public class SessaoJediMain {
    public static void main(String[] args) {
        IniciadoJedi jd = new IniciadoJedi();
        jd.nome = "Katooni";
        jd.especie = "Tholothian";
        jd.anoNascimento = -23;
        System.out.println(jd.getDescricao());

        TreinadorJedi tj = new TreinadorJedi();
        tj.titulacao = "Grão-Mestre";
        tj.nome = "Fae Coven";
        System.out.println(tj.getDescricao());

        SessaoJedi sjd = new SessaoJedi();
        sjd.nome = "Instruções de Uso da Força";
        sjd.treinador = new TreinadorJedi("Grão-Mestre", "Fae Coven");
        sjd.addIniciado(new IniciadoJedi("Katooni", "Tholothian", -23));
        sjd.addIniciado(new IniciadoJedi("Byph", "Ithorian", -21));
        sjd.addIniciado(new IniciadoJedi("Gungi", "Wookiee", -23));
        sjd.addIniciado(new IniciadoJedi("Petro", "Human", -22));

        //sjd.getMediaAnoNascimento();

        System.out.println(sjd.getDescricao());

    }
}
