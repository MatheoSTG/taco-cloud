package tacocloud.data;

import tacocloud.Ingredient;

public interface JdbcIngredientRepoInterface {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
