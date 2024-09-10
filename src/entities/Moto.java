package entities;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, String cor, String chassi, int cilindrada) {
        super(marca, modelo, ano, cor, chassi);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

}
