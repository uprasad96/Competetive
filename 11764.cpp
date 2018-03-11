#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  int tempT=T;
  while(T--){
    int N;
    cin>>N;
    int HJ=0;
    int LJ=0;
    int prev;
    int curr;
    if(N>0){
      cin>>curr;
      N--;
    }
    while(N--){
      prev=curr;
      cin>>curr;
      if(curr>prev){
        HJ++;
      }
      if(curr<prev){
        LJ++;
      }
    }
    cout<<"Case "<<tempT-T<<": "<<HJ<<" "<<LJ<<"\n";
  }
}
