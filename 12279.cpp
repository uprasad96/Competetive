# include<bits/stdc++.h>
int main(){
  int T;
  int no=1;
  while(scanf("%d", &T), T){
    int count=0;
    while(T--){
      int num;
      scanf("%d",&num);
      if(num!=0){
        count++;
      }
      else{
        count--;
      }
    }
    printf("Case %d: %d\n", no, count);
    no++;
  }
}
