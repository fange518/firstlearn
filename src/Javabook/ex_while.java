package Javabook;

public class ex_while {
    public static void main(String[] args) {
        double sum = 0,item=1;
        int i=1,n=20;
      /*  while (i<=n){
            sum=sum+item;
            i=i+1;
            item=item*(1.0/i);
        }*/
      do {
          sum=sum+item;
          i=i+1;
          item=item*(1.0/i);
      }while (i<=n);
        System.out.println(sum);
    }
}
