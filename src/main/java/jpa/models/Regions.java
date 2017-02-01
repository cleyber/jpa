package jpa.models;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity(name = "REGIONS")
public class Regions{

   @Id
   @GeneratedValue
   private int regionId;

   private String regionName;


   public Regions(){
   }

   public void setId(int id){
      this.regionId = id;
   }

   public int getId(){
      return regionId;
   }

   public void setName(String name){
      this.regionName = name;
   }

   public String getName(){
      return regionName;
   }
}
