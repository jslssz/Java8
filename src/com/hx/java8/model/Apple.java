package com.hx.java8.model;

/**
 * @author jxlgcmh
 * @date 2019-08-16 08:17
 */
public class Apple {
    private double M;
    private String color;

    public Apple() {
    }

    public double getM() {
        return M;
    }

    public void setM(double m) {
        M = m;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Apple(double m, String color) {
        M = m;
        this.color = color;
    }


}
