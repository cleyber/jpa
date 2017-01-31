package jpa.models;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity(name = "REGIONS")
public class Regions{

   @Id
   @GeneratedValue
   private int country_id;

   private String country_name;
   // private int region_id;

   public Regions(){
   }
}
