package entities;

public class Carro extends Veiculo {
    private int numPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, String cor, String chassi, int numPortas,
            String tipoCombustivel) {
        super(marca, modelo, ano, cor, chassi);
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

}
