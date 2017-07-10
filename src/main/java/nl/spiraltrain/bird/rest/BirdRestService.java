package nl.spiraltrain.bird.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.spiraltrain.bird.domain.Bird;

@RestController
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestMapping("/birds")
public class BirdRestService {
   
   
   @RequestMapping(value="list", method=RequestMethod.GET)
   public List<Bird> getBirds() {
      List<Bird> result = new ArrayList<>();
      
      Bird a = new Bird();
      a.setName("Rook");
      a.setAge((byte) 30);
      
      result.add(a);
      
      return result;
   }

}
