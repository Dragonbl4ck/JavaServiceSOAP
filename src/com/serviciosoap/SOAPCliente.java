package com.serviciosoap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SOAPCliente {
	
	public static void main(String[] args) {
		try {
		URL url = new URL ("http://localhost:8100/SOAP");
		QName qname = new QName("http://serviciosoap.com/", "SOAPimplementacionService");
		Service servicio = Service.create(url,qname);
		SOAPService servicioPrueba = servicio.getPort(SOAPService.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un nombre");
		String nombre = sc.nextLine();
		System.out.println(servicioPrueba.HolaMundo(nombre));
		sc.close();
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
