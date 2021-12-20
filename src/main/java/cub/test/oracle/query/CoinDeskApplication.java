package cub.test.oracle.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootApplication
public class CoinDeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinDeskApplication.class, args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	}
}
