package services;

import models.Aresta;
import models.Vertice;

public class ArestaService {

    public Aresta criarAresta(String arestaString) throws Exception {
        if (arestaString == null || arestaString.trim() == "") {
            throw new Exception("Formato para adicionar Aresta incorreto");
        }

        String[] aresta = arestaString.split(",");

        if (aresta == null || aresta.length < 3) {
            throw new Exception("Formato para adicionar Aresta incorreto");
        }

        validarVertice(aresta[0]);
        validarVertice(aresta[1]);

        Vertice vertice1 = new Vertice(aresta[0]);
        Vertice vertice2 = new Vertice(aresta[1]);

        return new Aresta(vertice1, vertice2, Integer.parseInt(aresta[2]));
    }

    private void validarVertice(String vertice) throws Exception {
        if (vertice == null || vertice.trim() == "") {
            throw new Exception("Vertice incorreta");
        }
    }
}
