package com.appline.jb.FinalTask2;

public class Task {
    public static void main(String[] args) {
        calc("x+5=7");
        calc("3-x=9");
        calc("3-3=x");
    }

    public static void calc(String value){

        int param1;
        int param2;
        int result;
        int x = 0;

        if (value.charAt(0)=='x'){
            param2 = Integer.parseInt(value.substring(2,3));
            result = Integer.parseInt(value.substring(4,5));
            if (value.charAt(1)=='-'){
                x = result + param2;
            }else{
                x = result - param2;
            }

        }else if(value.charAt(2)=='x'){
            param1 = Integer.parseInt(value.substring(0,1));
            result = Integer.parseInt(value.substring(4,5));
            if (value.charAt(1)=='-'){
                x = -(result - param1);
            }else{
                x = result - param1;
            }

        }else if(value.charAt(4)=='x') {
            param1 = Integer.parseInt(value.substring(0,1));
            param2 = Integer.parseInt(value.substring(2,3));
            if (value.charAt(1)=='-'){
                x = param1 - param2;
            }else{
                x = param1 + param2;
            }
        }

        System.out.println("х = " + x);
    }

}
