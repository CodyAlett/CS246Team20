package com.cs246.group20.pantry;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by wel12 on 5/30/2017.
 */

public class RecipeBook {

    // replace map with Database
    private Map<String, Recipe> recipies;

    public Set<String> listRecipes() {
            return recipies.keySet();
    }
    public boolean add(String r) {
        if (recipies.get(r) != null) {
            recipies.put(r, null);
            return true;
        }
        return false;
    }
    public boolean remove(String r) {
        if (recipies.get(r) != null) {
            recipies.remove(r);
            return true;
        }
        return false;
    }
}
