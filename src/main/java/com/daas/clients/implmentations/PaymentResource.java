package com.daas.clients.implmentations;

import com.daas.clients.PaymentClient;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/call-payment")
public class PaymentResource {

    @RestClient
    PaymentClient paymentClient;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        String paymentResponse = paymentClient.callPaymentService();
        return "DAAS :: Booking Service → Payment Service Response: " + paymentResponse;
    }
}
