package com.company;

public class Roman extends Base {
        R_val test = new R_val();
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

    public String get_rez(){
            Integer result = null;
         switch (arr[1]) {
            case "+" -> {result = Integer.parseInt(map.get(arr[0])) + Integer.parseInt(map.get(arr[2]));break;}
            case "-" -> {result = Integer.parseInt(map.get(arr[0])) - Integer.parseInt(map.get(arr[2]));break;}
             case "*" -> {result = Integer.parseInt(map.get(arr[0])) * Integer.parseInt(map.get(arr[2]));break;}
             case "/" -> {result = Integer.parseInt(map.get(arr[0])) / Integer.parseInt(map.get(arr[2]));break;}

         };
         if(result != null){
             if(result > 0)
             {
                 return test.values.get(result.toString());
             }
             else if(result < 0)
             {
                 result = result * -1;
                 return test.values.get((result).toString());
             }
             else if(result == 0) { return  "0";}

         }
        return "Ошибка вычисления";
    }
}
