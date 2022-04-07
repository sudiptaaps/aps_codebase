package com.springboot.practice.configProfile;

public class Limit {
    public Limit(int min, int max){
        minimum = min;
        maximum = max;
    }

    public int minimum;
    public int maximum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
