/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan.dao;

import com.vinhhy.tvan.util.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.vinhhy.tvan.entity.CTHDon;

/**
 *
 * @author doanv
 */
public class CTHDonDao {
    private SessionFactory sessionFactory = null;
    
    public CTHDonDao(){
        sessionFactory = HibernateUtils.getSessionFactory();
    }
    
    public void save(CTHDon cTHDon) {
        Transaction transaction = null;
        Session session = sessionFactory.getCurrentSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(cTHDon);
            System.out.println("com.vinhhy.tvan.dao.CTHDonDao.save()");
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public List<CTHDon> findAll(){
        Transaction transaction = null;
         Session session = sessionFactory.getCurrentSession();
        List < CTHDon > list = null;
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            list = session.createQuery("from CTHDon").getResultList();

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
     public void update(CTHDon cTHDon) {
        Transaction transaction = null;
        Session session = sessionFactory.getCurrentSession();
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(cTHDon);
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
            CTHDon cTHDon = session.get(CTHDon.class, id);
            if (cTHDon != null) {
                session.delete(cTHDon);
                System.out.println("CTHDon is deleted");
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
     
     public CTHDon getById(Long id) {

        Transaction transaction = null;
        Session session = sessionFactory.getCurrentSession();
        CTHDon cTHDon = null;
        try  {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            cTHDon = session.get(CTHDon.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return cTHDon;
    }
}
