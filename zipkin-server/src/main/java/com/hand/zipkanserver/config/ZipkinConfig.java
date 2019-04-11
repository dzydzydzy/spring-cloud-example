package com.hand.zipkanserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipkin.storage.mysql.MySQLStorage;

import javax.sql.DataSource;

/**
 * description
 *
 * @author zhiying.dong@hand-china.com 2019/03/30 23:52
 */
@Configuration
public class ZipkinConfig {
    @Bean
    public MySQLStorage mySQLStorage(DataSource dataSource) {
        return MySQLStorage.builder().datasource(dataSource).executor(Runnable::run).build();
    }
}
