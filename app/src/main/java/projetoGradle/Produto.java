package projetoGradle;

public class Produto {
    
    

    private int cod_produto = 0;
    private String nome_produto;
    private String descricao;
    private double valor_unitario = 0;
    private double qtde_estoque = 0;

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrcao) {
        this.descricao = descrcao;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public double getQtde_estoque() {
        return qtde_estoque;
    }

    public void setQtde_estoque(double qtde_estoque) {
        this.qtde_estoque = qtde_estoque;
    }
}

