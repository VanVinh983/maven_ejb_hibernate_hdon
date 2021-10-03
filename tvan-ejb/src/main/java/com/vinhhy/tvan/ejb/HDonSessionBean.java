/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan.ejb;

import com.vinhhy.tvan.dao.HDonDao;
import com.vinhhy.tvan.ejblocal.HDonSessionBeanLocal;
import com.vinhhy.tvan.entity.HDon;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author doanv
 */
@Stateless
public class HDonSessionBean implements HDonSessionBeanLocal {
    
    @Override
    public void save(HDon hDon) {
         //To change body of generated methods, choose Tools | Templates.
         HDonDao hDonDao = new HDonDao();
         hDonDao.save(hDon);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<HDon> findAll() {
         HDonDao hDonDao = new HDonDao();
         return hDonDao.findAll();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HDon getById(Long id) {
      HDonDao hDonDao = new HDonDao();
      return hDonDao.getById(id);
    }

    @Override
    public void update(HDon hDon) {
        HDonDao hDonDao = new HDonDao();
        hDonDao.update(hDon);
    }

    @Override
    public void delete(Long id) {
        HDonDao hDonDao = new HDonDao();
        hDonDao.delete(id);
    }
}
