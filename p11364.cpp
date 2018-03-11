# include <cstdio>
int main(){
  int T;
  scanf("%d", &T);
  while(T--){
    int N;
    scanf("%d", &N);
    int min = 100;
    int max = -1;
    while(N--){
      int num;
      scanf("%d",&num);
      if(num<min){
        min = num;
      }
      if(num>max){
        max = num;
      }
    }
    printf("%d\n",2*(max-min));
  }
  return 0;
}
