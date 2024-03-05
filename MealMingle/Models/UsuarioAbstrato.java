package MealMingle.Models;

public abstract class UsuarioAbstrato implements UsuarioIF {
    
    protected String username;
    protected String endereco;
    protected String email;

    public UsuarioAbstrato(String username, String endereco, String email) {
        this.username = username;
        this.endereco = endereco;
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getEmail() {
        return this.email;
    }

}
