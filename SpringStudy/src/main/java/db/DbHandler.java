package db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

public class DbHandler {

    final Logger logger = LoggerFactory.getLogger(DbHandler.class);

    @Bean(name = "DataSource")
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:" + DbConstants.DB_FILE_NAME + ".db");
        return dataSourceBuilder.build();
    }

    public void insertUserData(User user) {

    }
}
