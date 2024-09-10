package application;
/*
 * O sistema deve possuir um menu para realizar as seguintes operacoes:
 * cadastrar motoristas*, cadastrar carros, caminhoes e motos
 * registrar manutencoes e rastrear a localizacao dos veiculos
 * O sistema deve incluir as classes: empresa, motorista, veiculo, localidade?
 */

import java.util.Scanner;

import entities.Caminhao;
import entities.Carro;
import entities.Empresa;
import entities.Moto;
import entities.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();
        int opcao;

        do {
            System.out.println("------Menu------");
            System.out.println("1 - Cadastrar motorista");
            System.out.println("2 - Cadastrar veiculo");
            System.out.println("3 - Registrar manutencao");
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

                            Moto moto = new Moto(marca1, modelo1, ano1, cor1, chassi1, cilindrada);
                            empresa.cadastrarVeiculo(moto);

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

                            Carro carro = new Carro(marca2, modelo2, ano2, cor2, chassi2, numeroDePortas,
                                    tipoCombustivel);
                            empresa.cadastrarVeiculo(carro);

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

                            Caminhao caminhao = new Caminhao(marca3, modelo3, ano3, cor3, chassi3, numeroDeEixos,
                                    capacidadeDeCarga);
                            empresa.cadastrarVeiculo(caminhao);

                            break;

                        default:
                            System.out.println("Opcao invalida! Voltando ao menu principal");
                            break;
                    }
                    break;
                case 3:
                    // Funcionalidade para registrar manutencao
                    break;

                case 4:
                    // Funcionalidade para registrar a localizacao
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
                            System.out.println("Opcao invalida! Voltando ao menu principal");
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
