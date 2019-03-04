package com.aukhatov.auth.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Optional;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(Predicates.not(PathSelectors.regex("/error")))
				.build()
				.apiInfo(metadata())
				.useDefaultResponseMessages(false)
//				.securitySchemes(Arrays.asList(new ApiKey("Bearer %token", "Authorization", "Header")))
				.tags(new Tag("auth", "Operations about auth"))
				.tags(new Tag("ping", "Just a ping"))
				.genericModelSubstitutes(Optional.class);

	}

	private ApiInfo metadata() {
		return new ApiInfoBuilder()
				.title("BELKA Web Service API")
				.description("This is a sample Spring Boot application")
				.version("1.0.0")
				.contact(new Contact(null, null, "aaukhatov@gmail.com"))
				.build();
	}
}
