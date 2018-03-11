# include <cstdio>
int main(){
  int a, b, c, d;
  int Arr[40];
  for(int i=0;i<40;i++){
    Arr[i] = i;
  }
  while(scanf("%d %d %d %d", &a, &b, &c, &d), (a||b||c||d)){
    int count = 0;
    count+=720;
    int ind = a;
    while (Arr[ind]!=b) {
      if(ind == 0){
        ind = 39;
      }
      else{
        ind--;
      }
      count += 9;
    }
    count+=360;
    while(Arr[ind]!=c){
      if(ind == 39){
        ind = 0;
      }
      else{
        ind++;
      }
      count += 9;
    }
    while (Arr[ind]!=d) {
      if(ind == 0){
        ind = 39;
      }
      else{
        ind--;
      }
      count += 9;
    }
    printf("%d\n", count);
  }
}
