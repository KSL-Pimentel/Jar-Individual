package Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author kayap
 */
public class UsuarioRowMapper implements RowMapper<Usuario> {
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        Usuario objetoUsuario = new Usuario();

        objetoUsuario.setId_usuario(rs.getString("id_usuario"));
        objetoUsuario.setEmail(rs.getString("email"));
        objetoUsuario.setSenha(rs.getString("senha"));
        objetoUsuario.setFk_empresa(rs.getString("fk_empresa"));

        return objetoUsuario;
    }
}
