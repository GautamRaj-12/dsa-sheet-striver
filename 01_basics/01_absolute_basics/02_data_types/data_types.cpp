// Integer: 4 bytes
// Long: 8 bytes
// Float: 4 bytes
// Double: 8 bytes
// Character: 1 byte
#include <iostream>
using namespace std;
int main(){
    string data_type;
    cin>>data_type;

    if(data_type=="Integer")
        cout<<sizeof(int);
    else if(data_type=="Long")
        cout<<sizeof(long);
    else if(data_type=="Float")
        cout<<sizeof(float);
    else if(data_type=="Double")
        cout<<sizeof(double);
    else
        cout<<sizeof(char);
}