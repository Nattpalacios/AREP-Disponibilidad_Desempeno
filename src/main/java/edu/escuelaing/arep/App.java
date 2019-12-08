package edu.escuelaing.arep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class App {

	@Autowired
	Repositorio repositorio;
	
	@GetMapping("/{numero}")
	public ResponseEntity<?> traerFibo(@PathVarible("numero") String x) throws Exception{
	    try {
	        return new ResponseEntity<>(fibo(Integer.parseInt(x)),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Hubo un fallo",HttpStatus.NOT_FOUND);
	    }
    }
	
	private static int fibo(int x) {
		
	}
}