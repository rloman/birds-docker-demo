package nl.spiraltrain.bird.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BirdTest {
   
   private Bird bird;
   
   @Before
   public void setUp() {
      
      this.bird = new Bird();
   }
   
   @Test
   public void testSetName() {
      bird.setName("Jansen");
      
      Assert.assertEquals("Jansen", bird.getName());
   }

}
