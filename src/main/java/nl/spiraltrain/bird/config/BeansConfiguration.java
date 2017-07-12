package nl.spiraltrain.bird.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import nl.spiraltrain.bird.domain.Bird;

@Configuration
public class BeansConfiguration {
   
   /*
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
   */
   
   @Bean
   @Primary
   public Bird defaultBird123() {
      Bird r = new Bird();
      r.setName("Gerrit123");
      
      return r;
   }
   
   /*
   @Bean
   public Egg egg() {
      return new Egg();
   }
   */
   
   @Bean
   public Bird defaultBird1234() {
      Bird r = new Bird();
      r.setName("Piet1234");
      
      return r;
   }

}
