package factories;

import java.util.Scanner;

import models.Grafo;
import services.ArestaService;

public class MainFactory {
    
    private static Scanner scanner = new Scanner(System.in);
    private ArestaService arestaService = new ArestaService();

    public Grafo criaGrafo()  {
        System.out.println("O grafo sera direcionado? (S/N)");
        return new Grafo(validarResposta());
    }

    public void criarListaVertice(Grafo grafo) {        
        boolean maisVertice;
        do {
            try {
                System.out.println("Insira o nome do vertice:");
                String nomeVertice = scanner.nextLine();
                grafo.adicionarVertice(nomeVertice);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }

            System.out.println("Deseja inserir mais um vertice? (S/N)");
            maisVertice = validarResposta();
        } while (maisVertice);
    }

    public void criarListaAresta(Grafo grafo) {
        boolean maisVertice;
        do {
            try {
                System.out.println("Insira a aresta no formato \"Vertice1, Vertice2, Peso\":");
                String arestaString = scanner.nextLine();

                grafo.adicionarAresta(arestaService.criarAresta(arestaString));
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }

            System.out.println("Deseja inserir mais uma aresta? (S/N)");
            maisVertice = validarResposta();
        } while (maisVertice);
    }

    private boolean validarResposta() {
        String resposta = scanner.nextLine();
        return resposta.toUpperCase().equals("S") ? true : false;
    }
 
}
