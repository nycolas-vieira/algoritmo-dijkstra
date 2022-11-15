package services;

import models.Aresta;

public class ArestaService {
    
    public Aresta criarAresta(String arestaString) throws Exception{
        if (arestaString == null || arestaString.trim() == "") {
            throw new Exception("Formato para adicionar Aresta incorreto");
        }

        String[] aresta = arestaString.split(",");

        if (aresta == null || aresta.length < 3) {
            throw new Exception("Formato para adicionar Aresta incorreto");
        }

        validarVertice(aresta[0]);
        validarVertice(aresta[1]);

        return new Aresta(aresta[0], aresta[1], Integer.parseInt(aresta[2]));
    }

    private void validarVertice(String vertice) throws Exception{
        if (vertice == null || vertice.trim() == "") {
            throw new Exception("Vertice incorreta");
        }
    }
}
