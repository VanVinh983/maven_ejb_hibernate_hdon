/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan.ejb;

import com.vinhhy.tvan.ejblocal.CTHDonSessionBeanLocal;
import com.vinhhy.tvan.entity.CTHDon;
import java.util.List;
import javax.ejb.Stateless;
import com.vinhhy.tvan.dao.CTHDonDao;

/**
 *
 * @author doanv
 */
@Stateless
public class CTHDonSessionBean implements CTHDonSessionBeanLocal {

    @Override
    public void save(CTHDon cTHDon) {
        CTHDonDao cTHDonDao = new CTHDonDao();
        cTHDonDao.save(cTHDon);
    }

    @Override
    public List<CTHDon> findAll() {
        CTHDonDao cTHDonDao = new CTHDonDao();
        return cTHDonDao.findAll();
    }

    @Override
    public CTHDon getById(Long id) {
        CTHDonDao cTHDonDao = new CTHDonDao();
        return cTHDonDao.getById(id);
    }

    @Override
    public void update(CTHDon cTHDon) {
        CTHDonDao cTHDonDao = new CTHDonDao();
        cTHDonDao.update(cTHDon);
    }

    @Override
    public void delete(Long id) {
        CTHDonDao cTHDonDao = new CTHDonDao();
        cTHDonDao.delete(id);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
