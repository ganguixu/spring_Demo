package com.ggx;

public class Car {
    private String carType ;
    private Integer carAge ;

    public Car() {
    }

    public Car(String carType, Integer carAge) {
        this.carType = carType;
        this.carAge = carAge;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getCarAge() {
        return carAge;
    }

    public void setCarAge(Integer carAge) {
        this.carAge = carAge;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", carAge=" + carAge +
                '}';
    }
}
