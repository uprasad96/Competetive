import java.util.*;
public class FebLC1{
  public static Scanner scn = new Scanner(System.in);
  public static void main(String[] args) {
    int T = scn.nextInt();
    while(T-->0){
      String str = "chef";
      int n = str.length();
      ArrayList<String> ret = new ArrayList<>();
      permute(str, 0, n-1, ret);
      int count = 0;
      String line = scn.next();
      for(int i = 0; i + 4 <= line.length();i++){
        String s = ""+line.charAt(i+0)+line.charAt(i+1)+line.charAt(i+2)+line.charAt(i+3);
        if(ret.contains(s)){
          count++;
        }
      }
      if(count==0){
        System.out.println("normal");
      }
      else{
        System.out.print("lovely ");
        System.out.println(count);
      }
    }

  }
  private static void permute(String str, int l, int r, ArrayList<String> ret)
  {
    if (l == r)
    ret.add(str);
    else
    {
      for (int i = l; i <= r; i++)
      {
        str = swap(str,l,i);
        permute(str, l+1, r, ret);
        str = swap(str,l,i);
      }
    }
  }
  private static String swap(String a, int i, int j)
  {
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i] ;
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }
}
