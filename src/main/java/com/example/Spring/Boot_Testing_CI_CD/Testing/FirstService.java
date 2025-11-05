package com.example.Spring.Boot_Testing_CI_CD.Testing;

public class FirstService {

    private FirstRepo firstRepo;

    public String placeOrder(int productID, int productQuantity) {
        String product = firstRepo.getProductByID(productID);
        return product.concat(" Order Placed and No of quantity " + productQuantity);
    }

    public boolean findUser(String userName) {
        String user = firstRepo.findUser(userName);
        if (user != null) {
            return true;
        } else {
            return false;
        }
    }

    public String throwingException(int num) {
        if (num < 0) {
            throw new RuntimeException("Exception Thrown");
        } else {
            return "Successfully Execution";
        }
    }


    public String welcomeMessage(String name) {
        return name + " Welcome";
    }
}
