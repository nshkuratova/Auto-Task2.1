package com.nika.salad.dao;

import com.nika.salad.exceptions.WrongVegetableException;
import com.nika.salad.salad.Salad;

import java.io.IOException;


/**
 * DataSourceDAO is a common interface which provides methods to read data from external sources and to save data into external sources.
 */
public interface DataSourceDAO {
    /**
     * Method is used to retrieve data from the external source and to return an instance of salad.
     *
     * @return an instance of salad (a list of vegetables and their weigh which are represented as vegetable portions)
     * @throws WrongVegetableException if non-existent vegetable name was passed from the external source
     * @throws IOException             If an input or output exception occurred
     */
    public Salad readSalad() throws WrongVegetableException, IOException;

    /**
     * Method is used to save data to an external source.
     *
     * @param salad An instance of salad which will be saved to the external source
     */
    public void saveSalad(Salad salad);
}
