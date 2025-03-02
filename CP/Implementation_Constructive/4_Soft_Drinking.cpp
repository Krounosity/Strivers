    #include <bits/stdc++.h>

    using namespace std;

    int main() {

        int n, k, l, c, d, p, nl, np;

        cin >> n >> k >> l >> c >> d >> p >> nl >> np;

        int sandWichByMLs = (k*l)/nl;
        int sandWichByLimes = (c*d);
        int sandWichBySalt = (p/np);

        cout << (min(sandWichByMLs, min(sandWichByLimes, sandWichBySalt)))/n << endl;

        return 0;
    }