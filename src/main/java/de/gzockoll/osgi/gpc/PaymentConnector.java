package de.gzockoll.osgi.gpc;

public interface PaymentConnector {
	PaymentResponse reservation(PaymentRequest request);
}
