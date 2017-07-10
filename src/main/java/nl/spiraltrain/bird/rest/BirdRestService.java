package nl.spiraltrain.bird.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.spiraltrain.bird.domain.Bird;
import nl.spiraltrain.bird.persistence.BirdRepository;

@RestController
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestMapping("/birds")
public class BirdRestService {
   
   @Autowired
   private BirdRepository birdRepository;
   
   
   @RequestMapping(value="list", method=RequestMethod.GET)
   public Iterable<Bird> getBirds() {
      
      Iterable<Bird> result = this.birdRepository.findAll();
      
      return result;
   }
}
