package br.com.fabioalvaro.tarefafacilautomation;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BatataSteps extends SpringIntegrationTest{
	
	
	@Autowired
	SaborRepository repository;
	
	@When("^the client try search on database!!!$")
	public void the_client_try_search_on_database() throws Throwable {
		
		Optional<Sabor> finsaborLocalizado = repository.findById(1L);
		if (finsaborLocalizado.isPresent()) {
			log.info("Sabor do código 1: "+ finsaborLocalizado.get().getDescricao());
			
		}else {
			log.info("Nao achei o sabor no banco de dados");
		}
	    assertTrue(true);
	}

	@Then("^the client try to access some web page$")
	public void the_client_try_to_access_some_web_page() throws Throwable {
		String url= "https://www.usatoday.com";	

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + "xxxxxxxxxxxxxxx");
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		RestTemplate restTemplate= new RestTemplate();
		
		ResponseEntity<String> result = restTemplate.exchange(url+"/", HttpMethod.GET, request, String.class);
		log.info(result.getBody().toString());	
	    assertTrue(true);
	}
	
	
	
	
	
	
}
