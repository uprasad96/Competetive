import java.util.*;
public class POINPOLY{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    while(T-- > 0){
      int N = scn.nextInt();
      int[] X = new int[N];
      int[] Y = new int[N];
      for(int i = 0;i < N;i++){
        X[i] = scn.nextInt();
        Y[i] = scn.nextInt();
      }
      ArrayList<Integer> resX = new ArrayList<>();
      ArrayList<Integer> resY = new ArrayList<>();
      int count = 0;
      int limit = (int)Math.floor(N/10);
      for(int i = 0;i < N;i++){
        if(count == limit){
          break;
        }
        for(int j = 0;j < N;j++){
          if(count == limit){
            break;
          }
          if(i==j || ((i+1)%N)==j || Math.floorMod((i-1),N)==j){
            continue;
          }
          if((X[i]+X[j])%2==0  && (Y[i]+Y[j])%2==0){
            int midX = (X[i]+X[j])/2;
            int midY = (Y[i]+Y[j])/2;
            // System.out.println(midX+ " "+ midY);
            resX.add(midX);
            resY.add(midY);
            count++;
          }
        }
      }
      if(count!=limit){
        System.out.println(-1);
      }
      else{
        for(int i = 0;i<limit;i++){
          System.out.print(resX.get(i));
          System.out.print(" ");
          System.out.println(resY.get(i));
        }
      }
    }
  }
}
