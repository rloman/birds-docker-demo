package nl.spiraltrain.bird.domain;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bird implements Serializable {

   private static final long serialVersionUID = -1538755619705383157L;
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   
   private String name;
   private byte age;
   
   public Bird() {
      this.age = Double.valueOf(Math.random()* 100).byteValue();
      
   }
   
   public Bird(String name) {
      this();
      this.name = name;
   }
   
   public Bird(String name, byte age) {
      this(name);
      this.age = age;
   }

   
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

   
   public long getId() {
      return id;
   }
   
   @PostConstruct
   public void postConstruct() {
      System.err.println("Postconstruct  is called");
   }
   
   @PreDestroy
   public void preDestroy() {
      System.err.println("PreDestroy  is called");
   }
}
