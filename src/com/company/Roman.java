package com.company;

public class Roman extends Base {
        Roman(String expression){
            super(expression);
        }
        public double get_rezult(){
            return switch (arr[1]) {
                case "+" -> Double.parseDouble(map.get(arr[0])) + Double.parseDouble(map.get(arr[2]));
                case "-" -> Double.parseDouble(map.get(arr[0])) - Double.parseDouble(map.get(arr[2]));
                case "*" -> Double.parseDouble(map.get(arr[0])) * Double.parseDouble(map.get(arr[2]));
                case "/" -> Double.parseDouble(map.get(arr[0])) / Double.parseDouble(map.get(arr[2]));
                default -> 0;
            };
        }
}
