package nl.carpago.bird.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import nl.carpago.bird.BirdApplication;
import nl.carpago.bird.domain.Bird;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BirdApplication.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@ActiveProfiles("integrationtest")
public class BirdServiceIntegrationTest {
   
   
   private static final String BIRD_NAME = "Finch";
   
   @Autowired
   private BirdService birdService;
   
   @Test
   public void testSaveAndRetrieve() {
      
      Bird b = new Bird();
      b.setName(BIRD_NAME);
      this.birdService.save(b);
      
      long idOfSavedBird = b.getId();
      
      b = null;
      
      b=this.birdService.findById(idOfSavedBird);
      
      Assert.assertNotNull(b);
      Assert.assertEquals(idOfSavedBird,  b.getId());
      Assert.assertEquals(BIRD_NAME, b.getName());
      
   }
   
}
