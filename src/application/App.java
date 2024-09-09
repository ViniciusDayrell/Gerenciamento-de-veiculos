package application;
/*
 * O sistema deve possuir um menu para realizar as seguintes operacoes:
 * cadastrar motoristas, cadastrar carros, caminhoes e motos
 * registrar manutencoes e rastrear a localizacao dos veiculos
 * O sistema deve incluir as classes: empresa, motorista, veiculo, localidade?
 */

import java.util.Scanner;

import entities.Empresa;
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
                    if (empresa.buscaMotorista(cpf)) {
                        System.out.println("Motorista ja cadastrado!");
                    } else {
                        Motorista motorista = new Motorista(nome, idade, cpf, categoria);
                        empresa.cadastrarMotorista(motorista);
                    }
                    break;

                case 2:
                    // Funcionalidade para cadastrar veiculos
                    break;
                case 3:
                    // Funcionalidade para registrar manutencao
                    break;

                case 4:
                    // Funcionalidade para registrar a localizacao
                    break;

                case 5:
                    // Funcionalidade para listagens

                default:
                    break;
            }

        } while (opcao != 6);

        sc.close();
    }
}
