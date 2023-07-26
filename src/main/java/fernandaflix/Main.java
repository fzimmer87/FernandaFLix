package fernandaflix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Criando array de filmes e séries
        List<Filmes> filmesList = new ArrayList<>();
        List<Series> seriesList = new ArrayList<>();

        //Add Filmes
        Filmes filme1 = new Filmes("Matrix", 2001, "Ação", (int) 2.15, "12 anos");
        filmesList.add(filme1);

        Filmes filme2= new Filmes("Cinderela",1999,"Desenho", (int) 1.55,"10 anos");
        filmesList.add(filme2);

        Filmes filme3= new Filmes("A casa de cera",2005,"Terror", (int) 2.45,"14 anos");
        filmesList.add(filme3);

        Filmes filme4= new Filmes("A Ilha do Medo",2012,"Suspense", (int) 2.36,"14 anos");
        filmesList.add(filme4);

        Filmes filme5= new Filmes("A Cabana",2012,"Drama", (int) 3.10,"12 anos");
        filmesList.add(filme5);

        //Add Séries
        Series serie1=new Series("The Walking Dead",2004,"Terror", (int) 1.01,"12 anos",13);
        seriesList.add(serie1);

        Series serie2=new Series("Stranger Things",2018,"Terror/Suspense",1,"12 anos",4);
        seriesList.add(serie2);

        Series serie3=new Series("Game of Thrones",2019,"Ação", (int) 2.3,"16 anos",4);
        seriesList.add(serie3);

        Integer dadosCorretos = 2;

        //Enquanto os dados não estiverem corretos
         while (dadosCorretos != 1){
             System.out.println("Digite seu nome ");
             String nome = teclado.nextLine();

             System.out.println("Digite seu email ");
             String email = teclado.nextLine();

             System.out.println("Digite sua senha ");
             String senha = teclado.nextLine();

             Cliente novoCliente =new Cliente(nome, email, senha);

             //Boas vindas
             System.out.println("Olá "+novoCliente.getNomeCliente()+" Seja Bem-Vinda a FernandaFlix");
             System.out.println("**************************************************************************");

             //Confirmação dos dados cadastrados
             System.out.println("Por favor verifique se seus dados foram cadastrados corretamente...");
             System.out.println("Nome: "+novoCliente.getNomeCliente()+"\r\n"+ "E-mail: "+novoCliente.getEmail()+"\r\n"+ "Senha: "+novoCliente.getSenha());
             System.out.println("**************************************************************************");

             //Validação dos dados cadastrados
             System.out.println("Se os dados castrados estiverem corretos, digite - 1 \r\n Se os dados castrados estiverem incorretos, digite - 2");

             dadosCorretos = Integer.parseInt(teclado.nextLine());
        }

        System.out.println("**************************************************************************");

         //Verifica a programação escolhida
        System.out.println("O que você deseja assistir? \r\n 1 - Filmes \r\n 2 - Séries");

        Integer tipoPrograma = Integer.parseInt(teclado.nextLine());

        //add pergunta de filmes ou séries
        if (tipoPrograma == 1)
        {
            System.out.println("Os filmes disponíveis são:");

            for (int escolha = 0; escolha < filmesList.size(); escolha++) {
                Filmes filme = filmesList.get(escolha);

                System.out.println("Código do Filme: " + escolha);
                System.out.println("Titulo: " + filme.getTitulo());
                System.out.println("Gênero: " + filme.getGenero());
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println("**************************************************************************");
            }
        }else {
            System.out.println("As séries disponíveis são:");

            for (int escolha = 0; escolha < seriesList.size(); escolha++) {
                Series serie = seriesList.get(escolha);

                System.out.println("Código do Série: " + escolha);
                System.out.println("Titulo: " + serie.getTitulo());
                System.out.println("Gênero: " + serie.getGenero());
                System.out.println("Classificação: " + serie.getClassificacao());
                System.out.println("Temporadas: " + serie.getTemporadas());
                System.out.println("**************************************************************************");
            }
        }

        FlixInicio programacaoEscolhida;
        int opcao;

        do{
            if (tipoPrograma == 1)
            {
                System.out.println("Digite o Código do filme escolhido.");
            } else
            {
                System.out.println("Digite o Código do série escolhida.");
            }

            Integer codigoFilme = Integer.parseInt(teclado.nextLine());

            if (tipoPrograma == 1)
            {
                programacaoEscolhida = filmesList.get(codigoFilme);
            } else
            {
                programacaoEscolhida = seriesList.get(codigoFilme);
            }

            System.out.println("Você escolheu assistir " + programacaoEscolhida.getTitulo());

            System.out.println("------------------------------------------------------------------------");

            Scanner entrada = new Scanner(System.in);

            System.out.println("1 - Iniciar Filme");
            System.out.println("2 - Escolher outro filme");
            System.out.println("OPCAO: ");
            opcao = entrada.nextInt();

        } while (opcao == 2);

        // Caso contrário, a frase abaixo será escrita
        System.out.println("Diveirta-se assistindo " + programacaoEscolhida.getTitulo() + "!!!!");
    }
}
