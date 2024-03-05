import java.util.Scanner;

import MealMingle.Controllers.GerenciarCliente;
import MealMingle.Views.Cadastro;

public class menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n*** Sistema de Cadastro de Clientes ***\n");
            System.out.println("  1. Adicionar Cliente");
            System.out.println("  2. Listar Clientes");
            System.out.println("  3. Atualizar Cliente");
            System.out.println("  4. Remover Cliente");
            System.out.println("  5. Sair\n");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    Cadastro.cadastroCliente(scanner);
                    break;
                case 2:
                    GerenciarCliente.listarClientes();
                    break;
                case 3:
                    Cadastro.atualizarCliente(scanner);
                    break;
                case 4:
                    Cadastro.removerCliente(scanner);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}