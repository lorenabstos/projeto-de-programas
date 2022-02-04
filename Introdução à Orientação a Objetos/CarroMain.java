package LAB3;

public class CarroMain {
    public static void main(String[] args) {
        Proprietario owner = new Proprietario();
        owner.nome = "Emmett L. Brown";
        owner.cnh = 98008173;
        owner.anoNascimento = 1920;
        System.out.println(owner.getDescricao());

        Placa plate = new Placa();
        plate.placa = "OAT-3966";
        plate.tipo = 6;
        System.out.println(plate.getDescricao());

        Motor engine = new Motor();
        engine.tipo = 1;
        engine.capacidade = 2.85;
        engine.potencia = 130;
        System.out.println(engine.getDescricao());

        Carro car = new Carro();
        car.marca = "DeLorean";
        car.modelo = "DMC-12";
        car.proprietario = new Proprietario("Emmett L. Brown", 98008173, 1920);
        car.placa = new Placa("OAT-3966", 6);
        car.motor = new Motor(1, 2.85, 130);
        System.out.println(car.getDescricao());
    }
}
