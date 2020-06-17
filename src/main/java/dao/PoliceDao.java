package dao;

import models.Police;

import java.util.List;

public interface PoliceDao {

    //add police to Database
    void add(Police police);

    //get all Police
    List<Police> getAll();

}