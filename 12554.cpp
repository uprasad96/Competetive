#include<bits/stdc++.h>
using namespace std;
int main(){
  int N;
  cin>>N;
  string voice[N];
  for(int i=0;i<N;i++){
    cin>>voice[i];
  }
  string song[16]={"Happy","birthday","to","you","Happy","birthday","to","you","Happy","birthday","to","Rujia","Happy","birthday","to","you"};
  int v=0, s=0;
  int vi = v%N;
  int si = s%16;
  while(v<N || si!=15){
    vi=v%N;
    si=s%16;
    cout<<voice[vi]<<": "<<song[si]<<"\n";
    v++;
    s++;
  }
}
