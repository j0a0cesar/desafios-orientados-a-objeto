import java.util.ArrayList;


public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();


    public void adicionarContato(Contato novoContato) {
        contatos.add(novoContato);
        System.out.println("Novo contato salvo!");
    }

    public Contato buscarContato(String nomeProcurado) {

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nomeProcurado)) {
                return contato;
            }
        }
            System.out.println("Contato não encontrado!");
            return null;
    }
    public boolean removerContato(String nome) {
        Contato c = buscarContato(nome);
        if(c != null) {
            contatos.remove(c);
            return true;
        }
        return false;
    }
}




