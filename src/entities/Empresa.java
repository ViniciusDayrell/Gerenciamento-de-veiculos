package entities;

import java.util.ArrayList;
import java.util.List;
/*
 * A classe deve possuir metodos para cadastrarMotorista(), cadastrarVeiculo(),
 * registrarManutencao()
 */

public class Empresa {
    private List<Motorista> motoristas;
    private List<Veiculo> veiculos;
    private List<Veiculo> veiculosEmManutencao;

    public Empresa() {
        this.motoristas = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.veiculosEmManutencao = new ArrayList<>();
    }

    public Empresa(List<Motorista> motorista, List<Veiculo> veiculo, List<Veiculo> veiculoEmManutencao) {
        this.motoristas = motorista;
        this.veiculos = veiculo;
        this.veiculosEmManutencao = veiculoEmManutencao;
    }

    public void cadastrarMotorista(Motorista motorista) {
        motoristas.add(motorista);
        System.out.println("O motorista " + motorista.getNome() + " foi cadastrado!");
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("O veiculo " + veiculo.getMarca() + " " + veiculo.getModelo() + " foi cadastrado!");
    }

    public void listarMotoristas() {
        for (Motorista motorista : motoristas) {
            System.out.println(motorista);
        }
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    public void buscaMotorista(String cpf) {
        for (Motorista motorista : motoristas) {
            if (motorista.getCpf().equals(cpf)) {
                System.out.println(motorista);
            }
        }
    }

    public void buscaVeiculo(String chassi) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getChassi().equalsIgnoreCase(chassi)) {
                System.out.println(veiculo);
            }
        }
    }

    public void registrarManutencao(Veiculo veiculo) {
        veiculosEmManutencao.add(veiculo);
        veiculo.realizarManutencao();
    }

}
