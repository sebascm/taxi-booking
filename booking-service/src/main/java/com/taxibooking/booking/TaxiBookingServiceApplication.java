package com.taxibooking.booking;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariDataSource;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.taxibooking"})
public class TaxiBookingServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaxiBookingServiceApplication.class, args);
  }

  /*@Bean
  @ConfigurationProperties("spring.datasource")
  public HikariDataSource dataSource() {
      return (HikariDataSource) DataSourceBuilder.create()
              .type(HikariDataSource.class).build();
  }*/
}

