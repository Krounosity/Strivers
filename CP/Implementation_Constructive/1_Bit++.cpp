// Online C++ compiler to run C++ program online
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    
    int n;
    cin >> n;
    
    int x = 0;
    while(n--){
        string strIn;
        cin >> strIn;
        
        if(strIn == "X++" || strIn == "++X") x++;
        else x--;
    }
    
    cout << x << endl;
    
    return 0;
}