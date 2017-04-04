package com.nika.salad.dao;

import com.nika.salad.salad.Salad;


/**
 * DataSourceDAO is a common interface which provides methods to read data from external sources and to save data into external sources.
 */
public interface DataSourceDAO {
    /**
     * Method is used to retrieve data from the database and to return an instance of salad.
     *
     * @return an instance of salad (a list of vegetables and their weigh which are represented as vegetable portions)
     */
    public Salad readSalad();

    /**
     * This method is to be implemented later.
     *
     * @param salad An instance of salad which will be saved in the database.
     */
    public void saveSalad(Salad salad);
}
