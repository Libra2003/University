#include <iostream>
#include<string>
#include <unordered_map>
using namespace std;

void monoAlphaCipher() {
	unordered_map <char, char> subsitute_table{
		{'A','K'},{'B','C'},{'C','P'},{'D','S'},{'E','V'},{'F','M'},
		{'G','H'},{'H','F'},{'I','D'},{'J','B'},{'K','U'},{'L','W'},
		{'M','Q'},{'N','N'},{'O','R'},{'P','Y'},{'Q','T'},{'R','J'},
		{'S','O'},{'T','U'},{'U','X'},{'V','E'},{'W','L'},{'X','A'},
		{'Y','Z'},{'Z','G'}
	};

	size_t length = subsitute_table.size();
	string plaintext = "";
	cout << "Enter Your Message: " << endl;
	cin.ignore();
	getline(cin, plaintext);
	int plainlength = plaintext.length();
	string cipheredtext = plaintext;

	for (int i = 0; i < plainlength;i++) {
		for (const auto& entry : subsitute_table)
		{
			if (entry.first == cipheredtext[i]) {
				cipheredtext[i] = entry.second;
			}
		}
	}

	cout <<"PlainText: "<< plaintext << endl;
	cout <<"CipheredText: "<< cipheredtext << endl;
}


int main() {
	monoAlphaCipher();
}