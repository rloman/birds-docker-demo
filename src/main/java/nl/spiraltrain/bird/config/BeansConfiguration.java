package nl.spiraltrain.bird.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nl.spiraltrain.bird.domain.Bird;
import nl.spiraltrain.bird.persistence.BirdRepository;

@Configuration
public class BeansConfiguration {
   
   @Bean
   public CommandLineRunner demo(BirdRepository repository) {
      return (arguments) -> {
         // save a couple of birds
         repository.save(new Bird("Rook"));
         repository.save(new Bird("Gerrit"));
         repository.save(new Bird("Charl"));
         repository.save(new Bird("Wodey"));
      };
   }

}
