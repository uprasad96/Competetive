import java.util.*;
import java.io.*;
public class OctLC6{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    for(int t=0;t<T;t++){
      int N = scn.nextInt();
      int Q = scn.nextInt();
      ArrayList<ArrayList<Integer>> Cycles = new ArrayList<>();
      for(int i=0;i<N;i++){
        int Ai = scn.nextInt();
        ArrayList<Integer> Ci = new ArrayList<>();
        for(int k=0;k<Ai;k++){
          Ci.add(scn.nextInt());
        }
        Cycles.add(Ci);
      }
      int[] CiEW = new int[N];
      int[] E = new int[N];
      int[] S = new int[N];
      for(int i=0;i<N;i++){
        E[i] = scn.nextInt()-1;
        S[i] = scn.nextInt()-1;
        CiEW[i] = scn.nextInt();
      }
      for(int i=0;i<Q;i++){
        int v1 = scn.nextInt()-1;
        int c1 = scn.nextInt()-1;
        int v2 = scn.nextInt()-1;
        int c2 = scn.nextInt()-1;
        int clock = MinWtClock(v1, c1, v2, c2, Cycles, CiEW, E, S);
        int Aclock = MinWtAClock(v1, c1, v2, c2, Cycles, CiEW, E, S);
        System.out.println(Math.min(clock, Aclock));
      }
    }
  }
  public static int short(int v1, int v2, int c1, ArrayList<ArrayList<Integer>> Cycles){
    ArrayList<Integer> wts = Cycles.get(c1);
    int clock = 0;
    int vi = v1;
    while(vi!=v2){
      clock+=wts.get(vi);
      vi = (vi+1)%wts.size();
    }
    int Aclock = 0;
    int vk = v1;
    while(vk!=v2){
      Aclock+=wts.get(vk);
      vk = (vk-1)%wts.size();
    }
    return Math.min(clock,Aclock);
  }

  public static int MinWtClock(int v1, int c1, int v2, int c2, ArrayList<ArrayList<Integer>> Cycles, int[] CiEW, int[] E, int[] S){
    if(c1==c2){
      return short(v1, v2, c1, Cycles);
    }
    nxtCi = (c1+1)%Cycles.size();
    return short(v1, E[c1], c1, Cycles) + CiEW[c1] + MinWtClock(S[nxtCi], nxtCi, v2, c2, Cycles, CiEW, E, S);
  }
  public static int MinWtAClock(int v1, int c1, int v2, int c2, ArrayList<Integer> Cycles, int[] CiEW, int[] E, int[] S){
    if(c1==c2){
      return short(v1, v2, c1, Cycles);
    }
    nxtCi = (c1-1)%Cycles.size();
    return short(v1, S[c1], c1, Cycles) + CiEW[nxtCi] + MinWtAClock(E[nxtCi], nxtCi, v2, c2, Cycles, CiEW, E, S);
  }

}
