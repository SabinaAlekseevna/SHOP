package com.example.shop;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class search_mysqlconnect {
    Connection con = null;

    public static Connection ConnectDb()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shop", "root", "sabina");
            JOptionPane.showMessageDialog(null, "ConnectionEstablished");
            return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public static ObservableList<product> getDataproduct (){

        Connection con = ConnectDb();
        ObservableList<product> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from shop_clothes");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                list.add(new product(rs.getString("name_product"), rs.getString("size_product"),Integer.parseInt(rs.getString("number_size")), Integer.parseInt(rs.getString("price_RUB")),rs.getString("colour") ,Integer.parseInt(rs.getString("quantity")), rs.getString("structure")));
            }
        } catch (Exception e){}

        return list;
    }
}
