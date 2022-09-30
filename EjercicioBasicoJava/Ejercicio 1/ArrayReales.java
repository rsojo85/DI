import java.util.Scanner;

public class ArrayReales implements Estadisticas{
    public static double minimo(double[] num) {
        double minimo=num[0];
        for (int i=1; i< num.length; i++){
            if(num[i]<minimo){
                minimo=num[i];
            }
        }
        return minimo;
    }

    public static double maximo(double[] num) {
        double maximo=num[0];
        for (int i=1; i< num.length; i++){
            if(num[i]>maximo){
               maximo=num[i];
            }
        }
        return maximo;
    }

    public static double sumatorio(double[] num) {
        double suma=num[0];
        for(int i=1;i< num.length;i++){
            suma+=num[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño del vector:");
        int size=sc.nextInt();
        double[] nums=new double[size];
        for (int i=0; i< nums.length;i++){
            nums[i]=(Math.random()*100+1);
            nums[i]+=Math.random();
        }
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]+", ");
        }
        System.out.println("");

        System.out.println("El número máximo es: "+maximo(nums)+".");
        System.out.println("El número minimo es: "+minimo(nums)+".");
        System.out.println("La suma total del vector es: "+sumatorio(nums)+".");

    }
}
