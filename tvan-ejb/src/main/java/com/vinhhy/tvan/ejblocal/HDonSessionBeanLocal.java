/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan.ejblocal;

import javax.ejb.Local;
import com.vinhhy.tvan.entity.HDon;
import java.util.List;
/**
 *
 * @author doanv
 */
@Local
public interface HDonSessionBeanLocal {
    public void save(HDon hDon);
    public List<HDon> findAll();
    public HDon getById(Long id);
    public void update(HDon hDon);
    public void delete(Long id);
}
