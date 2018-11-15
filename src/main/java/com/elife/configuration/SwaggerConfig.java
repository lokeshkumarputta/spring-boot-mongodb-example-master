package com.elife.configuration;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@EnableWebMvc
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("SwaggerUITest API")
				.description("SwaggerUITest API reference for developers")
				.termsOfServiceUrl("http://SwaggerUITest.com")
				.contact("lokeshkumarputta@gmail.com").license("SwaggerUITest License")
				.licenseUrl("lokeshkumarputta@gmail.com").version("1.0").build();
	}
}