package nl.spiraltrain.bird.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nl.spiraltrain.bird.domain.Bird;

@Repository
public interface BirdRepository extends CrudRepository<Bird, Long> {

}
