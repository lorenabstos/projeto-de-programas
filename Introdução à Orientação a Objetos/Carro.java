package LAB3;

public class Carro {
    Motor motor;
    Placa placa;
    Proprietario proprietario;

    String marca, modelo;

    Carro() {
        this("", "", null, null, null);
    }

    Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }

    public String getDescricao() {
        return ("LAB3.Carro " + marca + "/" + modelo + ". " + proprietario.getDescricao() + placa.getDescricao() + motor.getDescricao());
    }
}
