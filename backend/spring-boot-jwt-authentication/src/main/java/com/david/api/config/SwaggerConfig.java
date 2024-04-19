package com.david.api.config;

import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.customizers.OperationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springcomic-public")
                .pathsToMatch("/api/**")
                .addOperationCustomizer(customizer())
                .build();
    }
    
    @Bean
    public OperationCustomizer customizer() {
        return (operation, handlerMethod) -> {
            return operation.summary(handlerMethod.getMethod().getName());
        };
    }
}
