package de.gzockoll.osgi.gpc;

public class PaymentRequest {
	double betrag;
	String name;

	private PaymentRequest(double betrag, String name) {
		super();
		this.betrag = betrag;
		this.name = name;
	}
}
