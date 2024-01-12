package com.xworkz.january.boot;

import com.xworkz.january.entity.Resume;
import com.xworkz.january.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAResumeRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET" + et);

        et.begin();
        System.out.println("Et begin");
        System.out.println("Starting operation");
        Resume resume = new Resume(2, "Sachin", "sachin@Gmail.com", "Web Design", "Football", "2001-02-14");
        em.persist(resume);
        System.out.println("Ending operation");
        et.commit();
        System.out.println("Et commit");
        System.out.println("Closing em and emf");
        em.close();
        emf.close();


    }

}

