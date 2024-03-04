package MealMingle.Models;

public class Cliente extends UsuarioAbstrato {
    
    private String cpf;
    private String nome;
    private String endereco;
    private String email;

    public Cliente(String id, String cpf, String nome, String endereco, String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    // Métodos específicos do cliente, se houver
}


