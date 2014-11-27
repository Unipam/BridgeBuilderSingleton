package com.br.kaoi.bridgebuilderproxy;

public class PizzaQueijoBuilder {
 
    public Pizza assarPizzaQueijo(){
        Pizza p = Queijo.getQueijo();
        p.setModo(new FornoRapido());
        return p;
    }
}