package br.com.estoque.model.bean;

import javax.swing.JTextField;

public class Categoria {
    private int idCategoria;
    private String Descricao;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    } 

}