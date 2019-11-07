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
        String sql = "INSERT INTO cea.armario(nuArmario, idLocalizacao) VALUES(?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, objArmario.getNuArmario());
            stmt.setString(2, objArmario.getIdLocalizacao());
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
                objArmario.setNuArmario(rs.getString("nuArmario"));
                objArmario.setIdLocalizacao(rs.getString("idLocalizacao"));

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