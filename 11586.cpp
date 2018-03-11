#include<bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  getchar();
  while(T--){
    string Pieces;
    getline(cin, Pieces);
    int M = 0;
    int F = 0;
    for(int i=0;i<Pieces.length();i++){
      if(Pieces[i]=='M'){
        M++;
      }
      if(Pieces[i]=='F'){
        F++;
      }
    }
    if(M==F & M!=1){
      cout<<"LOOP\n";
    }
    else{
      cout<<"NO LOOP\n";
    }
  }
}
