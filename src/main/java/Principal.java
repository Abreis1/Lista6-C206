import br.inatel.cdg.game.Game;
import br.inatel.cdg.arquivo.Arquivo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo();
        List<Game> listaGames = new ArrayList<>();
        List<Game> listaFiltrada = new ArrayList<>();

        listaGames = arquivo.mapeamento();
        listaFiltrada = arquivo.filtraPlataforma(listaGames,"PS4");
        //listaFiltrada = arquivo.filtraEmpresa(listaGames,"Electronic Arts");

        for(Game g : listaFiltrada){
            System.out.println(g);
        }
    }
}
