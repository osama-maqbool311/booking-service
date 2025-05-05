package com.daas.controller;

import com.daas.dao.ShowRepository;
import com.daas.dto.request.ShowCreateRequest;
import com.daas.entity.Show;
import com.daas.service.ShowService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("shows")
public class ShowController {

    @Inject
    ShowService showService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllShows() {
        return Response.ok(showService.getAllShows()).build();  // Returns 200 OK with JSON response
    }

    @POST
    @Path("/add")
    public Response createShows(List<ShowCreateRequest> showCreateRequests) {
        List<Show> shows = showService.createShows(showCreateRequests);
        return Response.status(Response.Status.CREATED).entity(shows).build();
    }
}