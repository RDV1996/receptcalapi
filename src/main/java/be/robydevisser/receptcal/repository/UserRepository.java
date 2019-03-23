package be.robydevisser.receptcal.repository;

import be.robydevisser.receptcal.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    User findOneByEmail(String email);
}
