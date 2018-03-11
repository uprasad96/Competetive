#include <bits/stdc++.h>
using namespace std;
int main(){
  int n, m, c;
  int cnt = 1;
  while(scanf("%d %d %d",&n, &m, &c), (n||m||c)){
    bool dState[n];
    int dConsmp[n];
    for(int i=0;i<n;i++){
      cin>>dConsmp[i];
      dState[i] = false;
    }
    int TotConsmp = 0;
    int MaxConsmp = -1;
    for(int i=0;i<m;i++){
      int k;
      cin>>k;
      if(!dState[k-1]){
        dState[k-1]=true;
        TotConsmp+=dConsmp[k-1];
        MaxConsmp = max(TotConsmp,MaxConsmp);
      }
      else{
        dState[k-1]=false;
        TotConsmp-=dConsmp[k-1];
      }
    }
    if(MaxConsmp>c){
      cout<<"Sequence "<<cnt<<"\n";
      cout<<"Fuse was blown.\n\n";
    }
    else{
      cout<<"Sequence "<<cnt<<"\n";
      cout<<"Fuse was not blown.\n";
      cout<<"Maximal power consumption was "<<MaxConsmp<<" amperes.\n\n";
    }
    cnt++;
  }
}
