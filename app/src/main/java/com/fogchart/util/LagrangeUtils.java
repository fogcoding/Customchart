package com.fogchart.util;

/**
 * Created by andrew on 2017/3/31.
 */

public class LagrangeUtils {

    public static double[] getValueByArrays(double[] xarray , double[] yarray , double[] positionarray){
        double[] res = new double[positionarray.length];
        int i = 0;
        while (i<res.length){
            int x = findThePoint(xarray, (int) positionarray[i]);
            res[i] = ValueByThreePoint(xarray[x-1], yarray[x-1], xarray[x], yarray[x], xarray[x+1], yarray[x+1], positionarray[i]);
            if (res[i] < 0){
                res[i] = 0;
            }
            i++;
        }
        return res;
    };



    private static double ValueByThreePoint(double x0 , double y0 ,double x1 , double y1 ,double x2 , double y2 ,double x){
        double l0 = (( x - x1 )*( x - x2 )) / (( x0 - x1 )*( x0 - x2 ));
        double l1 = (( x - x0 )*( x - x2 )) / (( x1 - x0 )*( x1 - x2 ));
        double l2 = (( x - x0 )*( x - x1 )) / (( x2 - x0 )*( x2 - x1 ));
        double y = l0*y0 + l1*y1 + l2*y2;
        return y;
    }

    private static int findThePoint(double[] xarray, int destnationX) {
        int i=0;
        while (true) {
            if (xarray[i] <= destnationX && xarray[i+1] >destnationX) {
                if (i==0) {
                    return i+1;
                }
                if (i==xarray.length-1) {
                    return i-1;
                }
                return i;
            }
            i++;
        }
    }

}
