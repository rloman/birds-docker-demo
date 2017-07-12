package nl.spiraltrain.bird.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.meanbean.test.BeanTester;



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
   
   @Test
   public void testBean() {
      new BeanTester().testBean(Bird.class);
   }
   
}
