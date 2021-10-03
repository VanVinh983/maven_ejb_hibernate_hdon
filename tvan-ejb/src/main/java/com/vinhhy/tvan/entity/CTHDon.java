/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author doanv
 */
@Entity
public class CTHDon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_CTHDon")
    @SequenceGenerator(name = "id_CTHDon", sequenceName = "ID_CTHDON")
    private Long id_CTHDon;

    @ManyToOne
    @JoinColumn(name = "ID", nullable = false)
    private HDon hDon;
    
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private BigDecimal tChat;
    
    @Digits(integer = 4, fraction = 0)
    private BigDecimal sTT;
    
    @Size(min = 0, max = 50)
    private String mHHDVu;

    @NotNull
    @Size(min = 0, max = 500)
    private String tHHDVu;
    
    @NotNull
    @Size(min = 0, max = 50)
    private String dVTinh;
    
    @NotNull
    @Digits(integer = 19, fraction = 4)
    private BigDecimal sLuong;
    
    @NotNull
    @Digits(integer = 19, fraction = 4)
    private BigDecimal dGia;
    
    @Digits(integer = 6, fraction = 4)
    private BigDecimal tLCKhau;
    
    @Digits(integer = 19, fraction = 4)
    private BigDecimal sTCKhau;
    
    @NotNull
    @Digits(integer = 19, fraction = 4)
    private BigDecimal thTien;
    
    @NotNull
    @Size(min = 0, max = 10)
    private String tSuat;

    public CTHDon(HDon hDon, BigDecimal tChat, BigDecimal sTT, String mHHDVu, String tHHDVu, String dVTinh, BigDecimal sLuong, BigDecimal dGia, BigDecimal tLCKhau, BigDecimal sTCKhau, BigDecimal thTien, String tSuat) {
        this.hDon = hDon;
        this.tChat = tChat;
        this.sTT = sTT;
        this.mHHDVu = mHHDVu;
        this.tHHDVu = tHHDVu;
        this.dVTinh = dVTinh;
        this.sLuong = sLuong;
        this.dGia = dGia;
        this.tLCKhau = tLCKhau;
        this.sTCKhau = sTCKhau;
        this.thTien = thTien;
        this.tSuat = tSuat;
    }

    public CTHDon() {
    }

    public Long getId_CTHDon() {
        return id_CTHDon;
    }

    public void setId_CTHDon(Long id_CTHDon) {
        this.id_CTHDon = id_CTHDon;
    }

    public HDon gethDon() {
        return hDon;
    }

    public void sethDon(HDon hDon) {
        this.hDon = hDon;
    }

    public BigDecimal gettChat() {
        return tChat;
    }

    public void settChat(BigDecimal tChat) {
        this.tChat = tChat;
    }

    public BigDecimal getsTT() {
        return sTT;
    }

    public void setsTT(BigDecimal sTT) {
        this.sTT = sTT;
    }

    public String getmHHDVu() {
        return mHHDVu;
    }

    public void setmHHDVu(String mHHDVu) {
        this.mHHDVu = mHHDVu;
    }

    public String gettHHDVu() {
        return tHHDVu;
    }

    public void settHHDVu(String tHHDVu) {
        this.tHHDVu = tHHDVu;
    }

    public String getdVTinh() {
        return dVTinh;
    }

    public void setdVTinh(String dVTinh) {
        this.dVTinh = dVTinh;
    }

    public BigDecimal getsLuong() {
        return sLuong;
    }

    public void setsLuong(BigDecimal sLuong) {
        this.sLuong = sLuong;
    }

    public BigDecimal getdGia() {
        return dGia;
    }

    public void setdGia(BigDecimal dGia) {
        this.dGia = dGia;
    }

    public BigDecimal gettLCKhau() {
        return tLCKhau;
    }

    public void settLCKhau(BigDecimal tLCKhau) {
        this.tLCKhau = tLCKhau;
    }

    public BigDecimal getsTCKhau() {
        return sTCKhau;
    }

    public void setsTCKhau(BigDecimal sTCKhau) {
        this.sTCKhau = sTCKhau;
    }

    public BigDecimal getThTien() {
        return thTien;
    }

    public void setThTien(BigDecimal thTien) {
        this.thTien = thTien;
    }

    public String gettSuat() {
        return tSuat;
    }

    public void settSuat(String tSuat) {
        this.tSuat = tSuat;
    }

    @Override
    public String toString() {
        return "CTHDon{" + "id_CTHDon=" + id_CTHDon + ", hDon=" + hDon + ", tChat=" + tChat + ", sTT=" + sTT + ", mHHDVu=" + mHHDVu + ", tHHDVu=" + tHHDVu + ", dVTinh=" + dVTinh + ", sLuong=" + sLuong + ", dGia=" + dGia + ", tLCKhau=" + tLCKhau + ", sTCKhau=" + sTCKhau + ", thTien=" + thTien + ", tSuat=" + tSuat + '}';
    }

   
}
