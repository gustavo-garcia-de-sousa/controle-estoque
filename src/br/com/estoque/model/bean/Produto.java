package br.com.estoque.model.bean;

import java.util.Date;

public class Produto {
    
    private int IdProduto;
    private int IdUsuario;
    private int IdCategoria;
    private int IdFornecedor;
    private String Descricao;
    private int CodigoDeBarras;
    private Double ValorCusto;
    private Double ValorVenda;
    private int EstMinimo;
    private int Quantidade;
    private int UnidadeDeMedida;
    private Boolean Estado;
    private Date DataCadastro;
    private String Imagem;

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }
    
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public int getIdFornecedor() {
        return IdFornecedor;
    }

    public void setIdFornecedor(int IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getCodigoDeBarras() {
        return CodigoDeBarras;
    }

    public void setCodigoDeBarras(int CodigoDeBarras) {
        this.CodigoDeBarras = CodigoDeBarras;
    }

    public Double getValorCusto() {
        return ValorCusto;
    }

    public void setValorCusto(Double ValorCusto) {
        this.ValorCusto = ValorCusto;
    }

    public Double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(Double ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public int getEstMinimo() {
        return EstMinimo;
    }

    public void setEstMinimo(int EstMinimo) {
        this.EstMinimo = EstMinimo;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getUnidadeDeMedida() {
        return UnidadeDeMedida;
    }

    public void setUnidadeDeMedida(int UnidadeDeMedida) {
        this.UnidadeDeMedida = UnidadeDeMedida;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public String getImagem() {
        return Imagem;
    }

    public void setImagem(String Imagem) {
        this.Imagem = Imagem;
    } 
}
