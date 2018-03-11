import java.util.*;
import java.math.*;
public class FebLC5{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    while(T-- >0){
      double i = scn.nextDouble();
      double d = scn.nextDouble();
      double t = scn.nextDouble();
      double res = t*(Math.acos(d/i));
      res = res % (44/7.0);
      double temp = i*Math.cos(res);
      boolean neg = false;
      if(temp<0){
        neg = true;
        temp = -temp;
      }
      String s = String.valueOf(temp);
      int digitsDec = s.length() - 1 - s.indexOf('.');
      int denom = 1;
      for (int p = 0; p < digitsDec; p++) {
        temp *= 10;
        denom *= 10;
      }

      int num = (int) Math.round(temp);
      long g = gcdThing(num, denom);
      long p = num / g;
      long q = denom /g;

      System.out.println(p);
      System.out.println(q);

      long m = 1000000007;
      long r = modInverse(q, m);
      System.out.println(r);
      long ans = (p*r)%(1000000007);
      if(neg == true){
        ans = 1000000007-ans;
      }
      System.out.println(ans);
    }
  }
  private static long gcdThing(long a, long b) {
    BigInteger b1 = BigInteger.valueOf(a);
    BigInteger b2 = BigInteger.valueOf(b);
    BigInteger gcd = b1.gcd(b2);
    return gcd.longValue();
  }

  private static long modInverse(long a, long m)
  {
    a = a%m;
    for (long x=1; x<m; x++){
      if ((a*x) % m == 1){
        return x;
      }
    }
    return -1;
  }
}
