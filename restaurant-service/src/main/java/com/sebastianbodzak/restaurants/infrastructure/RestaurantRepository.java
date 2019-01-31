package com.sebastianbodzak.restaurants.infrastructure;

/**
 * Created by sbod on 30.01.19.
 */
public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {

    boolean ContainsName(String name);
} 
