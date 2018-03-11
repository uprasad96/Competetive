# include <cstdio>
int main(){
  int T;
  scanf("%d", &T);
  while(T--){
    int a,b;
    scanf("%d %d", &a, &b);
    if(a<b){
      printf("%c\n", '<');
    }
    else if(a>b){
      printf("%c\n", '>');
    }
    else{
      printf("%c\n",'=');
    }
  }
}
