import java.util.Scanner;
public class CHANOQ{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    while(T-- >0){
      int N = scn.nextInt();
      int[] Li = new int[N];
      int[] Ri = new int[N];
      for(int i = 0;i<N;i++){
        Li[i] = scn.nextInt();
        Ri[i] = scn.nextInt();
      }
      int Q = scn.nextInt();
      for(int i = 0 ;i<Q;i++){
        int M = scn.nextInt();
        int[] res = new int[N];
        for(int j = 0;j<M;j++){
          int q = scn.nextInt();
          for(int k = 0;k<N;k++){
            if(q >=Li[k] && q<=Ri[k]){
              res[k]++;
            }
          }
        }
        int goodSeg = 0;
        for(int k = 0;k<N;k++){
          if(res[k]%2==1){
            goodSeg++;
          }
        }
        System.out.println(goodSeg);
      }
    }
  }
}
