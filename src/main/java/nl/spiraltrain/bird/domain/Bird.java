package nl.spiraltrain.bird.domain;

import java.io.Serializable;

public class Bird implements Serializable {

   private static final long serialVersionUID = -1538755619705383157L;
   
   private String name;
   private byte age;
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public byte getAge() {
      return age;
   }
   
   public void setAge(byte age) {
      this.age = age;
   }
   
   
   
   
   
   

}
