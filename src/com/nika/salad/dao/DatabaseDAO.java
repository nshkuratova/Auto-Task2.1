package com.nika.salad.dao;

import com.nika.salad.salad.Salad;

import java.sql.*;

/**
 * Created by nika.shkuratova on 28.03.2017.
 */
public class DatabaseDAO extends BaseDAO {
    public void saveSalad(Salad salad) {
    }

    public Salad readSalad() {
        Salad salad = new Salad();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/salad?autoReconnect=true&useSSL=false", "root", "root");
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT vegetables.name, weight from vegetable_portions join vegetables on vegetables.id_veg = vegetable_portions.id_veg;");
            String veg;

            while (resultSet.next()) {
                veg = resultSet.getString("name");
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
