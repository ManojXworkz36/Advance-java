package com.xworkz.january.boot;

import com.xworkz.january.entity.Festival;
import com.xworkz.january.entity.OceanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAOceanRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em =emf.createEntityManager();
        System.out.println("EM" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET" + et);

        et.begin();
        System.out.println("Et begin");
        System.out.println("Starting operation");
        OceanEntity oceanEntity= new OceanEntity(2,"Indian ocean","India","Asia",155);
        em.persist(oceanEntity);
        System.out.println("Ending operation");
        et.commit();
        System.out.println("Et commit");
        System.out.println("Closing em and emf");
        em.close();
        emf.close();
    }
}
