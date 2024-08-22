package eloizaams.springboot.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
	
	@Autowired
	private Remetente noreplay;
	
	@Autowired
	private Remetente financeiro;
	
	public void enviarConfirmacaoCadastro() {
		System.out.println(noreplay);
		System.out.println("Seu cadastro foi aprovado");
	}
	
	public void enviarMensagemBoasVindas() {
		financeiro.setEmail("financeiro@email.com");
		System.out.println(financeiro);
		System.out.println("Bem vindo à Tech Elite");
	}

}
