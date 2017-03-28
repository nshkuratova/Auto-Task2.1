package com.nika.salad.salad.dao;

import com.nika.salad.salad.Salad;

/**
 * Created by nika.shkuratova on 28.03.2017.
 */
public interface SaladDAO {

    public void saveSalad(Salad salad);

    public Salad readSalad();
}
