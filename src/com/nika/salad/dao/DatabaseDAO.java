package com.nika.salad.dao;

import com.nika.salad.salad.Salad;
import com.nika.salad.salad.VegetablePortion;
import com.nika.salad.vegetable.Vegetable;

import java.sql.*;

/**
 * DatabaseDAO class is used to work with databases.
 * The main purpose of the class is to read data from the database and save data in the database.
 */
public class DatabaseDAO extends BaseDAO {
    /**
     * This method is to be implemented.
     *
     * @param salad An instance of salad which will be saved in the database.
     */
    public void saveSalad(Salad salad) {
    }

    /**
     * Method is used to retrieve data from the database and to return an instance of salad.
     *
     * @return an instance of salad (a list of vegetables and their weigh which are represented as vegetable portions)
     */
    public Salad readSalad() {
        Salad salad = new Salad();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/salad?autoReconnect=true&useSSL=false", "root", "root");
             Statement st = connection.createStatement();) {
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
