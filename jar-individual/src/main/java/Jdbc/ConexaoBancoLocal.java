package Jdbc;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author kayap
 */
public class ConexaoBancoLocal {
    private JdbcTemplate connection;
    
    public  ConexaoBancoLocal() {
       BasicDataSource dataSource = new BasicDataSource();

       dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       dataSource.setUrl("jdbc:mysql://localhost:3306/banco1?useSSL=false");
       dataSource.setUsername("root");
       dataSource.setPassword("urubu100");

       this.connection = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConnection() {
        return connection;

    }
}