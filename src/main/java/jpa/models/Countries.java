package jps.models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity(name = "COUNTRIES")
public class  Countries{

   @Id
   @GeneratedValue
   private int id;
   private String name;

   public Countries(){
   }


}
