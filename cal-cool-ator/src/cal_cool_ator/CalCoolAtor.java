/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal_cool_ator;

/**
 *
 * @author Matúš Švancár
 */
public class CalCoolAtor {
    
    
    public static double add(double a, double b)
       {
              return (a+b);
       }
    public static double sub(double a, double b)
       {
              return (a-b);
       }
    public static double neg(double a)
       {
              return (a*-1);
       }
    public static double multiply(double a, double b)
       {
              return (a*b);
       }
    public static double divide(double a, double b)
       {    if(b==0) throw new IllegalArgumentException("Ajajajaja delenie nulou");
              return (a/b);
       }
    public static double power(double a, double b)
       {
              return (Math.pow(a,b));
       }
    public static double root(double a)
       { //if(a==0)return 0
            if(a<0) throw new IllegalArgumentException("Odmocnina zo zaporneho cisla");
            return (Math.sqrt(a));
       }
    public static long factorial(int a)
        {
            long vysledok;
            if(a<0) throw new IllegalArgumentException("Faktorial zo zaporneho cisla");
            if(a==0 || a==1)
            return 1;

       vysledok = factorial(a-1) * a;
       return vysledok;
       }
    public static void main(String[] args)
       {
              
    
       }
}
