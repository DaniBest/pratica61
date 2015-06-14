
import java.util.HashMap;
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {

    public static void main(String[] args) {

        Time time1 = new Time();
        
        time1.addJogador("Zagueiro", new Jogador(4, "David Luiz"));
        time1.addJogador("Goleiro", new Jogador(12, "Júlio César"));
        time1.addJogador("Lateral", new Jogador(20, "Daniel Alves"));
        time1.addJogador("Atacante", new Jogador(10, "Neymar"));
        time1.addJogador("Técnico", new Jogador(0, "Filipon"));

        Time time2 = new Time();
        time2.addJogador("Goleiro", new Jogador(1, "Bagual"));
        time2.addJogador("Zagueiro", new Jogador(2, "Pereba"));
        time2.addJogador("Lateral", new Jogador(7, "Drácula"));
        time2.addJogador("Atacante", new Jogador(11, "Droga"));
        time2.addJogador("Técnico", new Jogador(0, "Cauquete"));

        System.out.println("Posição     Time 1               Time 2");
        Set<String> posicoes = time1.getJogadores().keySet();

        for (String posicao : posicoes) {
            System.out.println(posicao + "     " + time1.getJogadores().get(posicao) + "         " + time2.getJogadores().get(posicao));
        }

    }
}
