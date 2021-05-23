package tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import tacocloud.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
