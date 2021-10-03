/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan.dao;

import com.vinhhy.tvan.util.HibernateUtils;
import javax.transaction.Transactional;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.vinhhy.tvan.entity.HDon;
import java.util.List;

/**
 *
 * @author doanv
 */
public class HDonDao {

    private SessionFactory sessionFactory = null;

    public HDonDao() {
        sessionFactory = HibernateUtils.getSessionFactory();
    }

    public void save(HDon hDon) {
        Transaction transaction = null;
        Session session = sessionFactory.getCurrentSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(hDon);
            System.out.println("com.vinhhy.tvan.dao.HDonDao.save()");
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public List<HDon> findAll(){
        Transaction transaction = null;
         Session session = sessionFactory.getCurrentSession();
        List < HDon > list = null;
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            list = session.createQuery("from HDon").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return list;
    }
     public void update(HDon hDon) {
        Transaction transaction = null;
        Session session = sessionFactory.getCurrentSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(hDon);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
     public void delete(Long id) {

        Transaction transaction = null;
        Session session = sessionFactory.getCurrentSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            HDon hDon = session.get(HDon.class, id);
            if (hDon != null) {
                session.delete(hDon);
                System.out.println("HDon is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
     
     public HDon getById(Long id) {

        Transaction transaction = null;
        Session session = sessionFactory.getCurrentSession();
        HDon hDon = null;
        try  {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            hDon = session.get(HDon.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return hDon;
    }
     
}
