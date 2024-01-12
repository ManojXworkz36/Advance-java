package com.xworkz.january.boot;

import com.xworkz.january.entity.OceanEntity;
import com.xworkz.january.entity.TrafficEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPATrafficrunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em =emf.createEntityManager();
        System.out.println("EM" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET" + et);

        et.begin();
        System.out.println("Et begin");
        System.out.println("Starting operation");
        TrafficEntity trafficEntity=new TrafficEntity(2,"JP nagar","karanataka","India");
        em.persist(trafficEntity);
        System.out.println("Ending operation");
        et.commit();
        System.out.println("Et commit");
        System.out.println("Closing em and emf");
        em.close();
        emf.close();
    }
}
