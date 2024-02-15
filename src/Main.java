import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        Contato contato = new Contato();
        contato.setNome("André");
        contato.setIdade(20);
        contato.setDataCadastro(new Date());

        agenda.save(contato);
    }
}
