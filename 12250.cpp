#include <bits/stdc++.h>
using namespace std;
int main(){
  string str;
  cin>>str;
  int T = 1;
  while(str!="#"){
    if(str==("HELLO")){
      printf("Case %d: ENGLISH\n", T);
    }
    else if(str==("HOLA")){
      printf("Case %d: SPANISH\n", T);
    }
    else if(str==("HALLO")){
      printf("Case %d: GERMAN\n", T);
    }
    else if(str==("BONJOUR")){
      printf("Case %d: FRENCH\n", T);
    }
    else if(str==("CIAO")){
      printf("Case %d: ITALIAN\n", T);
    }
    else if(str==("ZDRAVSTVUJTE")){
      printf("Case %d: RUSSIAN\n", T);
    }
    else{
      printf("Case %d: UNKNOWN\n", T);
    }
    T++;
    cin>>str;
  }
}
