#include<bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    int N, P;
    cin>>N>>P;
    int easy = 0;
    int hard = 0;
    while(N--){
      int Pi;
      cin>>Pi;
      if(Pi>=P/2){
        easy++;
      }
      if(Pi<=P/10){
        hard++;
      }
    }
    if(easy==1 && hard==2){
      cout<<"yes\n";
    }
    else{
      cout<<"no\n";
    }
  }
}
