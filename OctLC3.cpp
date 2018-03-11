#include<bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    int n;
    cin>>n;
    for(int i=0;i<65535;i++){
      cout<<65536<<" ";
    }
    for(int i=65535;i<n;i++){
      cout<<1;
      if(i!=n-1){
        cout<<" ";
      }
    }
    cout<<"\n";
  }
}
