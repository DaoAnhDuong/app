/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modify;

import Class.Monhoc;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class MonhocModify {

    public static List<Monhoc> findAll() {
        List<Monhoc> monhocList = new ArrayList<>();
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        Statement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "select * from QLmonhoc";
            statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql); //hien thi bản ghi
            while (resultSet.next()) { // next(): cho phép chuyển qua từng bản ghi tren dữ liệu đầu ra và đọc 
                Monhoc mh = new Monhoc(resultSet.getString("MaMonHoc"), resultSet.getString("TenMonHoc"), resultSet.getString("Khoa"), resultSet.getString("SoTinChi"), resultSet.getString("HocKi"), resultSet.getString("HinhThucThi"));
                monhocList.add(mh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return monhocList;
    }

    public static void insert(Monhoc mh) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        PreparedStatement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "insert into QLmonhoc(MaMonHoc,TenMonHoc,Khoa,SoTinChi,HocKi,HinhThucThi) values(?,?,?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1, mh.getMaMonHoc());
            statement.setString(2, mh.getTenMonHoc());
            statement.setString(3, mh.getKhoa());
            statement.setString(4, mh.getSoTinChi());
            statement.setString(5, mh.getHocKi());
            statement.setString(6, mh.getHinhThucThi());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    public static void update(Monhoc mh) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        PreparedStatement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "update QLmonhoc set MaMonHoc = ?, TenMonHoc=?,Khoa=?,SoTinChi=?,HocKi=?,HinhThucThi=? where MaMonHoc = ?";
            statement = con.prepareCall(sql);
            statement.setString(1, mh.getMaMonHoc());
            statement.setString(2, mh.getTenMonHoc());
            statement.setString(3, mh.getKhoa());
            statement.setString(4, mh.getSoTinChi());
            statement.setString(5, mh.getHocKi());
            statement.setString(6, mh.getHinhThucThi());
            statement.setString(7, mh.getMaMonHoc());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    public static void delete(String MaMonHoc) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        PreparedStatement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "delete from QLmonhoc where MaMonHoc = ?";
            statement = con.prepareCall(sql);
            statement.setString(1,MaMonHoc);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    public static List<Monhoc> findTenMH(String TenMonHoc) {
        //lay tat ca danh sach mon hoc
        List<Monhoc> monhocList = new ArrayList<>();
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        PreparedStatement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "select * from QLmonhoc where TenMonHoc = ?";
            statement = con.prepareCall(sql);
            statement.setString(1, TenMonHoc );
            ResultSet resultSet = statement.executeQuery(); //hien thi bản ghi
            while (resultSet.next()) { // next(): cho phép chuyển qua từng bản ghi tren dữ liệu đầu ra và đọc 
                Monhoc mh = new Monhoc(resultSet.getString("MaMonHoc"), resultSet.getString("TenMonHoc"), resultSet.getString("Khoa"), resultSet.getString("SoTinChi"), resultSet.getString("HocKi"), resultSet.getString("HinhThucThi"));
                monhocList.add(mh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MonhocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return monhocList;
    }

    
}
