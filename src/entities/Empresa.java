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
        boolean existemMotos = false;
        boolean existemCarros = false;
        boolean existemCaminhoes = false;

        // Verifica se existem veiculos de cada tipo
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                existemMotos = true;
                break;
            }
        }

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Carro) {
                existemCarros = true;
                break;
            }
        }

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Caminhao) {
                existemCaminhoes = true;
                break;
            }
        }

        // Faz a listagem dos veiculos caso existao
        if (existemMotos) {
            System.out.println("Motos:");
            for (Veiculo veiculo : veiculos) {
                if (veiculo instanceof Moto) {
                    System.out.println(veiculo);
                    System.out.println();
                }
            }
        }

        if (existemCarros) {
            System.out.println("Carros:");
            for (Veiculo veiculo : veiculos) {
                if (veiculo instanceof Carro) {
                    System.out.println(veiculo);
                    System.out.println();
                }
            }
        }

        if (existemCaminhoes) {
            System.out.println("Caminhoes:");
            for (Veiculo veiculo : veiculos) {
                if (veiculo instanceof Caminhao) {
                    System.out.println(veiculo);
                    System.out.println();
                }
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

    public Veiculo buscaVeiculo(String chassi) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getChassi().equalsIgnoreCase(chassi)) {
                return veiculo;
            }
        }
        return null;
    }

    public void registrarManutencao(Veiculo veiculo) {
        veiculosEmManutencao.add(veiculo);
        veiculo.realizarManutencao();
    }

}
