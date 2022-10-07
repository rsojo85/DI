import java.lang.Math;
public class Math3 implements Extremos {


    @Override
    public int min(int[] a) {
        int minimo=a[0];
        for (int i=1; i< a.length; i++){
            if(a[i]<minimo){
                minimo=a[i];
            }
        }
        return minimo;
    }

    @Override
    public int max(int[] a) {
        int maximo=a[0];
        for (int i=1; i< a.length; i++){
            if(a[i]>maximo){
                maximo=a[i];
            }
        }
        return maximo;
    }

    @Override
    public double min(double[] a) {
        double minimo=a[0];
        for (int i=1; i< a.length; i++){
            if(a[i]<minimo){
                minimo=a[i];
            }
        }
        return minimo;
    }

    @Override
    public double max(double[] a) {
        double maximo=a[0];
        for (int i=1; i< a.length; i++){
            if(a[i]>maximo){
                maximo=a[i];
            }
        }
        return maximo;
    }


    
}
