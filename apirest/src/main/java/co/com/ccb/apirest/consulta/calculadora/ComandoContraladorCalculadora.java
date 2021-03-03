package co.com.ccb.apirest.consulta.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/calculadora")
@RestController
public class ComandoContraladorCalculadora {

	@GetMapping("sumar/{valor1}/{valor2}")
	public int sumar(@PathVariable("valor1") Integer valor1, @PathVariable("valor2") Integer valor2) {
		return valor1 + valor2;
	}
	
	@GetMapping("restar/{valor1}/{valor2}")
	public int restar(@PathVariable("valor1") Integer valor1, @PathVariable("valor2") Integer valor2) {
		return valor1 - valor2;
	}

}
