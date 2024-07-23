package AparelhoMultifuncional;
import Interfaces.AparelhoTelefone;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefone, NavegadorInternet, ReprodutorMusical {
    public void ligar(String nome) {
        System.out.printf("Ligando para: %s\n", nome);
    }
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página WEB");
    }
    public void adicionarNovaAba(String url) {
        System.out.printf("Acessando: %s\n", url);
    }
    public void atualizarPagina() {
        System.out.println("Pagina Atualiazada");
    }

    public void tocar() {
        System.out.println("Musica tocando");
    }
    public void pausar() {
        System.out.println("Musica pausada");
    }
    public void selecionarMusica(String musica) {
        System.out.printf("Musica selecionada %s\n", musica);
    }
}
