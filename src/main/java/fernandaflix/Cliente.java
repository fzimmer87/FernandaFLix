package fernandaflix;

public class Cliente {
    //Atributos
    private String nome;
    private String email;
    private String senha;

    public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void setNomeCliente(String novoNome)
    {
        this.nome = novoNome;
    }

    public void setEmail(String novoEmail)
    {
        this.email = novoEmail;
    }

    public void setSenha(String novaSenha)
    {
        this.senha = novaSenha;
    }

    public String getNomeCliente()
    {
        return nome;
    }


    public String getEmail()
    {
        return email;
    }

    public String getSenha()
    {
        return senha;
    }
}
