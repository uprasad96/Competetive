#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    int fp=0;
    int N;
    cin>>N;
    int moves[N];
    for(int i=0;i<N;i++){
      string str1;
      cin>>str1;
      if(str1=="LEFT"){
        moves[i]=-1;
      }
      if(str1=="RIGHT"){
        moves[i]=1;
      }
      if(str1=="SAME"){
        string str2;
        cin>>str2;
        int mi;
        cin>>mi;
        moves[i]=moves[mi-1];
      }
    }
    for(int i=0;i<N;i++){
      fp+=moves[i];
    }
    cout<<fp<<"\n";
  }
}
