/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinhhy.tvan;

import com.vinhhy.tvan.ejblocal.HDonSessionBeanLocal;
import com.vinhhy.tvan.entity.HDon;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author doanv
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    @EJB
    private HDonSessionBeanLocal hDonSession;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HDon hDon = new HDon();
        hDon.setPBan("văn");
        hDon.setTHDon("vĩnh");
        hDon.setkHMSHDon("v");
        hDon.setkHHDon("văn");
        hDon.setsHDon(new BigDecimal(10000));
        hDon.setmHso("van vinh");
        hDon.setnLap(new Date());
        hDon.sethDXKhau(new BigDecimal(1));
        hDon.sethDXKPTQuan(new BigDecimal(1));
        hDon.setsBKe("đoàn văn vĩnh");
        hDon.setnBKe(new Date());
        hDon.setdVTTe("van");
        hDon.settGia(new BigDecimal("1000.2"));
        hDon.settCHDon(new BigDecimal(1));
        hDon.setlHDCLQuan(new BigDecimal(1));
        hDon.setkHMSHDCLQuan("vanvinh");
        hDon.setkHHDCLQuan("van");
        hDon.setsHDCLQuan("van");
        hDon.setnBan_Ten("đoàn văn vĩnh");
        hDon.setnBan_MST("vanvinh");
        hDon.setnBan_DChi("công ty vinhhy");
        hDon.setnMua_Ten("Đoàn văn Vĩnh");
        hDon.setnMua_MST("van");
        hDon.setnMUa_DChi("công ty vinhhy");
        hDon.setnMua_HVTNMHang("đoàn vĩnh");
        hDon.settSuat("vanvinh");
        hDon.setThTien(new BigDecimal("1000.444"));
        hDon.settThue(new BigDecimal("100000.555"));
        hDon.setTgTCThue(new BigDecimal("10000.444"));
        hDon.setTgTThue(new BigDecimal("100000.55"));
        hDon.setTgTTTBSo(new BigDecimal("10000.555"));
        hDon.setTgTTTBChu("ba mươi triệu");
        hDon.setmCCQT("vanvinh");
        hDon.setcQuanThue_Signature("vanvinh");
        hDonSession.save(hDon);
        
        HDon hDon1 = new HDon();
        hDon1 = hDonSession.getById(hDonSession.findAll().get(0).getId());
        
        hDonSession.delete(hDon1.getId());
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + hDonSession.findAll().toString() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
