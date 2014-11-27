package com.br.kaoi.bridgebuilderproxy;

public class PizzaQueijoBuilder {
 
    public Pizza assarPizzaQueijo(){
        Pizza p = new Queijo();
        p.setModo(new FornoRapido());
        return p;
    }
}