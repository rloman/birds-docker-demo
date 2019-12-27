package nl.carpago.bird.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import nl.carpago.bird.domain.Bird;
import nl.carpago.bird.persistence.BirdRepository;

@Service
public class BirdService {

   @Autowired
   private BirdRepository birdRepository;

   public Iterable<Bird> getAllBirds() {

      Iterable<Bird> result = birdRepository.findAll();

      return result;
   }

   public Bird findById(long id) {

      Bird result = this.birdRepository.findOne(id);

      return result;

   }

   @Transactional(propagation = Propagation.REQUIRES_NEW, 
                     noRollbackFor = NullPointerException.class, 
                     rollbackFor = ClassCastException.class)
   public void save(Bird bird) {
      this.birdRepository.save(bird);
   }

   @Transactional
   public void save(String name, byte age) {
      this.save(new Bird(name, age));
   }
   
   @Transactional
   public void delete(Bird victim) {
      this.birdRepository.delete(victim);
   }
   
   @Transactional
   public void deleteById(long id) {
      this.birdRepository.delete(id);
   }

}
