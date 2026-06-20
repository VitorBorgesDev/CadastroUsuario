package Model;

public class Usuario {
    private String nome;
    private int id;
    private String email;


    public Usuario(String nome, int id, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                ", senha='" + email + '\'' +
                '}';
    }
}

