package model.dao;

import model.Crime;

import java.util.List;

public interface CrimeDao {

    //add crime to Database
    void Add(Crime crime);
    //get all Crimes
    List<Crime> getAll();

}