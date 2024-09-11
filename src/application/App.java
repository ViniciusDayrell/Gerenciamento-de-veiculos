package application;
/*
 * O sistema deve possuir um menu para realizar as seguintes operacoes:
 * cadastrar motoristas, cadastrar carros, caminhoes e motos
 * registrar manutencoes e rastrear a localizacao dos veiculos
 * O sistema deve incluir as classes: empresa, motorista, veiculo, localidade?
 */

import java.util.Scanner;

import entities.Caminhao;
import entities.Carro;
import entities.Empresa;
import entities.Moto;
import entities.Motorista;
import entities.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int opcao;

        do {
            System.out.println("------Menu------");
            System.out.println("1 - Cadastrar motorista");
            System.out.println("2 - Cadastrar veiculo");
            System.out.println("3 - Manutencao");
            System.out.println("4 - Localizacao");
            System.out.println("5 - Listagens");
            System.out.println("6 - Sair");
            System.out.printf("Escolha uma opcao: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("------Cadastro de Motorista------");
                    System.out.printf("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.printf("Idade: ");
                    int idade = sc.nextInt();
                    System.out.printf("CPF: ");
                    sc.nextLine();
                    String cpf = sc.nextLine();
                    System.out.printf("Categoria da CNH: ");
                    String categoria = sc.nextLine();
                    if (empresa.buscaMotorista(cpf) == null) {
                        Motorista motorista = new Motorista(nome, idade, cpf, categoria);
                        empresa.cadastrarMotorista(motorista);
                    } else {
                        System.out.println("Motorista ja cadastrado!");
                    }
                    break;

                case 2:
                    // Funcionalidade para cadastrar veiculos
                    System.out.println("------Cadastro de Veiculos------");
                    System.out.println("1 - Cadastro de moto");
                    System.out.println("2 - Cadastro de carro");
                    System.out.println("3 - Cadastro de caminhao");
                    System.out.printf("Escolha uma opcao: ");
                    int tipo = sc.nextInt();
                    switch (tipo) {
                        case 1:
                            System.out.println("------Cadastro de Moto------");
                            System.out.printf("Marca: ");
                            sc.nextLine();
                            String marca1 = sc.nextLine();
                            System.out.printf("Modelo: ");
                            String modelo1 = sc.nextLine();
                            System.out.printf("Ano: ");
                            int ano1 = sc.nextInt();
                            System.out.printf("Cor: ");
                            sc.nextLine();
                            String cor1 = sc.nextLine();
                            System.out.printf("Chassi: ");
                            String chassi1 = sc.nextLine();
                            System.out.printf("Cilindrada: ");
                            int cilindrada = sc.nextInt();

                            if (empresa.buscaVeiculo(chassi1) == null) {
                                Moto moto = new Moto(marca1, modelo1, ano1, cor1, chassi1, cilindrada);
                                empresa.cadastrarVeiculo(moto);
                            } else {
                                System.out.println("Veiculo ja cadastrado!");
                            }

                            break;

                        case 2:
                            System.out.println("------Cadastro de Carro------");
                            System.out.printf("Marca: ");
                            String marca2 = sc.nextLine();
                            System.out.printf("Modelo: ");
                            String modelo2 = sc.nextLine();
                            System.out.printf("Ano: ");
                            int ano2 = sc.nextInt();
                            System.out.printf("Cor: ");
                            String cor2 = sc.nextLine();
                            System.out.printf("Chassi: ");
                            String chassi2 = sc.nextLine();
                            System.out.printf("Numero de portas: ");
                            int numeroDePortas = sc.nextInt();
                            System.out.printf("Tipo de combustivel: ");
                            String tipoCombustivel = sc.nextLine();

                            if (empresa.buscaVeiculo(chassi2) == null) {
                                Carro carro = new Carro(marca2, modelo2, ano2, cor2, chassi2, numeroDePortas,
                                        tipoCombustivel);
                                empresa.cadastrarVeiculo(carro);
                            } else {
                                System.out.println("Veiculo ja cadastrado!");
                            }

                            break;

                        case 3:
                            System.out.println("------Cadastro de Caminhao------");
                            System.out.printf("Marca: ");
                            String marca3 = sc.nextLine();
                            System.out.printf("Modelo: ");
                            String modelo3 = sc.nextLine();
                            System.out.printf("Ano: ");
                            int ano3 = sc.nextInt();
                            System.out.printf("Cor: ");
                            String cor3 = sc.nextLine();
                            System.out.printf("Chassi: ");
                            String chassi3 = sc.nextLine();
                            System.out.printf("Numero de eixos: ");
                            int numeroDeEixos = sc.nextInt();
                            System.out.printf("Capacidade de Carga: ");
                            double capacidadeDeCarga = sc.nextDouble();

                            if (empresa.buscaVeiculo(chassi3) == null) {
                                Caminhao caminhao = new Caminhao(marca3, modelo3, ano3, cor3, chassi3, numeroDeEixos,
                                        capacidadeDeCarga);
                                empresa.cadastrarVeiculo(caminhao);
                            } else {
                                System.out.println("Veiculo ja cadastrado!");
                            }

                            break;

                        default:
                            System.out.println("Opcao invalida! Voltando ao menu principal");
                            break;
                    }
                    break;
                case 3:
                    // Funcionalidade para registrar manutencao
                    System.out.println("------Manutencao------");
                    System.out.println("1 - Registrar manutencao");
                    System.out.println("2 - Finalizar manutencao");
                    System.out.println("3 - Veiculos em manutencao");
                    System.out.printf("Escolha uma opcao: ");
                    int manutencao = sc.nextInt();
                    switch (manutencao) {
                        case 1:
                            System.out.println("------Registrar Manutencao------");
                            System.out.printf("Entre com o chassi do veiculo: ");
                            sc.nextLine();
                            String registro = sc.nextLine();
                            Veiculo veiculo = empresa.buscaVeiculo(registro);
                            if (veiculo == null) {
                                System.out.println("Veiculo nao cadastrado!");
                            } else if (empresa.isEmManutecao(veiculo)) {
                                System.out.println("O veiculo " + veiculo.getMarca() + " " + veiculo.getModelo()
                                        + " ja esta em manutencao!");
                            } else {
                                empresa.registrarManutencao(veiculo);
                            }
                            break;

                        case 2:
                            System.out.println("------Finalizar Manutencao------");
                            System.out.printf("Entre com o chassi do veiculo: ");
                            sc.nextLine();
                            String finaliza = sc.nextLine();
                            Veiculo veiculo2 = empresa.buscaVeiculo(finaliza);
                            if (veiculo2 == null) {
                                System.out.println("Veiculo nao cadastrado!");
                            } else if (!empresa.isEmManutecao(veiculo2)) {
                                System.out.println("O veiculo " + veiculo2.getMarca() + " " + veiculo2.getModelo()
                                        + " nao esta em manutencao!");
                            } else {
                                empresa.finalizarManutencao(veiculo2);
                            }
                            break;

                        case 3:
                            System.out.println("------Veiculos em manutencao------");
                            empresa.listarVeiculosEmManutencao();
                            break;

                        default:
                            System.out.println("Opcao invalida! Voltando ao menu principal");
                            break;
                    }
                    break;

                case 4:
                    // Funcionalidade para registrar a localizacao
                    System.out.println("------Rastreamento de veiculos------");
                    System.out.println("1 - Atualizar cidade de um veiculo");
                    System.out.println("2 - Visualizar cidade de um veiculo");
                    System.out.printf("Escolha uma opcao: ");
                    int local = sc.nextInt();
                    switch (local) {
                        case 1:
                            System.out.printf("Entre com o chassi do veiculo: ");
                            sc.nextLine();
                            String chassi = sc.nextLine();
                            Veiculo veiculo = empresa.buscaVeiculo(chassi);
                            if (veiculo == null) {
                                System.out.println("Veiculo nao cadastrado!");
                            } else {
                                System.out.printf("Informe a cidade: ");
                                String cidade = sc.nextLine();
                                veiculo.setCidade(cidade);
                                System.out.println("Cidade atualizada!");
                            }

                            break;

                        case 2:
                            System.out.printf("Entre com o chassi do veiculo: ");
                            sc.nextLine();
                            String chassiBusca = sc.nextLine();
                            Veiculo veiculo2 = empresa.buscaVeiculo(chassiBusca);
                            if (veiculo2 == null) {
                                System.out.println("Veiculo nao cadastrado!");
                            } else {
                                System.out.println("Localizacao do veiculo:");
                                System.out.println("Veiculo: " + veiculo2.getMarca() + veiculo2.getModelo());
                                System.out.println("Cidade: " + veiculo2.getCidade());
                            }
                            break;

                        default:
                            System.out.println("Opcao invalida! Voltando ao menu principal");
                            break;
                    }
                    break;

                case 5:
                    // Funcionalidade para listagens
                    System.out.println("------Listagens------");
                    System.out.println("1 - Listar motoristas cadastrados");
                    System.out.println("2 - Listar veiculos cadastrados");
                    System.out.printf("Escolha uma opcao: ");
                    int lista = sc.nextInt();
                    switch (lista) {
                        case 1:
                            System.out.println("------Motoristas cadastrados------");
                            empresa.listarMotoristas();
                            break;

                        case 2:
                            System.out.println("------Veiculos cadastrados------");
                            empresa.listarVeiculos();
                            break;

                        default:
                            System.out.println("Opcao invalida! Voltando ao menu principal");
                            break;

                    }
                    break;

                default:
                    break;
            }

        } while (opcao != 6);

        sc.close();
    }
}
