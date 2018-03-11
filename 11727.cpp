#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  scanf("%d", &T);
  int count=1;
  while (T--) {
    int Arr[3];
    for(int i=0;i<3;i++){
      scanf("%d", &Arr[i]);
    }
    sort(Arr,Arr+3);
    printf("Case %d: %d\n", count, Arr[1]);
    count++;
  }
}
