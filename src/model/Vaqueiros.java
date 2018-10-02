package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eldis
 */
public class Vaqueiros {
    
     private int id;
     private String nome, esteira, representacao, observacao, tipo;
    
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getesteira() {
        return esteira;
    }

    public void setesteira(String esteira) {
        this.esteira = esteira;
    }
    
    public String getrepresentacao() {
        return representacao;
    }

    public void setrepresentacao(String representacao) {
        this.representacao = representacao;
    }
    
    public String getObservacao() {
        return observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
