package tacocloud.data;

import tacocloud.Order;

public interface JdbcOrderRepoInterface {
    Order save(Order order);
}
