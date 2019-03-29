package com.kfit.App;
import com.kfit.config.datasource.dynamic.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 *
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
@SpringBootApplication
//注册动态多数据源
@Import({DynamicDataSourceRegister.class})
@ComponentScan(basePackages = {"com.kfit"})
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }

}