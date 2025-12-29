package DAO;

import db.Conexao;
import entity.Personagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonagemDAO {
    public void inserir(Personagem p) {
        String sql = "INSERT INTO PERSONAGEM (nome, descricao, idade) VALUES (?, ?, ?)";

        try (Connection conexao = Conexao.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setInt(3, p.getIdade());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }
    public Personagem buscarPorId(long id) {
        String sql = "SELECT * FROM PERSONAGEM WHERE id = ?";

        try (Connection conexao = Conexao.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Personagem persona = new Personagem();
                persona.setId(rs.getLong("id"));
                persona.setNome(rs.getString("nome"));
                persona.setIdade(rs.getInt("idade"));
                persona.setDescricao(rs.getString("descricao"));
                return persona;
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar: " + ex.getMessage());
        }

        return null;
    }



}




