package nl.carpago.bird.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.carpago.bird.domain.Bird;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

}
