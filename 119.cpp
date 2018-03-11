#include <bits/stdc++.h>
using namespace std;
int main(){
  int N;
  int count=0;
  while(scanf("%d",&N)==1){
    if(count!=0){
      cout<<"\n";
    }
    string friends[N];
    int amount[N];
    int net[N];
    for(int i=0;i<N;i++){
      cin>>friends[i];
      amount[i]=0;
      net[i]=0;
    }
    for(int k=0;k<N;k++){
      string frnd;
      cin>>frnd;
      for(int i=0;i<N;i++){
        if(friends[i]==frnd){
          cin>>amount[i];
          int M;
          cin>>M;
          for(int j=0;j<M;j++){
            string rec;
            cin>>rec;
            for(int l=0;l<N;l++){
              if(friends[l]==rec){
                net[l]+=(amount[i]/M);
                net[i]-=(amount[i]/M);
                break;
              }
            }
          }
          break;
        }
      }
    }
    for(int i=0;i<N;i++){
      cout<<friends[i]<<" "<<net[i]<<"\n";
    }
    count++;
  }
}
