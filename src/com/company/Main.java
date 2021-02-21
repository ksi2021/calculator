package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String num = in.nextLine();
        in.close();


        Base base = new Base(num);

       // String num1 = in.nextLine();





        if(base.check_expression()) {
            try {
                if (base.Is_Roman()) {
                    Roman r = new Roman(num);
                    System.out.println(r.get_rezult());
                } else if (base.Is_Arabic()) {
                    Arabic r = new Arabic(num);
                    System.out.println(r.get_rezult());
                } else {
                    throw new Exception("значения не являются одновременно ни арабскими числами , ни римскими или значения вне допустимого диапазона значений");
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }


        }

              //  System.out.println(Integer.parseInt("sad"));






    }



}
