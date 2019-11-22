/**
 * 
 */
package com.eduardogroup.spring.boot.backend.apirest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Eduardo Valeriano S
 *
 */
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

//	@Bean
//    public Docket api() { 
//        return new Docket(DocumentationType.SWAGGER_2)
//        		.select()
//                .paths(PathSelectors.ant("/api/*"))
//                .apis(RequestHandlerSelectors.any())                                               
//                .build();
//	}
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.any())                          
	          .build();                                           
	    }
}
