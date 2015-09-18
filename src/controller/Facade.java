/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.ProjectUser;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lukasz Krawczyk
 */
public class Facade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExamAPU");
    EntityManager em = emf.createEntityManager();

    public void CreateUser() {
        ProjectUser user = new ProjectUser();
        user.setUserName("Test user2");
        user.setEmail("hej@hej.dk");

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
}
