import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Main{
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Poderoso BILL");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);

        meuFilme.exibeFichaTecnica();
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media das avaliações: " + meuFilme.obterMedia());

        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();


        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);


        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);


        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);



        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotaDeVisualisacoes(300);

        filtro.filtra(episodio);


    }


}