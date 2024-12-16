import pessoashospital.medico;
import pessoashospital.paciente;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Criação dos objetos com a sintaxe correta
        medico medico1 = new medico("Samuel", "H", 29, "samuel123@gmail.com", "123456789", "Ortopedia", "13245");
        
        paciente paciente1 = new paciente("Lay", "F", 16, "lay3@gmail.com", "123456789", "O+", "Rua Taubaté", "Amil");
        
        // Exibição dos nomes
        System.out.println(medico1.getTelefone());
        System.out.println(paciente1.getTelefone());
    }
}
