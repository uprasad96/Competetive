#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  for(int t=0;t<T;t++){
    int N;
    cin>>N;
    int mileCost=0;
    int juiceCost=0;
    for(int i=0;i<N;i++){
      int dur;
      cin>>dur;
      mileCost+=((dur/30)+1)*10;
      juiceCost+=((dur/60)+1)*15;
    }
    cout<<"Case "<<t+1<<": ";
    if(mileCost<juiceCost){
      cout<<"Mile "<<mileCost<<"\n";
    }
    if(juiceCost<mileCost){
      cout<<"Juice "<<juiceCost<<"\n";
    }
    if(juiceCost==mileCost){
      cout<<"Mile Juice "<<mileCost<<"\n";
    }
  }
}
