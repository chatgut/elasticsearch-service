package org.k8s.searchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class SearchserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchserviceApplication.class, args);
    }

}
