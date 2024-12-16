package pessoashospital;

public abstract class Cadastro_Hospital {
    private String nome;
    private String genero;
    private int idade;
    private String email;
    private String telefone;

    // Construtor
    public Cadastro_Hospital(String nome, String genero, int idade, String email, String telefone) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos getter e setter
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método abstrato que precisa ser implementado pelas subclasses
    public abstract void exibirInformacoes();
}
