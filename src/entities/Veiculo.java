package entities;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String chassi;
    private String cidade;

    public Veiculo(String marca, String modelo, int ano, String cor, String chassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.chassi = chassi;
        this.cidade = "Indefinido";
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getChassi() {
        return chassi;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Veiculo = "
                + marca
                + " "
                + modelo
                + ", ano: "
                + ano
                + ", cor: "
                + cor;
    }

}
