/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author doanv
 */
@Entity
public class HDon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long id;
    
    @Size(min = 0, max = 6)
    @NotNull
    private String PBan;
    
    @Size(min = 0, max = 100)
    @NotNull
    private String THDon;

    @Size(min = 0, max = 1)
    @NotNull
    private String kHMSHDon;

    @NotNull
    @Size(min = 0, max = 6)
    private String kHHDon;
    
    @NotNull
    @Digits(integer = 8, fraction = 0)
    private BigDecimal sHDon;
    
    @NotNull
    @Size(min = 0, max = 20)
    private String mHso;
    
    @NotNull
    private Date nLap;
    
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private BigDecimal hDXKhau;
    
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private BigDecimal hDXKPTQuan;
    
    @NotNull
    @Size(min = 0, max = 50)
    private String sBKe;
    
    @NotNull
    private Date nBKe;
    
    
    @NotNull
    @Size(min = 0, max = 3)
    private String dVTTe;
    
    @NotNull
    @Digits(integer = 7, fraction = 2)
    private BigDecimal tGia;
    
    
    @Digits(integer = 1, fraction = 0)
    private BigDecimal hTTToan;
    
    @Size(min = 0, max = 50)
    private String tHTTTKhac;
    
    @Size(min = 0, max = 14)
    private String mSTDVCCHDDTu;
    
    
    @Size(min = 0, max = 14)
    private String mSTDVNUNLHDon;
    
    @Size(min = 0, max = 400)
    private String tDVNUNLHDon;
    
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private BigDecimal tCHDon;
    
    
    @NotNull
    @Digits(integer = 1, fraction = 0)
    private BigDecimal lHDCLQuan;
    
    @NotNull
    @Size(min = 0, max = 11)
    private String kHMSHDCLQuan;
    
    @NotNull
    @Size(min = 0, max = 8)
    private String kHHDCLQuan;
    
    @NotNull
    @Size(min = 0, max = 8)
    private String sHDCLQuan;
    
    @Size(min = 0, max = 255)
    private String gChu;
    
    @NotNull
    @Size(min = 0, max = 400)
    private String nBan_Ten;
    
    @NotNull
    @Size(min = 0, max = 14)
    private String nBan_MST;
    
    @NotNull
    @Size(min = 0,max = 400)
    private String nBan_DChi;
   
    @Size(min = 0, max = 20)
    private String nBan_SDToai;
    
    
    @Size(min = 0, max = 50)
    private String nBan_DCTDTu;
    
    @Size(min = 0, max = 30)
    private String nBan_STKNHang;
    
    @Size(min = 0, max = 400)
    private String nBan_TNHang;
    
    @Size(min = 0, max = 20)
    private String nBan_Fax;
    
    @Size(min = 0, max = 50)
    private String nBan_Website;
    
    @NotNull
    @Size(min = 0, max = 400)
    private String nMua_Ten;
    
    @NotNull
    @Size(min = 0, max = 14)
    private String nMua_MST;
    
    @NotNull
    @Size(min = 0, max = 400)
    private String nMUa_DChi;
    
    @Size(min = 0, max = 50)
    private String nMua_MKHang;
    
    @Size(min = 0, max = 20)
    private String nMua_SDThoai;
    
    @Size(min = 0, max = 50)
    private String nMua_DCTDTu;
    
    @NotNull
    @Size(min = 0, max = 100)
    private String nMua_HVTNMHang;
    
    @Size(min = 0, max = 30)
    private String nMua_STKNHang;
    
    @Size(min = 0, max = 400)
    private String nMua_TNHang;
    
    @NotNull
    @Size(min = 0, max = 10)
    private String tSuat;
    
    @NotNull
    @Digits(integer = 19, fraction = 4)       
    private BigDecimal thTien;
    
    @NotNull
    @Digits(integer = 19, fraction = 4)
    private BigDecimal tThue;
    
    @NotNull
    @Digits(integer = 19, fraction = 4)
    private BigDecimal tgTCThue;
    
    @NotNull
    @Digits(integer = 19, fraction = 4)
    private BigDecimal tgTThue;
    
    @Size(min = 0, max = 100)
    private String tLPhi;
    
    @Digits(integer = 19, fraction = 4)
    private BigDecimal tPhi;
    
    @Digits(integer = 19, fraction = 4)
    private BigDecimal tTCKTMai;
    
    @NotNull
    @Digits(integer = 19, fraction = 4)
    private BigDecimal tgTTTBSo;
    
    @NotNull
    @Size(min = 0, max = 255)
    private String tgTTTBChu;
    
    @Size(min = 0, max = 512)
    private String qR_Code;
    
    @NotNull
    @Size(min = 0, max = 34)
    private String mCCQT;
    
    private String nBan_Signature;
    private String nMua_Signature;
    @NotNull
    private String cQuanThue_Signature;

    public HDon() {
    }

    public HDon(String PBan, String THDon, String kHMSHDon, String kHHDon, BigDecimal sHDon, String mHso, Date nLap, BigDecimal hDXKhau, BigDecimal hDXKPTQuan, String sBKe, Date nBKe, String dVTTe, BigDecimal tGia, BigDecimal hTTToan, String tHTTTKhac, String mSTDVCCHDDTu, String mSTDVNUNLHDon, String tDVNUNLHDon, BigDecimal tCHDon, BigDecimal lHDCLQuan, String kHMSHDCLQuan, String kHHDCLQuan, String sHDCLQuan, String gChu, String nBan_Ten, String nBan_MST, String nBan_DChi, String nBan_SDToai, String nBan_DCTDTu, String nBan_STKNHang, String nBan_TNHang, String nBan_Fax, String nBan_Website, String nMua_Ten, String nMua_MST, String nMUa_DChi, String nMua_MKHang, String nMua_SDThoai, String nMua_DCTDTu, String nMua_HVTNMHang, String nMua_STKNHang, String nMua_TNHang, String tSuat, BigDecimal thTien, BigDecimal tThue, BigDecimal tgTCThue, BigDecimal tgTThue, String tLPhi, BigDecimal tPhi, BigDecimal tTCKTMai, BigDecimal tgTTTBSo, String tgTTTBChu, String qR_Code, String mCCQT, String nBan_Signature, String nMua_Signature, String cQuanThue_Signature) {
        this.PBan = PBan;
        this.THDon = THDon;
        this.kHMSHDon = kHMSHDon;
        this.kHHDon = kHHDon;
        this.sHDon = sHDon;
        this.mHso = mHso;
        this.nLap = nLap;
        this.hDXKhau = hDXKhau;
        this.hDXKPTQuan = hDXKPTQuan;
        this.sBKe = sBKe;
        this.nBKe = nBKe;
        this.dVTTe = dVTTe;
        this.tGia = tGia;
        this.hTTToan = hTTToan;
        this.tHTTTKhac = tHTTTKhac;
        this.mSTDVCCHDDTu = mSTDVCCHDDTu;
        this.mSTDVNUNLHDon = mSTDVNUNLHDon;
        this.tDVNUNLHDon = tDVNUNLHDon;
        this.tCHDon = tCHDon;
        this.lHDCLQuan = lHDCLQuan;
        this.kHMSHDCLQuan = kHMSHDCLQuan;
        this.kHHDCLQuan = kHHDCLQuan;
        this.sHDCLQuan = sHDCLQuan;
        this.gChu = gChu;
        this.nBan_Ten = nBan_Ten;
        this.nBan_MST = nBan_MST;
        this.nBan_DChi = nBan_DChi;
        this.nBan_SDToai = nBan_SDToai;
        this.nBan_DCTDTu = nBan_DCTDTu;
        this.nBan_STKNHang = nBan_STKNHang;
        this.nBan_TNHang = nBan_TNHang;
        this.nBan_Fax = nBan_Fax;
        this.nBan_Website = nBan_Website;
        this.nMua_Ten = nMua_Ten;
        this.nMua_MST = nMua_MST;
        this.nMUa_DChi = nMUa_DChi;
        this.nMua_MKHang = nMua_MKHang;
        this.nMua_SDThoai = nMua_SDThoai;
        this.nMua_DCTDTu = nMua_DCTDTu;
        this.nMua_HVTNMHang = nMua_HVTNMHang;
        this.nMua_STKNHang = nMua_STKNHang;
        this.nMua_TNHang = nMua_TNHang;
        this.tSuat = tSuat;
        this.thTien = thTien;
        this.tThue = tThue;
        this.tgTCThue = tgTCThue;
        this.tgTThue = tgTThue;
        this.tLPhi = tLPhi;
        this.tPhi = tPhi;
        this.tTCKTMai = tTCKTMai;
        this.tgTTTBSo = tgTTTBSo;
        this.tgTTTBChu = tgTTTBChu;
        this.qR_Code = qR_Code;
        this.mCCQT = mCCQT;
        this.nBan_Signature = nBan_Signature;
        this.nMua_Signature = nMua_Signature;
        this.cQuanThue_Signature = cQuanThue_Signature;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPBan() {
        return PBan;
    }

    public void setPBan(String PBan) {
        this.PBan = PBan;
    }

    public String getTHDon() {
        return THDon;
    }

    public void setTHDon(String THDon) {
        this.THDon = THDon;
    }

    public String getkHMSHDon() {
        return kHMSHDon;
    }

    public void setkHMSHDon(String kHMSHDon) {
        this.kHMSHDon = kHMSHDon;
    }

    public String getkHHDon() {
        return kHHDon;
    }

    public void setkHHDon(String kHHDon) {
        this.kHHDon = kHHDon;
    }

    public BigDecimal getsHDon() {
        return sHDon;
    }

    public void setsHDon(BigDecimal sHDon) {
        this.sHDon = sHDon;
    }

    public String getmHso() {
        return mHso;
    }

    public void setmHso(String mHso) {
        this.mHso = mHso;
    }

    public Date getnLap() {
        return nLap;
    }

    public void setnLap(Date nLap) {
        this.nLap = nLap;
    }

    public BigDecimal gethDXKhau() {
        return hDXKhau;
    }

    public void sethDXKhau(BigDecimal hDXKhau) {
        this.hDXKhau = hDXKhau;
    }

    public BigDecimal gethDXKPTQuan() {
        return hDXKPTQuan;
    }

    public void sethDXKPTQuan(BigDecimal hDXKPTQuan) {
        this.hDXKPTQuan = hDXKPTQuan;
    }

    public String getsBKe() {
        return sBKe;
    }

    public void setsBKe(String sBKe) {
        this.sBKe = sBKe;
    }

    public Date getnBKe() {
        return nBKe;
    }

    public void setnBKe(Date nBKe) {
        this.nBKe = nBKe;
    }

    public String getdVTTe() {
        return dVTTe;
    }

    public void setdVTTe(String dVTTe) {
        this.dVTTe = dVTTe;
    }

    public BigDecimal gettGia() {
        return tGia;
    }

    public void settGia(BigDecimal tGia) {
        this.tGia = tGia;
    }

    public BigDecimal gethTTToan() {
        return hTTToan;
    }

    public void sethTTToan(BigDecimal hTTToan) {
        this.hTTToan = hTTToan;
    }

    public String gettHTTTKhac() {
        return tHTTTKhac;
    }

    public void settHTTTKhac(String tHTTTKhac) {
        this.tHTTTKhac = tHTTTKhac;
    }

    public String getmSTDVCCHDDTu() {
        return mSTDVCCHDDTu;
    }

    public void setmSTDVCCHDDTu(String mSTDVCCHDDTu) {
        this.mSTDVCCHDDTu = mSTDVCCHDDTu;
    }

    public String getmSTDVNUNLHDon() {
        return mSTDVNUNLHDon;
    }

    public void setmSTDVNUNLHDon(String mSTDVNUNLHDon) {
        this.mSTDVNUNLHDon = mSTDVNUNLHDon;
    }

    public String gettDVNUNLHDon() {
        return tDVNUNLHDon;
    }

    public void settDVNUNLHDon(String tDVNUNLHDon) {
        this.tDVNUNLHDon = tDVNUNLHDon;
    }

    public BigDecimal gettCHDon() {
        return tCHDon;
    }

    public void settCHDon(BigDecimal tCHDon) {
        this.tCHDon = tCHDon;
    }

    public BigDecimal getlHDCLQuan() {
        return lHDCLQuan;
    }

    public void setlHDCLQuan(BigDecimal lHDCLQuan) {
        this.lHDCLQuan = lHDCLQuan;
    }

    public String getkHMSHDCLQuan() {
        return kHMSHDCLQuan;
    }

    public void setkHMSHDCLQuan(String kHMSHDCLQuan) {
        this.kHMSHDCLQuan = kHMSHDCLQuan;
    }

    public String getkHHDCLQuan() {
        return kHHDCLQuan;
    }

    public void setkHHDCLQuan(String kHHDCLQuan) {
        this.kHHDCLQuan = kHHDCLQuan;
    }

    public String getsHDCLQuan() {
        return sHDCLQuan;
    }

    public void setsHDCLQuan(String sHDCLQuan) {
        this.sHDCLQuan = sHDCLQuan;
    }

    public String getgChu() {
        return gChu;
    }

    public void setgChu(String gChu) {
        this.gChu = gChu;
    }

    public String getnBan_Ten() {
        return nBan_Ten;
    }

    public void setnBan_Ten(String nBan_Ten) {
        this.nBan_Ten = nBan_Ten;
    }

    public String getnBan_MST() {
        return nBan_MST;
    }

    public void setnBan_MST(String nBan_MST) {
        this.nBan_MST = nBan_MST;
    }

    public String getnBan_DChi() {
        return nBan_DChi;
    }

    public void setnBan_DChi(String nBan_DChi) {
        this.nBan_DChi = nBan_DChi;
    }

    public String getnBan_SDToai() {
        return nBan_SDToai;
    }

    public void setnBan_SDToai(String nBan_SDToai) {
        this.nBan_SDToai = nBan_SDToai;
    }

    public String getnBan_DCTDTu() {
        return nBan_DCTDTu;
    }

    public void setnBan_DCTDTu(String nBan_DCTDTu) {
        this.nBan_DCTDTu = nBan_DCTDTu;
    }

    public String getnBan_STKNHang() {
        return nBan_STKNHang;
    }

    public void setnBan_STKNHang(String nBan_STKNHang) {
        this.nBan_STKNHang = nBan_STKNHang;
    }

    public String getnBan_TNHang() {
        return nBan_TNHang;
    }

    public void setnBan_TNHang(String nBan_TNHang) {
        this.nBan_TNHang = nBan_TNHang;
    }

    public String getnBan_Fax() {
        return nBan_Fax;
    }

    public void setnBan_Fax(String nBan_Fax) {
        this.nBan_Fax = nBan_Fax;
    }

    public String getnBan_Website() {
        return nBan_Website;
    }

    public void setnBan_Website(String nBan_Website) {
        this.nBan_Website = nBan_Website;
    }

    public String getnMua_Ten() {
        return nMua_Ten;
    }

    public void setnMua_Ten(String nMua_Ten) {
        this.nMua_Ten = nMua_Ten;
    }

    public String getnMua_MST() {
        return nMua_MST;
    }

    public void setnMua_MST(String nMua_MST) {
        this.nMua_MST = nMua_MST;
    }

    public String getnMUa_DChi() {
        return nMUa_DChi;
    }

    public void setnMUa_DChi(String nMUa_DChi) {
        this.nMUa_DChi = nMUa_DChi;
    }

    public String getnMua_MKHang() {
        return nMua_MKHang;
    }

    public void setnMua_MKHang(String nMua_MKHang) {
        this.nMua_MKHang = nMua_MKHang;
    }

    public String getnMua_SDThoai() {
        return nMua_SDThoai;
    }

    public void setnMua_SDThoai(String nMua_SDThoai) {
        this.nMua_SDThoai = nMua_SDThoai;
    }

    public String getnMua_DCTDTu() {
        return nMua_DCTDTu;
    }

    public void setnMua_DCTDTu(String nMua_DCTDTu) {
        this.nMua_DCTDTu = nMua_DCTDTu;
    }

    public String getnMua_HVTNMHang() {
        return nMua_HVTNMHang;
    }

    public void setnMua_HVTNMHang(String nMua_HVTNMHang) {
        this.nMua_HVTNMHang = nMua_HVTNMHang;
    }

    public String getnMua_STKNHang() {
        return nMua_STKNHang;
    }

    public void setnMua_STKNHang(String nMua_STKNHang) {
        this.nMua_STKNHang = nMua_STKNHang;
    }

    public String getnMua_TNHang() {
        return nMua_TNHang;
    }

    public void setnMua_TNHang(String nMua_TNHang) {
        this.nMua_TNHang = nMua_TNHang;
    }

    public String gettSuat() {
        return tSuat;
    }

    public void settSuat(String tSuat) {
        this.tSuat = tSuat;
    }

    public BigDecimal getThTien() {
        return thTien;
    }

    public void setThTien(BigDecimal thTien) {
        this.thTien = thTien;
    }

    public BigDecimal gettThue() {
        return tThue;
    }

    public void settThue(BigDecimal tThue) {
        this.tThue = tThue;
    }

    public BigDecimal getTgTCThue() {
        return tgTCThue;
    }

    public void setTgTCThue(BigDecimal tgTCThue) {
        this.tgTCThue = tgTCThue;
    }

    public BigDecimal getTgTThue() {
        return tgTThue;
    }

    public void setTgTThue(BigDecimal tgTThue) {
        this.tgTThue = tgTThue;
    }

    public String gettLPhi() {
        return tLPhi;
    }

    public void settLPhi(String tLPhi) {
        this.tLPhi = tLPhi;
    }

    public BigDecimal gettPhi() {
        return tPhi;
    }

    public void settPhi(BigDecimal tPhi) {
        this.tPhi = tPhi;
    }

    public BigDecimal gettTCKTMai() {
        return tTCKTMai;
    }

    public void settTCKTMai(BigDecimal tTCKTMai) {
        this.tTCKTMai = tTCKTMai;
    }

    public BigDecimal getTgTTTBSo() {
        return tgTTTBSo;
    }

    public void setTgTTTBSo(BigDecimal tgTTTBSo) {
        this.tgTTTBSo = tgTTTBSo;
    }

    public String getTgTTTBChu() {
        return tgTTTBChu;
    }

    public void setTgTTTBChu(String tgTTTBChu) {
        this.tgTTTBChu = tgTTTBChu;
    }

    public String getqR_Code() {
        return qR_Code;
    }

    public void setqR_Code(String qR_Code) {
        this.qR_Code = qR_Code;
    }

    public String getmCCQT() {
        return mCCQT;
    }

    public void setmCCQT(String mCCQT) {
        this.mCCQT = mCCQT;
    }

    public String getnBan_Signature() {
        return nBan_Signature;
    }

    public void setnBan_Signature(String nBan_Signature) {
        this.nBan_Signature = nBan_Signature;
    }

    public String getnMua_Signature() {
        return nMua_Signature;
    }

    public void setnMua_Signature(String nMua_Signature) {
        this.nMua_Signature = nMua_Signature;
    }

    public String getcQuanThue_Signature() {
        return cQuanThue_Signature;
    }

    public void setcQuanThue_Signature(String cQuanThue_Signature) {
        this.cQuanThue_Signature = cQuanThue_Signature;
    }

    @Override
    public String toString() {
        return "HDon{" + "id=" + id + ", PBan=" + PBan + ", THDon=" + THDon + ", kHMSHDon=" + kHMSHDon + ", kHHDon=" + kHHDon + ", sHDon=" + sHDon + ", mHso=" + mHso + ", nLap=" + nLap + ", hDXKhau=" + hDXKhau + ", hDXKPTQuan=" + hDXKPTQuan + ", sBKe=" + sBKe + ", nBKe=" + nBKe + ", dVTTe=" + dVTTe + ", tGia=" + tGia + ", hTTToan=" + hTTToan + ", tHTTTKhac=" + tHTTTKhac + ", mSTDVCCHDDTu=" + mSTDVCCHDDTu + ", mSTDVNUNLHDon=" + mSTDVNUNLHDon + ", tDVNUNLHDon=" + tDVNUNLHDon + ", tCHDon=" + tCHDon + ", lHDCLQuan=" + lHDCLQuan + ", kHMSHDCLQuan=" + kHMSHDCLQuan + ", kHHDCLQuan=" + kHHDCLQuan + ", sHDCLQuan=" + sHDCLQuan + ", gChu=" + gChu + ", nBan_Ten=" + nBan_Ten + ", nBan_MST=" + nBan_MST + ", nBan_DChi=" + nBan_DChi + ", nBan_SDToai=" + nBan_SDToai + ", nBan_DCTDTu=" + nBan_DCTDTu + ", nBan_STKNHang=" + nBan_STKNHang + ", nBan_TNHang=" + nBan_TNHang + ", nBan_Fax=" + nBan_Fax + ", nBan_Website=" + nBan_Website + ", nMua_Ten=" + nMua_Ten + ", nMua_MST=" + nMua_MST + ", nMUa_DChi=" + nMUa_DChi + ", nMua_MKHang=" + nMua_MKHang + ", nMua_SDThoai=" + nMua_SDThoai + ", nMua_DCTDTu=" + nMua_DCTDTu + ", nMua_HVTNMHang=" + nMua_HVTNMHang + ", nMua_STKNHang=" + nMua_STKNHang + ", nMua_TNHang=" + nMua_TNHang + ", tSuat=" + tSuat + ", thTien=" + thTien + ", tThue=" + tThue + ", tgTCThue=" + tgTCThue + ", tgTThue=" + tgTThue + ", tLPhi=" + tLPhi + ", tPhi=" + tPhi + ", tTCKTMai=" + tTCKTMai + ", tgTTTBSo=" + tgTTTBSo + ", tgTTTBChu=" + tgTTTBChu + ", qR_Code=" + qR_Code + ", mCCQT=" + mCCQT + ", nBan_Signature=" + nBan_Signature + ", nMua_Signature=" + nMua_Signature + ", cQuanThue_Signature=" + cQuanThue_Signature + '}';
    }


    
    
   
   
    
    

    
}
