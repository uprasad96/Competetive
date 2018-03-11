# include <cstdio>
int main(){
  int T;
  scanf("%d",&T);
  while (T--) {
    int row, col;
    scanf("%d %d",&row, &col);
    int sonars = (row/3) * (col/3);
    printf("%d\n", sonars);
  }
}
