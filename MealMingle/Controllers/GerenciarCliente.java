package MealMingle.Controllers;

import java.util.ArrayList;
import java.util.List;

import MealMingle.Models.Cliente;

public class GerenciarCliente {
    
    public static List<Cliente> clientes = new ArrayList<>();

    public static void adicionarCliente(String cpf, String username, String endereco, String email) {
        Cliente novoCliente = new Cliente(cpf, username, endereco, email);
        clientes.add(novoCliente);
    }
    
    public static void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("CPF: " + cliente.getCpf() + " | Cliente: " + cliente.getUsername() + " | Email: " + cliente.getEmail());
        }
    }

    public static void atualizarCliente(String cpf, String username, String email, String endereco) {
        for(Cliente cliente : clientes) {
            if(cliente.getCpf().equals(cpf)) {
                cliente.setUsername(username);
                cliente.setEmail(email);
                cliente.setEndereco(endereco);
                break;
            }
        }
    }

    public static void removerCliente(String cpf) {
        int index = 0;
        for (Cliente cliente : clientes) {
            if(cliente.getCpf().equals(cpf)){
                clientes.remove(index);
                break;
            }
        index++;
        }
    }
}