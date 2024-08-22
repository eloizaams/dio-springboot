package eloizaams.springboot.messages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Beans {
	
	@Bean
	@Scope("prototype") //permite a criação de vários objetos e não apenas um.
	public Remetente remetente() {
		System.out.println("*****Criando um objeto REMETENTE*****");
		Remetente remetente = new Remetente();
		remetente.setEmail("noreplay@email.com");
		remetente.setNome("Tech Elite");
		return remetente;
		
	}

}
