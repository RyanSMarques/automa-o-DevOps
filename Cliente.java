package atividade2;

public class Cliente {
    private String nome;
    private String email;
    private int telefone;


    void Cliente() {
        this.nome = " ";
        this.email = " ";
        this.telefone = 0;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "|---CLIENTES---\n"
                + "|Nome: " + getNome() + " |\n"
                + "|Email: " + getEmail() + " |\n"
                + "|Teleone: " + getTelefone() + " |\n";
    }
}
