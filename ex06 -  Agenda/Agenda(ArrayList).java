public class Agenda {


    List<Contato> contatos = new ArrayList<>();

    public void adionarContatos(Contato contato){
    contatos.add(contato);
    }


    public void buscarContato(String nomeProcurado) {
       boolean encontrar = false;
        for (Contato contato : contatos) {
            if (Objects.equals(nomeProcurado, contato.getNome())) {
                System.out.println("Nome: "+contato.getNome());
                System.out.println("Telefone: "+contato.getTelefone());
                encontrar = true ;
            } else {
                System.out.println("Contato não encontrado!");
            }
        }
    }
    public boolean removerContato(String nomeRemover) {

        for (Contato contato : contatos) {
            if (Objects.equals(nomeRemover, contato.getNome())) {
                System.out.println("Nome: "+contato.getNome());
                System.out.println("Telefone: "+contato.getTelefone());
               contatos.remove(contato);
                System.out.println("Contato removido com sucesso!");
                return true;
            }
        }
        System.out.println("Contato não encontrado!");
        return false;
    }

}
