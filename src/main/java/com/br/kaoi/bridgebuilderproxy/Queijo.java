package com.br.kaoi.bridgebuilderproxy;

public class Queijo extends Pizza{
    private static Queijo queijinho;
    private Queijo(){
        
    }
    public static Queijo getQueijo(){
        if(queijinho == null)
            queijinho = new Queijo();
        return queijinho;
    }
    
    
    @Override
    public String colocarRecheio() {
        return "2. Recheiando com queijo";
    }
    
}
