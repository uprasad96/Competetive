#include <bits/stdc++.h>
using namespace std;

int sumD(int n){
  int sum=0;
  while(n!=0){
    sum+=(n%10);
    n/=10;
  }
  return sum;
}
int f(int n){
  if(n<=9){
    return n;
  }
  else{
    return f(sumD(n));
  }
}
int main(){
  int n;
  cin>>n;
  while(n!=0){
    int res = f(n);
    cout<<res<<"\n";
    cin>>n;
  }
}
