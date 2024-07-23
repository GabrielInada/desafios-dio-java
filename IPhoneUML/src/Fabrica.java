import AparelhoMultifuncional.Iphone;

public class Fabrica {
    public static void main(String[] args) {
        // novo objeto da classe Iphone
        Iphone iphone = new Iphone();

        // exemplo de alguns dos métodos funcionando
        iphone.ligar("Gabriel");
        iphone.selecionarMusica("Test Drive: How to train your dragon");
        iphone.adicionarNovaAba("https://www.google.com.br/");

        // os métodos não fazem basicamente nada, mas é só para representar alguma coisa
        // um dia eu faço eles funcionarem de verdade... quem sabe...
    }
}
