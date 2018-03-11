# include <cstdio>
int main(){
  int Q;
  while(scanf("%d", &Q),Q){
    int N,M;
    scanf("%d %d", &N, &M);
    while (Q--) {
      int X,Y;
      scanf("%d %d", &X, &Y);
      if(X>N && Y>M){
        printf("NE\n");
      }
      else if(X>N && Y<M){
        printf("SE\n");
      }
      else if(X<N && Y>M){
        printf("NO\n");
      }
      else if(X<N && Y<M){
        printf("SO\n");
      }
      else{
        printf("divisa\n");
      }
    }

  }
}
