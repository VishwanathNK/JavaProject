package Inheritanceclass;

public class OverloadFuncation {


    public static int minFunction(int n1, int n2)
    {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }

    public static double minFunction(double n1, double n2)
    {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
}
