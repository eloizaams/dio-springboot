package eloizaams.springboot.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class ConversorJson {

	@Autowired
	private Gson gson;
	
	public ViaCepResponse converter(String json) {
		
		//cria o objeto do tipo ViaCepResponse a partir do json passado.
		ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
		
		return response;
	}
}
