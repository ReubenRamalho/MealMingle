package MealMingle.Models;

public class Restaurante extends UsuarioAbstrato {
    
    private String cnpj;
    private String username;
    private String endereco;
    private String email;

    public Restaurante(String cnpj, String username, String endereco, String email) {
        super(username, endereco, email);
        this.cnpj = cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return this.cnpj;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    // Métodos específicos do restaurante, se houver
}
