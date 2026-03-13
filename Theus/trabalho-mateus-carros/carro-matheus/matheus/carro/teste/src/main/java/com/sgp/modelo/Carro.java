package com.sgp.modelo;

public class Gato{
     
    //caracteristica
     private String nome; //atributo privado tipo string
     private String raça; //atributo privado tipo string
     private String idade; //atributo privado tipo int

    //construtor
    public Gato(String nome, int idade, String raça){
        this.nome = nome;
        this.idade = idade;
        this.raça = raça;
    }

    //construtor padrao
    public Gato(){
        this.nome = "gato";
        this.idade = "2";
        this.raça = "siamês";
    } 
    public void emitirSom(){
        System.out.println("miau")
    }
   
    public String getNome() {
        return nome;
    }
     
    public int getIdade() {
        return idade;
    }
    
    public String getRaça() {
        return raça;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setRaça(String raça) {
        this.raça = raça;
    }
    
    @Override
    public String toString(){
        return "Gato [nome=" + nome + ", idade=" + idade +", raça=" + raça +"]";
    }

}