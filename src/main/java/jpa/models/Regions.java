package jpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import java.io.Serializable;

@Entity
@Table(name = "REGIONS")
public class Regions implements Serializable{

   private static final long serialVersionUID = 1L;

   @Id
   @SequenceGenerator( name = "RegionsSeq", sequenceName = "REGIONS_SEQ", allocationSize = 1, initialValue = 5 )
   @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "RegionsSeq" )
   @Column(name ="REGION_ID")
   private long regionId;

   @Column(name ="REGION_NAME")
   private String regionName;


   public Regions(){
   }

   public void setId(long id){
      this.regionId = id;
   }

   public long getId(){
      return regionId;
   }

   public void setName(String name){
      this.regionName = name;
   }

   public String getName(){
      return regionName;
   }
}
