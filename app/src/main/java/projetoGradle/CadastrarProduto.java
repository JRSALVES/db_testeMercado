package projetoGradle;

import bancolib.SqlUtil;
import java.sql.SQLException;
import java.sql.Statement;

public class CadastrarProduto {

    public void cadastrarProduto(Produto prod) {
        // Cria uma instância de SqlUtil para se conectar ao banco de dados
        SqlUtil sqlUtil = new SqlUtil("127.0.0.1", "5432", "db_lista2", "postgres", "postgres");
        
        
       

        try {
            // Cria um Statement para executar consultas SQL
            Statement statement = sqlUtil.getConn().createStatement();

            // Monta a consulta SQL para inserir o produto no banco de dados
            String comandoInsert = "INSERT INTO produtos(cod_prod, nome_produto, descricao, valor_unitario, qtde_estoque) " +
                                   "VALUES (" + prod.getCod_produto() + ", '" + prod.getNome_produto() + "', '" +
                                   prod.getDescricao() + "', " + prod.getValor_unitario() + ", " +
                                   prod.getQtde_estoque() + ")";

            // Executa a consulta SQL para inserir o produto no banco de dados
            statement.execute(comandoInsert);

            // Fecha o Statement e a conexão com o banco de dados
            statement.close();
            sqlUtil.getConn().close();

            System.out.println("Produto cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }
}

