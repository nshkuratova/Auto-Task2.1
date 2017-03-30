package com.nika.salad.dao;

import com.nika.salad.salad.Salad;

import java.sql.*;

/**
 * Created by nika.shkuratova on 28.03.2017.
 */
public class DatabaseDAO {
    public void saveSalad(Salad salad) {
    }

    public Salad readSalad() {
        Salad salad = new Salad();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/salad", "root", "root");
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM vegetables;");
            String veg;

            while (resultSet.next()) {
                veg = resultSet.getString("vegetables");
                System.out.println(veg);
            }


            st.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return salad;
    }
}
