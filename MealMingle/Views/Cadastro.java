package MealMingle.Views;

import MealMingle.Controllers.GerenciarCliente;
import MealMingle.Models.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    public static List<Cliente> clientes = new ArrayList<>();

    public static void cadastroCliente(Scanner scanner) {

        System.out.println("Informe o CPF do cliente:");
        String cpf = scanner.nextLine();

        System.out.println("Informe o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Informe o endereço do cliente:");
        String endereco = scanner.nextLine();

        System.out.println("Informe o e-mail do cliente:");
        String email = scanner.nextLine();

        GerenciarCliente.adicionarCliente(cpf, nome, endereco, email);
        
    }

    public static void atualizarCliente(Scanner scanner) {

        System.out.println("Informe o CPF do cliente:");
        String cpf = scanner.nextLine();
        
        System.out.println("Agora, para atualizar os dados do cliente, informe os seguintes dados:");
        System.out.print("    Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("    Endereço: ");
        String endereco = scanner.nextLine();
        
        System.out.print("    E-mail: ");
        String email = scanner.nextLine();

        GerenciarCliente.atualizarCliente(cpf, nome, email, endereco);

    }

    public static void removerCliente(Scanner scanner) {

        System.out.println("Informe o CPF do cliente a ser removido: ");
        String cpf = scanner.nextLine();
        
        GerenciarCliente.removerCliente(cpf);

    }
}