package com.example.Spring.Boot_Testing_CI_CD.Testing;

public class FirstRepo {

    public String getProductByID(int productID) {
        // Code to fetch DB, but in Unit testing we are not going to work with DB.
        return "Product";
    }

    public String findUser(String userName) {
        // Code to fetch DB, but in Unit testing we are not going to work with DB.
        return "Unknow Name";
    }
}
