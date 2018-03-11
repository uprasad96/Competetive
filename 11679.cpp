#include <bits/stdc++.h>
using namespace std;
int main(){
  int B, N;
  while(scanf("%d %d", &B, &N), (B||N)){
    int Ri[B];
    for(int i=0;i<B;i++){
      cin>>Ri[i];
    }
    int pB[N][3];
    for(int i=0;i<N;i++){
      int dbtr, crdtr, amnt;
      cin>>dbtr>>crdtr>>amnt;
      pB[i][0]=dbtr;
      pB[i][1]=crdtr;
      pB[i][2]=amnt;
    }
    for(int i=0;i<N;i++){
      Ri[pB[i][0]-1]-=pB[i][2];
      Ri[pB[i][1]-1]+=pB[i][2];
    }
    bool S=true;
    for(int i=0;i<B;i++){
      if(Ri[i]<0){
        S=false;
      }
    }
    if(S){
      cout<<"S\n";
    }
    else{
      cout<<"N\n";
    }
  }
}
