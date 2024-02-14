package projetoGradle;

public class App {

    public static void main(String[] args) {
        // Criando um objeto da classe Produto e definindo seus atributos
        Produto produto = new Produto();
        System.out.println("Digite o Código do Produto");
        produto.setCod_produto(5);
        produto.setNome_produto("Musculo");
        produto.setDescricao("Descrição do Produto A");
        produto.setValor_unitario(10);
        produto.setQtde_estoque(5);
        
        // Criando um objeto da classe CadastrarProduto
        CadastrarProduto cadastrarProduto = new CadastrarProduto();
        
        // Chamando o método cadastrarProduto() passando o objeto Produto como argumento
        cadastrarProduto.cadastrarProduto(produto);
        
        // Chamando o método de consulta após cadastrar o produto
        Consulta.consulta();
    }
}
