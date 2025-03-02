#include <bits/stdc++.h>

using namespace std;

int main() {
    string str;
    cin >> str;

    char suppl = str[str.length()-1];

    for (int i = 0; i < str.length(); i++) {
        if (str[i] >= '5') {

            if(!(str[i] == '9' && i == 0)) str[i] = (char) ((9 - (str[i] - '0')) + '0');
        }
    }

    bool haHaiNonZero = false;

    for(char ch : str){
        if(ch > '0'){
            haHaiNonZero = true;
            break;
        }
    }

    if(haHaiNonZero){
        cout << str << endl;
    } else {
        cout << suppl << endl;
    }

    return 0;
}