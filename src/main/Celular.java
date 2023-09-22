package main;

public class Celular {

    private Navegador navegador;

    private ReprodutorMusical musicas;

    private Telefone telefone;

    public Celular() {
        this.telefone = new Telefone();
        this.musicas = new ReprodutorMusical();
        this.navegador = new Navegador();
    }

    public Navegador getNavegador() {
        return navegador;
    }

    public ReprodutorMusical getMusicas() {
        return musicas;
    }

    public Telefone getTelefone() {
        return telefone;
    }
    
}
