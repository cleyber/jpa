package jpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "REGIONS")
public class Regions{

   @Id
   @GeneratedValue
   @Column(name ="REGION_ID")
   private int regionId;

   @Column(name ="REGION_NAME")
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
