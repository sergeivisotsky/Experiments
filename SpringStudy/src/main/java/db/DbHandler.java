package db;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbHandler {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    /*public DbHandler() {
        try {
            File dbFile = new File(DbConstants.DB_FILE_PATH);
            final String JDBC_DRIVER = "org.sqlite.JDBC";
            Class.forName(JDBC_DRIVER);
            final String DB_URL = "jdbc:sqlite:" +
                    dbFile.getAbsolutePath() +
                    "\\" + DbConstants.DB_FILE_NAME + ".db";
            conn = DriverManager.getConnection(DB_URL);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() +
                    ": " + e.getMessage());
            System.exit(0);
        }
    }*/

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:" + DbConstants.DB_FILE_NAME + ".db");
        return dataSourceBuilder.build();
    }

    public void insertUserData(User user) {

    }
}
