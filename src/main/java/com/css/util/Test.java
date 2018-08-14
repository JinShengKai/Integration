package com.css.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class Test {
    static String url = "jdbc:mysql://localhost:3306/rcount?useUnicode=true&characterEncoding=UTF-8&useSSL=false";

    static String usr = "root";

    static String psd = "king0620";


    public static void main(String args[]) {

        Connection conn = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(url, usr, psd);

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("show databases;");

            while (rs.next()) {

                System.out.print(rs.getString(1));

                System.out.print("  ");

                //System.out.println(rs.getString(2));

            }

            rs.close();

            st.close();

            conn.close();

        } catch (Exception e) {

            e.printStackTrace();

        }


    }
}
