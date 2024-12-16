package pessoashospital;

public class medico extends Cadastro_Hospital {
    private String especialidade;
    private String CRM;

    public medico(String nome, String genero, int idade, String email, String telefone, String especialidade, String CRM) {
        super(nome, genero, idade, email, telefone);
        this.especialidade = especialidade;
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return this.CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Idade: " + getIdade());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("CRM: " + getCRM());
    }
}
