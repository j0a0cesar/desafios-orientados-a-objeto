import java.util.ArrayList;
import java.util.Objects;

public class Agenda {

    Contato[] contatos = new Contato[5];
    int count = 0;

    public void adicionarContato(Contato novoContato) {

        if (count < 5) {
            contatos[count] = novoContato;
            count++;
            System.out.println("Novo contato salvo!");
        } else {
            System.out.println("Agenda cheia!Não é mais possível adicionar mais contatos.");
        }
    }

    public Contato buscarContato(String nomeProcurado) {

        for (int i = 0; i < count; i++) {
            if (Objects.equals(nomeProcurado, contatos[i].getNome())) {
                return contatos[i];
            }
        }
        System.out.println("Contato não encontrado!");
        return null;
    }
    public boolean removerContato(String nomeProcurado) {

        for (int i = 0; i < count; i++) {
            if (Objects.equals(nomeProcurado, contatos[i].getNome())) {
                for(int j = i; j < count - 1;j ++){
                    contatos[j] = contatos[j+1];
                }
                contatos[count-1] = null;
                count--;
                System.out.print("Contato removido com sucesso!");
                return true;
            }
        }
        System.out.println("Contato não encontrado!");
        return false;
    }

}




