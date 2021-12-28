package com.torryharris.train.newtrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
@SpringBootApplication
public class NewTrainApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewTrainApplication.class, args);

//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/trainlogin", "root", "Rbkrishna!!25");
////here sonoo is database name, root is username and
//        } catch (Exception e) {
//
//        }
    }

    }

