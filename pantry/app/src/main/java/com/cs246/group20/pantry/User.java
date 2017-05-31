package com.cs246.group20.pantry;

import java.util.List;

/**
 * Created by wel12 on 5/30/2017.
 */

public class User {
    private Pantry pantry;
    private List<Ingredient> groceryList;
    private RecipeBook recipeBook;

    public Pantry getPantry() {
        return pantry;
    }

    public void setPantry(Pantry pantry) {
        this.pantry = pantry;
    }

    public List<Ingredient> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(List<Ingredient> groceryList) {
        this.groceryList = groceryList;
    }

    public RecipeBook getRecipeBook() {
        return recipeBook;
    }

    public void setRecipeBook(RecipeBook recipeBook) {
        this.recipeBook = recipeBook;
    }

    public List<Recipe> getFavoriteRecipes() {
        return favoriteRecipes;
    }

    public void setFavoriteRecipes(List<Recipe> favoriteRecipes) {
        this.favoriteRecipes = favoriteRecipes;
    }

    private List<Recipe> favoriteRecipes;
    // meal planer?

}
