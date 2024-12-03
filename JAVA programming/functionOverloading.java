public class functionOverloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(5,10));
        System.out.println(sum(5.4,4.6));

    }
}
