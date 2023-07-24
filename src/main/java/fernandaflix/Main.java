package fernandaflix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FlixInicio[] contagem=new FlixInicio[9];
        Scanner teclado = new Scanner(System.in);




        Filmes filme1 = new Filmes("Matrix", 2001, "Ação", (int) 2.15, "12 anos");
        contagem[1]=filme1;
        Filmes filme2= new Filmes("Cinderela",1999,"Desenho", (int) 1.55,"10 anos");
        contagem[2]=filme1;
        Filmes filme3= new Filmes("A casa de cera",2005,"Terror", (int) 2.45,"14 anos");
        contagem[3]=filme1;
        Filmes filme4= new Filmes("A Ilha do Medo",2012,"Suspense", (int) 2.36,"14 anos");
        contagem[4]=filme1;
        Filmes filme5= new Filmes("A Cabana",2012,"Drama", (int) 3.10,"12 anos");
        contagem[5]=filme1;
        Series serie1=new Series("The Walking Dead",2004,"Terror", (int) 1.01,"12 anos",13);
        contagem[6]=filme1;
        Series serie2=new Series("Stranger Things",2018,"Terror/Suspense",1,"12 anos",4);
        contagem[7]=filme1;
        Series serie3=new Series("Game of Thrones",2019,"Ação", (int) 2.3,"16 anos",4);
        contagem[8]=filme1;


        System.out.println("Digite seu nome ");
        String nome = teclado.nextLine();

        System.out.println("Digite seu email ");
        String email = teclado.nextLine();

        System.out.println("Digite sua senha ");
        String senha = teclado.nextLine();

        Cliente novoCliente =new Cliente();
        novoCliente.setNomeCliente(nome);


        System.out.println("Olá "+novoCliente.getNomeCliente()+" Seja Bem-Vinda a FernandaFlix");
        System.out.println("**************************************************************************");
        System.out.println("Os Filmes e Séries disponíveis são:");
        for (int contador=0; contador<8;contador++) {
            System.out.println("Titulo: " + filme1.getTitulo());
            System.out.println("Genero: "+ filme1.getGenero());
            System.out.println("Classificação: "+filme1.getClassificacao());
            contador=1;
            System.out.println("**************************************************************************");
            System.out.println("Titulo: " + filme2.getTitulo());
            System.out.println("Genero: "+ filme2.getGenero());
            System.out.println("Classificação: "+filme2.getClassificacao());
            contador=2;
            System.out.println("**************************************************************************");
            System.out.println("Titulo: " + filme3.getTitulo());
            System.out.println("Genero: "+ filme3.getGenero());
            System.out.println("Classificação: "+filme3.getClassificacao());
            contador=3;
            System.out.println("**************************************************************************");
            System.out.println("Titulo: " + filme4.getTitulo());
            System.out.println("Genero: "+ filme4.getGenero());
            System.out.println("Classificação: "+filme4.getClassificacao());
            contador=4;
            System.out.println("**************************************************************************");
            System.out.println("Titulo: " + filme5.getTitulo());
            System.out.println("Genero: "+ filme5.getGenero());
            System.out.println("Classificação: "+filme5.getClassificacao());
            contador=5;
            System.out.println("**************************************************************************");
            System.out.println("Titulo: " + serie1.getTitulo());
            System.out.println("Genero: "+ serie1.getGenero());
            System.out.println("Classificação: "+serie1.getClassificacao());
            System.out.println("Temporadas: "+serie1.getTemporadas());
            contador=6;
            System.out.println("**************************************************************************");
            System.out.println("Titulo: " + serie2.getTitulo());
            System.out.println("Genero: "+ serie2.getGenero());
            System.out.println("Classificação: "+serie2.getClassificacao());
            System.out.println("Temporadas: "+serie2.getTemporadas());
            contador=7;
            System.out.println("**************************************************************************");
            System.out.println("Titulo: " + serie3.getTitulo());
            System.out.println("Genero: "+ serie3.getGenero());
            System.out.println("Classificação: "+serie3.getClassificacao());
            System.out.println("Temporadas: "+serie3.getTemporadas());
            contador=8;
        }
        System.out.println("*************************************************************************");

        int opcao;
        do {
            System.out.println("Digite o filme ou Série que deseja assistir: ");
            String filme = teclado.nextLine();

            System.out.println("Você escolheu assistir " + filme);



            System.out.println("------------------------------------------------------------------------");

            Scanner entrada = new Scanner(System.in);

            opcao = 0;
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Iniciar Filme");
            System.out.println("2 - Escolher outro filme");
            System.out.println("OPCAO: ");
            opcao = entrada.nextInt();

        } while (opcao == 2);

        if (opcao == 2) {
            // Se a variável for igual a 2, a frase abaixo será escrita
            System.out.println("Volte ao Menu Inicial e escolha novamente");
        } else {
            // Caso contrário, a frase abaixo será escrita
            System.out.println("Aproveite seu filme " + nome + "!!!!");
        }


    }
}
