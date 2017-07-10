package nl.spiraltrain.bird.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import nl.spiraltrain.bird.domain.Bird;

@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/birds")
public class BirdRestService {
   
   
   @GET
   @Path("list")
   public List<Bird> getBirds() {
      List<Bird> result = new ArrayList<>();
      
      Bird a = new Bird();
      a.setName("Rook");
      a.setAge((byte) 30);
      
      result.add(a);
      
      return result;
   }

}
