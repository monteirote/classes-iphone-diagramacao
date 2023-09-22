package main;
public class App {
    public static void main(String[] args) throws Exception {
        
        Celular iphone = new Celular();

        iphone.getMusicas().getMusicaAtual();
        iphone.getMusicas().pausarMusica();
        iphone.getMusicas().selecionarMusica("Circles");

        iphone.getNavegador().adicionarNovaAba();
        iphone.getNavegador().atualizarPagina();
        iphone.getNavegador().exibirPagina("Google");

        iphone.getTelefone().ligar("Mãe");
        iphone.getTelefone().atender();
        iphone.getTelefone().iniciarCorreioDeVoz();
    }
}
