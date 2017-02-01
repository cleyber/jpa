package jps.models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity(name = "COUNTRIES")
public class  Countries{

   @Id
   @GeneratedValue
   private int countryId;

   private String countryName;
   // private int region_id;

   public Countries(){
   }

   public void setId(int id){
      this.countryId = id;
   }

   public int getId(){
      return countryId;
   }

   public void setName(String name){
      this.countryName = name;
   }

   public String getName(){
      return countryName;
   }


}
