package tacocloud.data;

import tacocloud.Taco;

public interface JdbcTacoRepoInterface {
    Taco save (Taco taco);
}
