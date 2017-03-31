package com.nika.salad.dao;

import com.nika.salad.salad.Salad;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;

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
            String vegName, weight;
            Vegetable vegetable;

            while (resultSet.next()) {
                vegName = resultSet.getString("name");
                weight = resultSet.getString("weight");
                vegetable = this.createVegetableByName(vegName);
                if (vegetable != null) {
                    VegetablePortion vegetablePortion = new VegetablePortion(vegetable, Double.parseDouble(weight));
                    salad.addVegetable(vegetablePortion);
                }
            }
            st.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return salad;
    }
}
