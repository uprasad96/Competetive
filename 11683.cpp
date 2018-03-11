#include<bits/stdc++.h>
using namespace std;

int main(){
  while(true){
    int A, C;
    cin>>A;
    if(A==0){
      break;
    }
    cin>>C;
    int H[C];
    for(int i=0;i<C;i++){
      cin>>H[i];
    }
    int total = 0;
    int currH = A;
    int minH = currH;
    for(int i=0;i<C;i++){
      if(H[i]<currH){
        total+=(currH-H[i]);
        currH = H[i];
      }
      if(H[i]>=currH){
        currH = H[i];
      }
    }
    cout<<total<<"\n";
  }
}
