#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  int k=1;
  while(T--){
    string str[10];
    int prefs[10];
    int hi=0;
    for(int i=0;i<10;i++){
      cin>>str[i];
      cin>>prefs[i];
      if(prefs[i]>hi){
        hi=prefs[i];
      }
    }
    cout<<"Case #"<<k<<":\n";
    for(int i=0;i<10;i++){
      if(prefs[i]==hi){
          cout<<str[i]<<"\n";
      }
    }
    k++;
  }
}
