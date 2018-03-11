#include<bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    int N, K;
    cin>>N>>K;
    set <int> MSet;
    for(int i=0;i<N;i++){
      int elem;
      cin>>elem;
      MSet.insert(elem);
    }
    int count=0;
    for(int i=0; ;i++){
      if(count==K){
        break;
      }
      if(MSet.find(i)==MSet.end()){
        MSet.insert(i);
        count++;
      }
    }
    int MEX=0;
    for(int i=0; ;i++){
      if(MSet.find(i)==MSet.end()){
        MEX=i;
        break;
      }
    }
    cout<<MEX<<"\n";
  }
}
