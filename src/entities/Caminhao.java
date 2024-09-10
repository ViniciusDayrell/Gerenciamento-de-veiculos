package entities;

public class Caminhao extends Veiculo {
    private int numeroDeEixos;
    private double capacidadeDeCarga;

    public Caminhao(String marca, String modelo, int ano, String cor, String chassi, int numeroDeEixos,
            double capacidadeDeCarga) {
        super(marca, modelo, ano, cor, chassi);
        this.numeroDeEixos = numeroDeEixos;
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

}
