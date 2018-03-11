import java.util.Scanner;
import java.text.DecimalFormat;
public class FebLC3new{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    while(T-- > 0){
      int N = scn.nextInt();
      double MTunn = 0;
      for(int i=0;i<N;i++){
        double Tunn = scn.nextDouble();
        if(Tunn > MTunn){
          MTunn = Tunn;
        }
      }
      int C = scn.nextInt();
      double D = scn.nextDouble();
      double S = scn.nextDouble();
      double delay = MTunn*(C-1);
      System.out.println(delay);
    }
  }
}
