package br.com.estoque.model.bean;

public class Fornecedor {
    private int idFornecedor;
    private String RazaoSocial;
    private String CNPJ;
    private String IE;
    private String End;
    private String Bairro;
    private String Cidade;
    private String UF;
    private String FoneFixo;
    private String FoneCelular;
    private String Email;
    private String resp;

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String End) {
        this.End = End;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getFoneFixo() {
        return FoneFixo;
    }

    public void setFoneFixo(String FoneFixo) {
        this.FoneFixo = FoneFixo;
    }

    public String getFoneCelular() {
        return FoneCelular;
    }

    public void setFoneCelular(String FoneCelular) {
        this.FoneCelular = FoneCelular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }
}