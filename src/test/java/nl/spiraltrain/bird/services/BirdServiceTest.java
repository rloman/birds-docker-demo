package nl.spiraltrain.bird.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import nl.spiraltrain.bird.BirdApplication;
import nl.spiraltrain.bird.domain.Bird;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=BirdApplication.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@ActiveProfiles("unittest")
public class BirdServiceTest {
   
   
   @Autowired
   private BirdService birdService;
   
   @Test
   public void testSave() {
      
      Bird b = new Bird();
      this.birdService.save(b);
   }
   
   @Test
   public void testFindById() {
      
      Bird mock = new Bird();
      mock.setName("Maven");
      mock.setAge((byte) 31);
      
//      Mockito.when(birdRepository.findOne(Mockito.any(Egg.class))).thenReturn(mock);
//      Mockito.when(birdRepository.findOne(3L)).thenReturn(mock);
      
      Bird b = this.birdService.findById(3);
      
      Assert.assertNotNull(b);
      Assert.assertEquals(31, b.getAge());
   }

}
