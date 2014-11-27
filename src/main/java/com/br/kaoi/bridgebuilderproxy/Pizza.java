package com.br.kaoi.bridgebuilderproxy;

public abstract class Pizza {   
    private ModoDeAssar modo;
    
    public void montagemPizza(){
        System.out.println(fazerMassa());
        System.out.println(colocarRecheio());
        System.out.println(assarPizza());
        System.out.println(embalarPizza());
        
    }
    public String fazerMassa(){
        return "1. Fazendo a massa";
    }    
    public abstract String colocarRecheio();
    
    public String assarPizza(){
        return modo.assar();        
    }    
    public void setModo(ModoDeAssar modo) {
        this.modo = modo;
    }

    public ModoDeAssar getModo() {
        return modo;
    }    
    public String embalarPizza(){
        return "4. Embalando para entrega";
    }
}
