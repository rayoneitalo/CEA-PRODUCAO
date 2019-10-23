package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import data.ConnectionFactory;
import model.beans.Cadeado;

/**
 * CadeadoDAO
 */
public class CadeadoDAO {
    
    private final Connection conn = ConnectionFactory.getConnection();
    public void create(Cadeado objCadeado) throws SQLException {

        String sql = "INSERT INTO cea.cadeado (coCadeado, coSenha) VALUES (?,?)";

       

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, objCadeado.getCoCadeado());
            stmt.setString(2, objCadeado.getCoSenha());
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {

            throw new RuntimeException("Erro ao cadastrar");
        }
    }

}
