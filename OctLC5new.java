import java.util.*;
import java.io.*;

public class Main {
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    for(int t=0;t<T;t++){
      int N = scn.nextInt();
      ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
      for(int i=0;i<N;i++){
        int M = scn.nextInt();
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        for(int j=0;j<M;j++){
          Arr.add(scn.nextInt());
        }
        al.add(Arr);
      }
      ArrayList<Integer> right = al.get(N-1);
      ArrayList<Integer> left = al.get(N-2);
      int minright = Integer.MAX_VALUE;
      int maxright = Integer.MIN_VALUE;
      for(int i=0;i<right.size();i++){
        if(right.get(i)<minright){
          minright = right.get(i);
        }
        if(right.get(i)>maxright){
          maxright = right.get(i);
        }
      }
      int minleft = Integer.MAX_VALUE;
      int maxleft = Integer.MIN_VALUE;
      int minli=0;
      int maxli=0;
      for(int i=0;i<left.size();i++){
        if(left.get(i)<minleft){
          minleft = left.get(i);
          minli=i;
        }
        if(left.get(i)>maxleft){
          maxleft = left.get(i);
          maxli=i;
        }
      }
      int lefti = maxli;
      long totQ = Math.abs(maxleft-minright)*(N-1);
      if(Math.abs(maxright-minleft)>Math.abs(maxleft-minright)){
        lefti = minli;
        totQ=Math.abs(maxright-minleft)*(N-1);
      }
      for(int i=N-3;i>=0;i--){
        int righti = (lefti+1)%left.size();
        int rightE = left.get(righti);
        left = al.get(i);
        int diff = 0;
        lefti = 0;
        for(int j=0;j<left.size();j++){
          if(Math.abs(rightE-left.get(j))>diff){
            diff=Math.abs(rightE-left.get(j));
            lefti=j;
          }
        }
        totQ+=diff*(i+1);
      }
      System.out.println(totQ);
    }
  }
}
