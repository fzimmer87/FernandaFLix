package fernandaflix;

public class Series extends FlixInicio {
    private int Temporadas;
    public Series(String titulo, int anoLancamento, String genero, int duracao, String classificacao, int temporadas) {
        super(titulo, anoLancamento, genero, duracao, classificacao);
        this.Temporadas=temporadas;

    }

public int getTemporadas(){
        return Temporadas;
}



}

