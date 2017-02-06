package jpa.models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import java.io.Serializable;
import jpa.models.Regions;

@Entity
@Table(name = "COUNTRIES")
public class  Countries implements Serializable{

   private static final long serialVersionUID = 1L;

   @Id
   @Column(name ="COUNTRY_ID", length = 2)
   private String countryId;

   @Column(name ="COUNTRY_NAME")
   private String countryName;

   @ManyToOne(optional=false)
   @JoinColumn(name = "REGION_ID", referencedColumnName = "REGION_ID", nullable = false)
   private Regions region;

   public Countries(){
   }

   public void setId(String id){
      this.countryId = id;
   }

   public String getId(){
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
