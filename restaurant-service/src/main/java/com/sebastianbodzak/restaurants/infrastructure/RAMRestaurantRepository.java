package com.sebastianbodzak.restaurants.infrastructure;

import com.sebastianbodzak.restaurants.domain.Entity;
import com.sebastianbodzak.restaurants.domain.Restaurant;

import java.util.Collection;
import java.util.Map;

/**
 * Created by sbod on 30.01.19.
 */
public class RAMRestaurantRepository implements RestaurantRepository<Restaurant, String> {

    private Map<String, Restaurant> entities;

    public RAMRestaurantRepository(Map<String, Restaurant> entities) {
        this.entities = entities;
    }

    @Override
    public boolean ContainsName(String name) {
        return entities.containsKey(name);
    }

    @Override
    public void add(Restaurant entity) {
        entities.put(entity.getName(), entity);
    }

    @Override
    public void remove(String id) {
        if (entities.containsKey(id))
            entities.remove(id);
    }

    @Override
    public void update(Restaurant entity) {
        if (entities.containsKey(entity.getName()))
            entities.put(entity.getName(), entity);
    }

    @Override
    public boolean contains(String id) {
        return false;
    }

    @Override
    public Entity get(String id) {
        return null;
    }

    @Override
    public Collection<Restaurant> getAll() {
        return entities.values();
    }
}
