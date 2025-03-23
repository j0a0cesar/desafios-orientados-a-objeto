/*Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebe
uma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criar
um sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiria
acompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizada
e automatizada.
Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema de
gerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. O
sistema deve permitir a criação de perfis de jogadores, armazenando informações como nome,
pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no
sistema. Dica:
“Crie a classe `Jogador`, que deverá conter atributos privados para o `nome`, `pontuacao` e `nivel`
do jogador. Inclua um construtor para inicializar esses atributos e métodos públicos para permitir
a manipulação segura dessas informações — por exemplo, métodos para aumentar a pontuação,
subir de nível e exibir as informações do jogador.”*/
public class Jogador {
    private String nome;
    private float pontuacao;
    private int nivel;

    public Jogador(String nome, float pontuacao, int nivel){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }
    public String getNome(){
        return this.nome;
    }
    public  float getPontuacao(){
        return this.pontuacao;
    }
    public int getNivel(){
        return  this.nivel;
    }
    public void ranks(){
        if(pontuacao < 250){
            nivel = 1;
        } else if (pontuacao < 500){
            nivel = 2;
        } else if (pontuacao < 750) {
            nivel = 3;
        } else{
            nivel = 4;
        }
    }
    public void setPontuacao(float pontuacao){
        this.pontuacao = pontuacao;
        ranks();
    }
    public void exibirInfo(){
        System.out.println("Nome: "+getNome());
        System.out.println("Pontução: "+getPontuacao());
        System.out.println("Nivel: "+getNivel());

    }
}

