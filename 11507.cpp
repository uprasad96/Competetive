#include<bits/stdc++.h>
using namespace std;
int main(){
  int T;
  while(scanf("%d",&T), T){
    bool respond = true;
    string bend = "+x";
    for(int i=0;i<T-1;i++){
      string force;
      cin>>force;
      if(force == "No"){
        /*Do nothing*/
      }
      else if(force=="+y"){
        if(bend == "+x"){
          bend = "+y";
        }
        else if(bend == "-x"){
          bend = "-y";
        }
        else if(bend == "+y"){
          bend = "-x";
        }
        else if(bend == "-y"){
          bend = "+x";
        }
        else if(bend == "+z"){
          bend = "+z";
        }
        /*Bend is -z here*/
        else{
          bend = "-z";
        }
      }
      else if(force=="-y"){
        if(bend == "+x"){
          bend = "-y";
        }
        else if(bend == "-x"){
          bend = "+y";
        }
        else if(bend == "+y"){
          bend = "+x";
        }
        else if(bend == "-y"){
          bend = "-x";
        }
        else if(bend == "+z"){
          bend = "+z";
        }
        /*Bend is -z here*/
        else{
          bend = "-z";
        }
      }
      else if(force == "+z"){
        if(bend == "+x"){
          bend = "+z";
        }
        else if(bend == "-x"){
          bend = "-z";
        }
        else if(bend == "+y"){
          bend = "+y";
        }
        else if(bend == "-y"){
          bend = "-y";
        }
        else if(bend == "+z"){
          bend = "-x";
        }
        /*Bend is -z here*/
        else{
          bend = "+x";
        }
      }
      /*force is -z here*/
      else{
        if(bend == "+x"){
          bend = "-z";
        }
        else if(bend == "-x"){
          bend = "+z";
        }
        else if(bend == "+y"){
          bend = "+y";
        }
        else if(bend == "-y"){
          bend = "-y";
        }
        else if(bend == "+z"){
          bend = "+x";
        }
        /*Bend is -z here*/
        else{
          bend = "-x";
        }
      }
    }
    cout<<bend<<"\n";
  }
}
