package com.BikeSharing.Controller;

/**
 *
 * @author Anisa Gurabardhi
 */
public class BicycleController {
    
    private String numberPlate;
    private String location;
    private boolean status;
    private int userId;

    public BicycleController() {
    }

    
    public BicycleController(String numberPlate, String location, boolean status, int userId) {
        this.numberPlate = numberPlate;
        this.location = location;
        this.status = status;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
     
}
