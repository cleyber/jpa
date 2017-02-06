package jpa.models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ManyToOne;

import jpa.models.Regions;

@Entity
@Table(name = "COUNTRIES")
public class  Countries{

   @Id
   @GeneratedValue
   @Column(name ="COUNTRY_ID")
   private int countryId;

   @Column(name ="COUNTRY_NAME")
   private String countryName;

   @ManyToOne
   private Regions region;

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

   public void setRegion(Regions region){
      this.region = region;
   }

   public Regions getRegion(){
      return region;
   }


}
