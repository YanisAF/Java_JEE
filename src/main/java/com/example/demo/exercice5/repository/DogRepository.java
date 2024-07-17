package com.example.demo.exercice5.repository;

import com.example.demo.exercice5.model.Dog;
import com.example.demo.exercice5.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DogRepository {
    private SessionFactory sessionFactory;
    private Session session;

    public DogRepository(){
        sessionFactory = SessionFactorySingleton.getSessionFactory();
    }

        public Dog create(Dog dog){
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(dog);
            session.getTransaction().commit();
            return dog;
        } catch (Exception ex){
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }


}
