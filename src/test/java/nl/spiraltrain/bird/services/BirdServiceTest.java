package nl.spiraltrain.bird.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import nl.spiraltrain.bird.domain.Bird;
import nl.spiraltrain.bird.persistence.BirdRepository;

@RunWith(MockitoJUnitRunner.class)
public class BirdServiceTest {
   
   
   @InjectMocks
   private BirdService birdService;
   
   @Mock
   private BirdRepository birdRepository;
   
   @Test
   public void testFindById() {
      
      Bird mock = new Bird();
      mock.setName("Maven");
      mock.setAge((byte) 31);
      
      Mockito.when(birdRepository.findOne(3L)).thenReturn(mock);
      
      Bird b = this.birdService.findById(3);
      
      Assert.assertNotNull(b);
      Assert.assertEquals(31, b.getAge());
   }

}
