package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import data.ConnectionFactory;
import model.beans.Armario;

/**
 * ArmarioDAO
 */
public class ArmarioDAO {
    private final Connection conn = ConnectionFactory.getConnection();

    public void insert(Armario objArmario) throws SQLException {
        String sql = "INSERT INTO cea.armario(nuArmario, idLocalizacao) VALUES(?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, objArmario.getNuArmario());
            stmt.setString(2, objArmario.getLocalizacaoIdLocalizacao());
            stmt.executeUpdate();
            stmt.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar");
        }

    }
}