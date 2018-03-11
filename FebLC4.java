import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class FebLC4{
  public static Scanner scn =  new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    while(T-- >0){
      String N = scn.next();
      HashMap<Character, ArrayList<Integer>> Map = new HashMap<>();
      for(int i=0;i<N.length();i++){
        char ch = N.charAt(i);
        if(!Map.containsKey(ch)){
          ArrayList<Integer> al = new ArrayList<>();
          al.add(i+1);
          Map.put(ch,al);
        }
        else{
          ArrayList<Integer> al = Map.get(ch);
          al.add(i+1);
          Map.put(ch,al);
        }
      }
      int oddCount = 0;
      boolean minus1 = false;
      for(Character ch : Map.keySet()){
        if(Map.get(ch).size()%2==1){
          oddCount++;
        }
        if(oddCount==2){
          minus1 = true;
          break;
        }
      }
      if(minus1){
        System.out.println(-1);
      }
      else{
        ArrayList<Integer> res = new ArrayList<>();
        if(oddCount==1){
          for(Character ch : Map.keySet()){
            ArrayList<Integer> al = Map.get(ch);
            if(al.size()%2==1){
              Integer mid = al.get(0);
              al.remove(0);
              res.add(mid);
            }
            Map.put(ch,al);
          }
        }
        for(Character ch : Map.keySet()){
          ArrayList<Integer> al = Map.get(ch);
          while(!al.isEmpty()){
            Integer first = al.get(0);
            Integer last = al.get(1);
            al.remove(0);
            al.remove(0);
            res.add(0,first);
            res.add(last);
          }
        }
        for(Integer i : res){
          System.out.print(i);
          System.out.print(" ");
        }
        System.out.println();
      }
    }
  }
}
