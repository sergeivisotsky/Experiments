package app.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = "classpath:app.properties")
public class Config {
    private final Environment environment;

    @Autowired
    public Config(Environment environment) {
        this.environment = environment;
    }


    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverName"));
        dataSource.setUrl(environment.getRequiredProperty("db.pathName"));

        return dataSource;
    }
}
