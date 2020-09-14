package com.mybatises.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.mybatises.demo.dao.impala", sqlSessionFactoryRef = "impalaSessionFactory")
public class ImpalaConfig {

    @Value("${spring.datasource.configLocation}")
    private String configLocation;

    @Value("${spring.datasource.impala.url}")
    private String url;

    @Value("${spring.datasource.impala.driver}")
    private String driverClass;

    @Value("${spring.datasource.impala.mapperLocations}")
    private String impalaConfig;

    @Bean(name = "impalaDataSource")
    public DataSource impalaDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        return dataSource;
    }

    @Bean(name = "impalaSessionFactory")
    public SqlSessionFactory impalaSessionFactory(@Qualifier("impalaDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean SESSIONFACTORY = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        SESSIONFACTORY.setDataSource(dataSource);
        SESSIONFACTORY.setConfigLocation(resolver.getResource(configLocation));
        SESSIONFACTORY.setMapperLocations(resolver.getResources(impalaConfig));
//        SESSIONFACTORY.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);//该配置将数据库中下划线自动转成驼峰命名的变量，并且只针对自定义的实体类生效，对map不生效的
        return SESSIONFACTORY.getObject();
    }
}
