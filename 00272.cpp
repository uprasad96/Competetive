# include <cstdio>
int main() {
  char ch = getchar();
  bool start = true;
  while(ch!=EOF){
    if(ch == '"'){
      if(start){
        printf("``");
        start = !start;
      }
      else if(!start){
        printf("''");
        start = !start;
      }
    }
    else{
      printf("%c",ch);
    }
    ch = getchar();
  }
  return 0;
}
