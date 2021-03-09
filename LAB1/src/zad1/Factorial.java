package zad1;

import java.util.ArrayList;

public class Factorial {
    public int sum=1;
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int factorialMethod(int n){
        if(n<0){
            return 0;
        }
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }

    public boolean evenNumber(int n){
       if(n%2==0){
           return true;
       }else
           return false;

    }
    public ArrayList<Integer> factorialMethodInArray(int n){
        for(int i=1;i<=n;i++){
            sum=sum*i;
            list.add(sum);
        }
        return list;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialMethod(-4));
        System.out.println(factorial.factorialMethod(2));
        System.out.println(factorial.evenNumber(20));


    }



}
