package me.tutu.wow.editor.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Configuration
@Component
public class DynamicDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.auth")
    public DataSource authDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.characters")
    public DataSource charDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.world")
    public DataSource worldDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource authDataSource, DataSource charDataSource, DataSource worldDataSource) {
        log.info("---------------building Dynamic DS!---------------");
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("auth", authDataSource);
        targetDataSources.put("characters", charDataSource);
        targetDataSources.put("world", worldDataSource);
        return new DynamicDataSource(worldDataSource, targetDataSources);
    }
}
