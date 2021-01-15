package com.ggx;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Ggx {

    private String name ;

    private Integer age ;

    private String test ;

    private Car car ;

    private List<Car> cars ;

    private Map<String,Car> carMap;

    private Properties conf ;
//
//    public Ggx() {
//    }


    public Ggx(String name, Integer age, String test, Car car, List<Car> cars, Map<String, Car> carMap, Properties conf) {
        this.name = name;
        this.age = age;
        this.test = test;
        this.car = car;
        this.cars = cars;
        this.carMap = carMap;
        this.conf = conf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Map<String, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    public Properties getConf() {
        return conf;
    }

    public void setConf(Properties conf) {
        this.conf = conf;
    }

    @Override
    public String toString() {
        return "Ggx{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", test='" + test + '\'' +
                ", car=" + car +
                ", cars=" + cars +
                ", carMap=" + carMap +
                ", conf=" + conf +
                '}';
    }
}
