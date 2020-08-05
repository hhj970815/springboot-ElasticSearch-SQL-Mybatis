package com.mybatises.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.elasticsearch.xpack.sql.jdbc.EsDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
@MapperScan(basePackages = {"com.mybatises.demo.dao.es"}, sqlSessionFactoryRef = "esSqlSessionFactory")
public class EsDruidDataSourceConfig {

    @Value("${spring.datasource.es.configLocation}")
    private String configLocation;

    @Value("${spring.datasource.es.mapperLocations}")
    private String bigdataMapperLocations;

    @Value("${spring.datasource.es.url}")
    private String esUrl;

    @Value("${spring.datasource.es.username}")
    private String username;

    @Value("${spring.datasource.es.password}")
    private String password;

    @Bean(name = "esDataSource")
    public DataSource esDataSource() throws SQLException {
        Properties properties = new Properties();
        properties.put("user", username);
        properties.put("password", password);
        EsDataSource esDataSource = new EsDataSource();
        esDataSource.setUrl(esUrl);
        esDataSource.setProperties(properties);

        return esDataSource;
    }

    /**
     * SqlSessionFactory配置
     *
     * @return
     * @throws Exception
     */
    @Bean(name = "esSqlSessionFactory")
    public SqlSessionFactory bigdataSqlSessionFactory(@Qualifier("esDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //配置mapper文件位置
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(bigdataMapperLocations));
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource(configLocation));
        return sqlSessionFactoryBean.getObject();
    }

}
