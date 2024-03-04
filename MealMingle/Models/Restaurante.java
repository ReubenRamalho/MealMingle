package MealMingle.Models;

public class Restaurante extends UsuarioAbstrato {
    
    private String categoria;

    public Restaurante(String id, String nome, String categoria) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }

    // Métodos específicos do restaurante, se houver
}
