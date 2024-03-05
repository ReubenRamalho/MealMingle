package MealMingle.Models;

public class Cliente extends UsuarioAbstrato {
    
    private String cpf;

    public Cliente(String cpf, String username, String endereco, String email) {
        super(username, endereco, email);
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

}


