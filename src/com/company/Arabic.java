package com.company;

public class Arabic extends Base {


    public Arabic(String expression) {
            super(expression);
    }

    public double get_rezult(){
        return switch (arr[1]) {
            case "+" -> Double.parseDouble((arr[0])) + Double.parseDouble((arr[2]));
            case "-" -> Double.parseDouble((arr[0])) - Double.parseDouble((arr[2]));
            case "*" -> Double.parseDouble((arr[0])) * Double.parseDouble((arr[2]));
            case "/" -> Double.parseDouble((arr[0])) / Double.parseDouble((arr[2]));
            default -> 0;
        };
    }
}
