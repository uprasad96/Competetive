#include <bits/stdc++.h>
using namespace std;
int main(){
  int N, B, H, W;
  while(scanf("%d %d %d %d",&N, &B, &H, &W)==4){
    int minBud=INT_MAX;
    while(H--){
      int P;
      cin>>P;
      int tempW=W;
      while(tempW--){
        int beds;
        cin>>beds;
        if(beds>=N){
          if(P*N<minBud){
            minBud=P*N;
          }
        }
      }
    }
    if(minBud>B){
      cout<<"stay home\n";
    }
    else{
      cout<<minBud<<"\n";
    }
  }
}
