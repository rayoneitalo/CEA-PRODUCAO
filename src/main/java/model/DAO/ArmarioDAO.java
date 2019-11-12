package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.ConnectionFactory;
import model.beans.Armario;

/**
 * ArmarioDAO
 */
public class ArmarioDAO {
    private final Connection conn = ConnectionFactory.getConnection();

    public void insert(Armario objArmario) throws SQLException {
        String sql = "INSERT INTO cea.armario(localizacao, nuArmario) VALUES(?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, objArmario.getLocalizacao());
            stmt.setInt(2, objArmario.getIdArmario());
            stmt.executeUpdate();
            stmt.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar");
        }

    }

    public List<Armario> getLista() {

        try {
            List<Armario> lista = new ArrayList<>();

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM cea.armario");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Armario objArmario = new Armario();
                objArmario.setNuArmario(rs.getInt("nuArmario"));
                objArmario.setLocalizacao(rs.getString("localizacao"));

                lista.add(objArmario);
                
            }

            rs.close();
            stmt.close();

            return lista;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}