package fernandaflix;

public class Cliente {
    private String nomeCliente;
    private int idade;
    private String email;
    private String senha;

    public void Cliente(String nomeCliente, int idade, String email) {
        this.nomeCliente=nomeCliente;
        this.idade=idade;
        this.email=email;
        this.senha=senha;

    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
