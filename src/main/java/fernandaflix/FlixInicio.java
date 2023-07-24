package fernandaflix;

import java.util.Scanner;

public abstract class FlixInicio {

    //atributos:
    private String titulo;
    private int anoLancamento;
    private String genero;
    private float duracao;
    private String classificacao;



    FlixInicio(String titulo, int anoLancamento, String genero, float duracao, String classificacao) {
        this.titulo = titulo;
        this.anoLancamento= anoLancamento;
        this.genero= genero;
        this.duracao = (float) duracao;
        this.classificacao =classificacao;



    }

    //metodo:
    public String getTitulo() {
       return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public float getDuracao() {
       return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public void setGenero() {
        this.genero=genero;
    }

    public String getGenero() {
        return genero;
    }
    public String getClassificacao(){
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}


