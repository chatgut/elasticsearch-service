package org.k8s.searchservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@EnableScheduling
@ConfigurationProperties("get.users.from")
public class Properties {
    private String uri;
}

