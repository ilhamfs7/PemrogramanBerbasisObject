// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException{
        if (n < 0) {
            throw new IllegalArgumentException("Inputan kamu salah bro, ga boleh minus");
        } else if (n > 16) {
            throw new IllegalArgumentException("Inputan kamu lebih dari 16 bro, integer ga kuat");
        }
        int fac = 1;
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}