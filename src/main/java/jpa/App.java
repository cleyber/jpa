package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.models.Countries;
import jpa.models.Regions;

public class App {
    public static void main( String[] args ) {
      EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("application");
      EntityManager entityManager = emFactory.createEntityManager();
      entityManager.getTransaction().begin();

      //Create Regions entity
      Regions region = new Regions();
      region.setName("Test");
      //Store region
      entityManager.persist(region);

      //create Country1 entity
      Countries country1 = new Countries();
      country1.setId("Tu");
      country1.setName("Turquia");
      country1.setRegion(region);

      // Create country2
      Countries country2 = new Countries();
      country2.setId("IN");
      country2.setName("India");
      country2.setRegion(region);

      //Storage Countries
      entityManager.persist(country1);
      entityManager.persist(country2);

      entityManager.getTransaction().commit();
      entityManager.close();
      emFactory.close();

    }
}
