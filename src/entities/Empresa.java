package entities;

import java.util.ArrayList;
import java.util.List;

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
            System.out.println();
        }
    }

    public void listarVeiculos() {
        System.out.println("Motos:");
        for (Veiculo veiculo1 : veiculos) {
            if (veiculo1 instanceof Moto) {
                System.out.println(veiculo1);
                System.out.println();
            }
        }

        System.out.println("Carros:");
        for (Veiculo veiculo2 : veiculos) {
            if (veiculo2 instanceof Carro) {
                System.out.println(veiculo2);
                System.out.println();
            }
        }

        System.out.println("Caminhoes:");
        for (Veiculo veiculo3 : veiculos) {
            if (veiculo3 instanceof Caminhao) {
                System.out.println(veiculo3);
                System.out.println();
            }
        }
    }

    public Motorista buscaMotorista(String cpf) {
        for (Motorista motorista : motoristas) {
            if (motorista.getCpf().equalsIgnoreCase(cpf)) {
                return motorista;
            }
        }
        return null;
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
