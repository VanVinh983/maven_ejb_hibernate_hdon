/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan.ejblocal;

import javax.ejb.Local;
import com.vinhhy.tvan.entity.CTHDon;
import java.util.List;

/**
 *
 * @author doanv
 */
@Local
public interface CTHDonSessionBeanLocal {
    public void save(CTHDon cTHDon);
    public List<CTHDon> findAll();
    public CTHDon getById(Long id);
    public void update(CTHDon cTHDon);
    public void delete(Long id);
}
