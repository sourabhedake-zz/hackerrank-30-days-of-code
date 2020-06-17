#include <iostream>
#include <iomanip>
#include <limits>

using namespace std;

int main() {
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";

    int inp1;
    double inp2;
    string inp3;

    cin>>inp1;
    cin>>inp2;
    cin.ignore();
    getline(std::cin, inp3);

    i += inp1;
    d += inp2;
    cout << i << endl;
    cout << std::fixed <<  std::setprecision(1) << d << endl;
    cout << s;
    cout << inp3 <<endl;

    return 0;
}