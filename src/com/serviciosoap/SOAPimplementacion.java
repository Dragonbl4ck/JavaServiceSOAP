package com.serviciosoap;

import javax.jws.WebService;

@WebService (endpointInterface = "com.serviciosoap.SOAPService")

public class SOAPimplementacion implements SOAPService {
	
	@Override
	public String HolaMundo(String nombre) {
		return "Hola mono " + nombre;
	}
	
}
