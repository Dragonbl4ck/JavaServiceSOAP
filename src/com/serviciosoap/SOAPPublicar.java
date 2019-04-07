package com.serviciosoap;

import javax.xml.ws.Endpoint;

public class SOAPPublicar {

	public static void main(String[] args) {
		System.out.println("Publicando el servicio");
		Endpoint.publish("http://localhost:8100/SOAP", new SOAPimplementacion());
		System.out.println("Servicio publicado");
	}
}
