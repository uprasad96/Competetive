import java.util.*;
public class segtree{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int[] input = {-1,2,4,0};
    int n = input.length;
    double val = Math.log(n)/Math.log(2);
    while(Math.floor(val)!=Math.ceil(val)){
      n++;
      val = Math.log(n)/Math.log(2);
    }
    n = 2*n - 1;
    int[] sTree = new int[n];
    int lo = 0;
    int hi = input.length - 1;
    int pos = 0;
    constructTree(input, sTree, lo, hi, pos);
    System.out.println(rangeMinQuery(sTree, 1, 2, lo, hi, pos));
    System.out.println(rangeMinQuery(sTree, 0, 2, lo, hi, pos));
    System.out.println(rangeMinQuery(sTree, 1, 3, lo, hi, pos));
    System.out.println(rangeMinQuery(sTree, 2, 2, lo, hi, pos));
    System.out.println(rangeMinQuery(sTree, 2, 3, lo, hi, pos));
  }
  public static void constructTree(int[] input, int[] sTree, int lo, int hi, int pos){
    if(lo == hi){
      sTree[pos] = input[lo];
      return;
    }
    int mid = (lo+hi)/2;
    constructTree(input, sTree, lo, mid, 2*pos+1);
    constructTree(input, sTree, mid+1, hi, 2*pos+2);
    sTree[pos] = Math.min(sTree[2*pos+1], sTree[2*pos+2]);
  }
  public static int rangeMinQuery(int[] sTree, int qlo, int qhi, int lo, int hi, int pos){
    if(qlo <= lo && qhi >= hi){
        return sTree[pos];
    }
    if(qlo > hi || qhi < lo){
      return Integer.MAX_VALUE;
    }
    int mid = (lo+hi)/2;
    return Math.min(rangeMinQuery(sTree, qlo, qhi, lo, mid, 2*pos+1),rangeMinQuery(sTree, qlo, qhi, mid+1, hi, 2*pos+2));
  }
}
