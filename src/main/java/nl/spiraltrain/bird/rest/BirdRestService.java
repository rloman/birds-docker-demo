package nl.spiraltrain.bird.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.spiraltrain.bird.domain.Bird;
import nl.spiraltrain.bird.services.BirdService;

@RestController
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestMapping("/birds")
@Transactional
public class BirdRestService {
   
   @Autowired
   private BirdService birdService;
   
   @Autowired
   @Qualifier("defaultBird123")
   private Bird defaultBird;
   
   
   @RequestMapping(value="list", method=RequestMethod.GET)
   public Iterable<Bird> getBirds() {
      
      Iterable<Bird> result = this.birdService.getAllBirds();
      
      System.out.println(this.defaultBird.getName());
      
      return result;
   }
   
   @RequestMapping(value="/", method=RequestMethod.POST)
   public void insert(@RequestBody Bird bird) {
      this.birdService.save(bird);
   }
   
   @RequestMapping(value="/{id}", method=RequestMethod.GET)
   public Bird findById(@PathVariable("id") long id) {
      
      Bird result = this.birdService.findById(id);
      
      return result;
   }
}
