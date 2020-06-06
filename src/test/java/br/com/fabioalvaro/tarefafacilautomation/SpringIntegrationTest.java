package br.com.fabioalvaro.tarefafacilautomation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration
@SpringBootTest(classes = BatataApplication.class)
public class SpringIntegrationTest {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	

}
