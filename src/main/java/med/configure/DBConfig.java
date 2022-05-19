package med.configure;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@ComponentScan("med")
public class DBConfig {

    @Bean
    public DataSource dataSource(){

        PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
        pgDataSource.setURL("jdbc:postgresql://localhost:5432/MED");
        pgDataSource.setUser("user");
        pgDataSource.setPassword("user");
        return pgDataSource;
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        HashMap<String, String > hibernatePropertys = new HashMap<>();
        hibernatePropertys.put("hibernate.hbm2ddl.auto","update");
        hibernatePropertys.put("hibernate.connection.driver_class","org.postgresql.Driver");
        hibernatePropertys.put("hibernate.dialect","org.hibernate.dialect.PostgreSQL10Dialect");
        hibernatePropertys.put("hibernate.show_sql","true");
        hibernatePropertys.put("hibernate.generate_statistics","true");
        hibernatePropertys.put("hibernate.connection.charSet","UTF-8");
        hibernatePropertys.put("hibernate.format_sql","true");
        hibernatePropertys.put("hibernate.use_sql_comments","true");
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setGenerateDdl(true);
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(adapter);
        factory.setPackagesToScan("med");
        factory.setDataSource(dataSource());
        factory.setJpaPropertyMap(hibernatePropertys);

        return factory;
    }


}
