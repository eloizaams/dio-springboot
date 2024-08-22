package eloiza.properties_values.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner{
	//valores declarados no arquivo application.properties
	//uma vez que "name" não for encontrado no arquivo ele coloca NoReplay no lugar
	@Value("${name:NoReplay}")
	private String nome;
	
	@Value("${email}")
	private String email;
	
	@Value("${telefones}")
	private List<Long> telefones;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + nome +"\nE-mail: " + email + 
							"\nCom telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
	}

}
