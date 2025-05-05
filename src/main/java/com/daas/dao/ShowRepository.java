package com.daas.dao;

import com.daas.dto.request.ShowCreateRequest;
import com.daas.entity.Show;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShowRepository implements PanacheRepository<Show> {

    public Show findByTitle(String title) {
        return find("title", title).firstResult();
    }
}
