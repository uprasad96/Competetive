import java.util.*;
public class FebLC2{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    while(T-->0){
      int N = scn.nextInt();
      int M = scn.nextInt();
      int X = scn.nextInt();
      int K = scn.nextInt();
      int Os = 0;
      int Es = 0;
      String w = scn.next();
      for(int i = 0 ;i<K ;i++){
        char ch = w.charAt(i);
        if(ch =='O'){
          Os++;
        }
        else{
          Es++;
        }
      }
      for(int i = 1; i<=M ; i++){
        if(i%2==1){
          if(Os>=X){
            Os-=X;
            N-=X;
          }
          else{
            N-=Os;
            Os=0;
          }
        }
        else{
          if(Es>=X){
            Es-=X;
            N-=X;
          }
          else{
            N-=Es;
            Es=0;
          }
        }
      }
      if(N>0){
        System.out.println("no");
      }
      else{
        System.out.println("yes");
      }
    }
  }
}
