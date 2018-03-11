#include <bits/stdc++.h>
using namespace std;
int main(){
  int N;
  cout<<"Lumberjacks:\n";
  cin>>N;
  while(N--){
    int curr;
    int prev;
    cin>>curr;
    bool order = true;
    bool inc = true;
    prev=curr;
    cin>>curr;
    if(curr<prev){
      inc=false;
    }
    for(int i=2;i<10;i++){
      prev=curr;
      cin>>curr;
      if(curr<prev && inc){
        order=false;
      }
      if(curr>prev && !inc){
        order = false;
      }
    }
    if(order){
      cout<<"Ordered\n";
    }
    else{
      cout<<"Unordered\n";
    }
  }
}
