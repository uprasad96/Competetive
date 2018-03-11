import java.util.*;
public class 414{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    while (true){
      int N = scn.nextInt();
      if(N==0){
        break;
      }
      String[] st = new String[N];
      for(int i=0;i<N;i++){
        st[i] = scn.nextLine();
      }
      int minI = -1;
      int minB = 26;
      for(int i=0;i<N;i++){
        String temp = st[i];
        int countB =0;
        for(int j = 0;j<25;j++){
          if(temp.charAt(j).equals(' ')){
            countB++;
          }
        }
        if(countB<minB){
          minB = countB;
          minI = i;
        }
      }
      int l, r;
      String temp = st[minI];
      for(int i=0;i<25;i++){
        if(temp.charAt(i).equals(' ')){
          l = i;
          break;
        }
      }{
        for(int i=24;i>=0;i--){
          if(temp.charAt(i).equals(' ')){
            r = i;
            break;
          }
        }
        int totVoid = 0;
        for(int i=0;i<N;i++){
          String temp = st[i];
          for(int j=0;j<25;j++){
            if(temp.charAt(j).equals(' ')){
              totVoid+=(l-j);
              break;
            }
          }
          for(int j=24;j>=0;j--){
            if(temp.charAt(j).equals(' ')){
              totVoid+=(j-r);
              break;
            }
          }
        }
        System.out.println(totVoid);
      }
    }
  }
}
