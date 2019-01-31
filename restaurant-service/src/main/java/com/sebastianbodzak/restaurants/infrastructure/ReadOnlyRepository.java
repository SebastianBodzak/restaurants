package com.sebastianbodzak.restaurants.infrastructure;

import com.sebastianbodzak.restaurants.domain.Entity;

import java.util.Collection;

/**
 * Created by sbod on 30.01.19.
 */
public interface ReadOnlyRepository<TE, T> {

    boolean contains(T id);
    Entity get(T id);
    Collection<TE> getAll();
}
