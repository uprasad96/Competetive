#include<bits/stdc++.h>
using namespace std;
int main(){
  char inp[1000000];
  int count = 1;
  int T;
  while (scanf("%s %d", inp, &T)==2) {
    cout<<"Case "<<count<<":\n";
    while (T--) {
      int l, r;
      cin>>l>>r;
      int L = min(l,r);
      int R = max(l,r);
      bool same = true;
      int val = inp[L];
      for(int i=L+1;i<=R;i++){
        int curr = inp[i];
        if(curr != val){
          same = false;
          break;
        }
      }
      if(same){
        cout<<"Yes\n";
      }
      else{
        cout<<"No\n";
      }
    }
    count++;
  }
}
