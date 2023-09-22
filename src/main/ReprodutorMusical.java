package main;

public class ReprodutorMusical {

    private String musicaAtual;

    public void tocarMusica() {
        System.out.println("Musica tocando!!");
    }

    public void pausarMusica() {
        System.out.println("Musica pausada!!");
    }

    public void selecionarMusica(String tituloMusica) {
        this.musicaAtual = tituloMusica;
        System.out.println("A musica atual é " + musicaAtual);
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }
    
}
