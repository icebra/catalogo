package com.ceg.catalogo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

//	@Autowired
//	private AuthorizationCodeResourceDetails authorizationCodeResourceDetails;
//
//	@Autowired
//	private OAuth2ClientContext oauth2Context;

	@Bean
	public RestTemplate restTemplate() {
		//return new OAuth2RestTemplate(authorizationCodeResourceDetails, oauth2Context);
		return new RestTemplate();
	}

}