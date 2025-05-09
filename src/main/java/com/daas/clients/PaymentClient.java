package com.daas.clients;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "stork://payment-service")
public interface PaymentClient {

    @GET
    @Path("/payment")
    @Produces(MediaType.TEXT_PLAIN)
    String callPaymentService();
}
