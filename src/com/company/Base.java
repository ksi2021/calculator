package com.company;

import java.util.HashMap;

public class Base {
    String expression;
    String [] arr;
    String [] symbs = {"+","-","*","/"};
    Integer [] arab = {1,2,3,4,5,6,7,8,9,10};
    String [] rom = {"I","II" , "III","IV","VI","VII","VIII","IX","X"};
    HashMap<String, String> map  = new HashMap<String, String>();

    public boolean check_expression()
    {

        if(this.expression != "" && this.expression != null)
        {
           return true;
        }
        return false;
    }

   public Base(String expression)
   {
       map.put("I", "1");
       map.put("II", "2");
       map.put("III", "3");
       map.put("IV", "4");
       map.put("V", "5");
       map.put("VI", "6");
       map.put("VII", "7");
       map.put("VIII", "8");
       map.put("IX", "9");
       map.put("X", "10");

    this.expression = expression;
       try{
           if(this.expression == null || this.expression == "")
           {

               throw new NullPointerException("Передано пустое значение"); }
       }
       catch (NullPointerException e){
           e.printStackTrace();
           System.exit(0);
       }

       arr = this.expression.split(" ");


       if(arr.length != 3){

           try {
               throw new Exception("Передано значение некорректного формата. Корректный формат : value1_{mathematical symbol( + | - | * | / )}_value2");

           }
           catch (Exception e){
               e.printStackTrace();
               System.exit(0);
           }
       }

        try
        {
            boolean status = false;
            switch (arr[1]){
                case "+":
                    status = true;
                    break;

                case "-":
                    status = true;
                    break;

                case "*":
                    status = true;
                    break;

                case "/":
                    status = true;
                    break;

                default:
                    status = false;
                    break;

            }
            if(status == false){
                throw new Exception("Недопустимая математическая операция");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(0);
        }

   }
   public boolean Is_Arabic(){
        Boolean first = false, second = false;
        for(Integer el: arab){
            try{
                if(Integer.parseInt(arr[0],10) == el){
                    first = true;
                }
                if(Integer.parseInt(arr[2],10) == el){
                    second = true;
                }
            }
           catch (Exception e){}
//            try {
//                if((Integer.parseInt(arr[2],10) < 0 || Integer.parseInt(arr[2],10) > 10) || (Integer.parseInt(arr[0],10) < 0 || Integer.parseInt(arr[0],10) > 10)){
//                    throw new Exception("Переданое значение вне допустимого диапазона значений");
//                }
//            }
//            catch (Exception e){
//                e.printStackTrace();
//                System.exit(0);
//            }

        }
        if(first == true && second == true){return true;}
        return false;
   }

    public boolean Is_Roman(){
        boolean first = false, second = false;
        if( (map.get(arr[0]) != null) && (map.get(arr[2]) != null)) {return true;}

        return false;
    }

}
