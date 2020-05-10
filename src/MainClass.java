public class MainClass {
    public double power(int a, int n){
        if (n == 0) {return 1;}
        if(n < 0){ return power(a,n+1)/a;}
        else { return power(a,n-1)*a;}
    }

    public static void main(String[] args) {
        MainClass a = new MainClass();
        System.out.println(a.power(5,10));
    }
}
