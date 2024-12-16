package pessoashospital;

public class paciente extends Cadastro_Hospital {
    private String tipoSanguineo;
    private String endereco;
    private String planoSaude;

    public paciente(String nome, String genero, int idade, String email, String telefone, String tipoSanguineo, String endereco, String planoSaude) {
        super(nome, genero, idade, email, telefone);
        this.tipoSanguineo = tipoSanguineo;
        this.endereco = endereco;
        this.planoSaude = planoSaude;
    }

    public String getTipoSanguineo() {
        return this.tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPlanoSaude() {
        return this.planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Idade: " + getIdade());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Tipo Sanguíneo: " + getTipoSanguineo());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Plano de Saúde: " + getPlanoSaude());
    }
}
