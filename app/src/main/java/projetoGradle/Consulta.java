/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoGradle;

import bancolib.SqlUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consulta {

    public static void consulta() {
        try {
            SqlUtil sqlUtil = new SqlUtil("127.0.0.1", "5432", "db_lista2", "postgres", "postgres");
            Statement statement = sqlUtil.getConn().createStatement();
            String comando = "SELECT * FROM produtos";
            ResultSet resultSet = statement.executeQuery(comando);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("cod_prod"));
                System.out.println(resultSet.getString("nome_produto"));
            }

            // Fechar recursos
            resultSet.close();
            statement.close();
            sqlUtil.getConn().close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar consulta: " + e.getMessage());
        }
    }
}

