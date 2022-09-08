package Task9;

import Task8.CustomDouble;

public class Calculator {
     public double calculate(final int x, final int y, final char sign) {
          switch (sign) {
               case ('+'): {
                    return x + y;
               }
               case ('-'): {
                    return x - y;
               }
               case ('*'):{
                    return x * y;
               }
               case ('/'): {
                    return x / (double) y;
               }
               default: {
                    throw new IllegalArgumentException("Please provide a valid sign");
               }
          }
     }

     public double calculate(CustomDouble x, CustomDouble y, char sign) {
          switch (sign) {
               case ('+'): {
                    return x.sum(y).toDouble();
               }
               case ('-'): {
                    return x.diff(y).toDouble();
               }
               case ('*'):{
                    return x.mult(y).toDouble();
               }
               case ('/'): {
                    return x.div(y).toDouble();
               }
               default: {
                    throw new IllegalArgumentException("Please provide a valid sign");
               }
          }
     }
}
