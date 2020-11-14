package Javabook;

public class ex_for {

    public static void main(String[] args) {
        int sum = 0, a=8, item = a, n = 12, i = 1;
        for (i=1;i<=n;i++){
            sum = sum + item;
            item = item+a;
        }
        System.out.println(sum);
    }
}
