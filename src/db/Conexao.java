package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/stranger_things ", "root", "root");
            ResultSet rsPersonagem = conexao.createStatement().executeQuery("SELECT * FROM PERSONAGEM");
            while (rsPersonagem.next()) {
                System.out.println(" Nome: " + rsPersonagem.getString("nome"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco nao localizado");
        } catch (SQLException ex) {
            System.out.println("Deu erro ao acesar o banco" + ex.getMessage());
        }

        return conexao;
    }
}
