#include<bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    int N, R;
    cin>>N>>R;
    int Geeks[N];
    int minG = INT_MAX;
    int maxG = INT_MIN;
    for(int i=0;i<N;i++){
      cin>>Geeks[i];
      if(Geeks[i]<minG){
        minG=Geeks[i];
      }
      if(Geeks[i]>maxG){
        maxG = Geeks[i];
      }
    }
    if(Geeks[N-1]!=R){
      cout<<"NO\n";
      continue;
    }
    if(N==1 || N==2){
      cout<<"YES\n";
      continue;
    }
    int Lext, Rext;
    if(Geeks[1]>Geeks[0]){
      Lext = Geeks[0];
      Rext = maxG;
    }
    if(Geeks[1]<Geeks[0]){
      Rext = Geeks[0];
      Lext = minG;
    }
    bool valid = true;
    for(int i=2;i<N;i++){
      if(Geeks[i]>Geeks[i-1]){
        if(Geeks[i]>Rext){
          valid = false;
          break;
        }
        Lext = min(Geeks[i-1], Rext);
      }
      if(Geeks[i]<Geeks[i-1]){
        if(Geeks[i]<Lext){
          valid = false;
          break;
        }
        Rext = max(Geeks[i-1], Lext);
      }
    }
    if(valid){
      cout<<"YES\n";
    }
    else{
      cout<<"NO\n";
    }
  }
}
