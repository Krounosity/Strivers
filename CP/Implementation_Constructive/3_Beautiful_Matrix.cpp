#include <bits/stdc++.h>

using namespace std;

int main() {

    int i = 1, j = 1;
    int row,col;

    for(i = i; i<=5; i++){
        for(j = 1; j<=5; j++){
            int num;
            cin >> num;
            if(num == 1){
                row = i;
                col = j;
            }
        }
    }

    cout << abs(row - 3) + abs(col - 3) << endl;

    return 0;
}