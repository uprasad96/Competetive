# include <cstdio>
# include <cstdlib>
int main(){
  int T;
  scanf("%d", &T);
  while(T--){
    int n;
    scanf("%d", &n);
    n *= 63;
    n += 7492;
    n *= 5;
    n -= 498;
    int res = ((n % 100) - (n % 10))/10;
    printf("%d\n",abs(res));
  }
  return 0;
}
