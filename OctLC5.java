import java.util.*;
import java.io.*;

public class OctLC5{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    for(int t=0;t<T;t++){
      int N = scn.nextInt();
      ArrayList<ArrayList<Integer>> Al = new ArrayList<>();
      for(int i=0;i<N;i++){
        int M = scn.nextInt();
        ArrayList<Integer> Arr = new ArrayList<>();
        for(int j=0;j<M;j++){
          Arr.add(scn.nextInt());
        }
        Al.add(Arr);
      }
      ArrayList<Integer> temp = Al.get(0);
      ArrayList<ArrayList<Integer>> rest = Al;
      rest.remove(0);
      int Q = 0;
      for(int i=0;i<temp.size();i++){
        int MQ = MaxQ(rest, temp.get(i), 1);
        if(MQ>Q){
          Q = MQ;
        }
      }
      System.out.println(Q);
    }
  }
  public static int MaxQ(ArrayList<ArrayList<Integer>> Al, int elem, int count){
    if(Al.size()==0){
      return 0;
    }
    ArrayList<Integer> temp = Al.get(0);
    ArrayList<ArrayList<Integer>> rest = Al;
    rest.remove(0);
    int Q = -1;
    for(int i=0;i<temp.size();i++){
      int currQ = Math.abs(temp.get(i)-elem)*count;
      int ind = (i-1)<0?(i-1 + temp.size()):(i-1)%temp.size();
      int recurrQ = MaxQ(rest, temp.get(ind), count+1);
      if(currQ + recurrQ > Q){
        Q  = currQ + recurrQ;
      }
    }
    return Q;
  }
}
