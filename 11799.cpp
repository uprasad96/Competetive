#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  for(int t=0;t<T;t++){
    int N;
    cin>>N;
    int maxspeed = -1;
    while (N--) {
      int speed;
      cin>>speed;
      maxspeed=max(speed,maxspeed);
    }
    cout<<"Case "<<t+1<<": "<<maxspeed<<"\n";
  }
}
