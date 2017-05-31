package com.cs246.group20.pantry;

import java.util.List;

/**
 * Created by wel12 on 5/30/2017.
 */

public class Pantry {
    private List<Ingredient> ingredients;

    // might work better then went shopping
    public List<String> removeItems(List<String> ingredientsToRemove) {
        // could be improved
        List<String> returnValue = null;
        for (int i = 0; i < ingredientsToRemove.size(); i++) {
            for (int j = 0; j < ingredients.size(); j++) {
                if (ingredientsToRemove.get(i) == ingredients.get(j).getName()) {
                    ingredients.remove(j);
                }else if (j == ingredients.size()) {
                    returnValue.add(ingredientsToRemove.get(i));
                }
            }
        }
        // returns list of ingredients it couldn't remove;
        return returnValue;
    }

    public boolean addItem(Ingredient in) {
        // need to add a check if it already exists so to just increase quantity
        ingredients.add(in);
        return true;
    }

    public boolean addItem(String lable) {
        // need to add a check if it already exists so to just increase quantity
        Ingredient in = new Ingredient(lable);
        ingredients.add(in);
        return true;
    }
}
