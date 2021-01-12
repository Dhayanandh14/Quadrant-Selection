#include<iostream>
using namespace std;
int main(){
      int x,y;
      cin>>x>>y;
        if (0 <= x && y <= 0) {
          cout<<"4";
        } else if (0 >= x && y <= 0) {
          cout<<"3";
        } else if (0 <= x && y >= 0) {
          cout<<"1";
        } else {
          cout<<"2";
        }

}