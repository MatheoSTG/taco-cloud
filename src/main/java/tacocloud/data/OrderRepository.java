package tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import tacocloud.Order;

public interface OrderRepository
        /*extends CrudRepository<Order, Long>*/ {
    Order save(Order order);
}
