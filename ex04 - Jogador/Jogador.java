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

