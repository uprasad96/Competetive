import java.util.*;
import java.text.DecimalFormat;
public class FebLC3{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    while(T-- > 0){
      int N = scn.nextInt();
      double[] Tunn = new double[N];
      for(int i=0;i<N;i++){
        Tunn[i] = scn.nextDouble();
      }
      int C = scn.nextInt();
      double D = scn.nextDouble();
      double S = scn.nextDouble();
      double delay = Tunn[0];
      double TT = D/S;
      for(int i=1;i<N-1;i++){
        double dt = (Tunn[i]-Tunn[i-1]);
        if(dt>0){
          delay+=dt;
        }
      }
      delay*=(C-1);
      DecimalFormat dec = new DecimalFormat("#0.000000000");
      System.out.println(dec.format(delay));
    }
  }
}
