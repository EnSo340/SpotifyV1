package modelos;

public class Audio {


    int posicaoNaPlaylist;
    int anoDeLancamento;
    String nome;
    String autor;
    String inicioAudio;
    String finalAudio;
    String faixa;

    public int getPosicaoNaPlaylist() {
        return posicaoNaPlaylist;
    }

    public void setPosicaoNaPlaylist(int posicaoNaPlaylist) {
        this.posicaoNaPlaylist = posicaoNaPlaylist;
    }

    public Audio(String autor, int anoDeLancamento, String faixa) {

       this.autor = autor;
       this.anoDeLancamento = anoDeLancamento;
       this.faixa = faixa;

    }



    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getInicioAudio() {
        return inicioAudio;
    }

    public void setInicioAudio(String inicioAudio) {
        this.inicioAudio = inicioAudio;
    }

    public String getFinalAudio() {
        return finalAudio;
    }

    public void setFinalAudio(String finalAudio) {
        this.finalAudio = finalAudio;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNomeMusica(String nome) {
    }


    public String getFaixa() {
        return faixa;
    }

    public  void setFaixa(String faixa) {

    }
}
