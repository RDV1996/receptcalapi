package be.robydevisser.receptcal.repository;

import be.robydevisser.receptcal.model.UserRecepy;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import java.util.List;

public interface UserRecepyRepository extends CrudRepository<UserRecepy, String> {
    List<UserRecepy> findByUserId(String userId);
}
