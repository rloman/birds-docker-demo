package nl.spiraltrain.bird.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import nl.spiraltrain.bird.rest.BirdRestService;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
   
   public JerseyConfig() {
      register(BirdRestService.class);
   }

}
