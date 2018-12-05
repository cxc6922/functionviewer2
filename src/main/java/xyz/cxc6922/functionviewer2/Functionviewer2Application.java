package xyz.cxc6922.functionviewer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        RedisAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class,
        SessionAutoConfiguration.class})
public class Functionviewer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Functionviewer2Application.class, args);
    }
}
