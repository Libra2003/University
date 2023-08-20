#include<iostream>
using namespace std;
#define Max 30
char encrypt(char words[], int limit) {
	for (int i = 0; i <limit; i++)
	{
		words[i] = int(words[i])+5;
	}
	return *words;

}
void display(char words[],int limit) {
	for (int i = 0; i < limit; i++)
	{
		cout << words[i];
	}
	cout << endl;
}

char decrypt(char words[], int limit) {
	for (int i = 0; i < limit; i++)
	{
		words[i] = int(words[i])-5;
	}
	return *words;

}

int main() {
	char words[Max];
	string word;
	cout << "Enter Sentence: " << endl;
	cin.getline(words, Max);
	int i = 0;
	while (words[i]!='\0')
	{
		i++;
	}
	cout << endl;
	cout << "Entered" << endl;
	display(words, i);

	encrypt(words, i);
	cout << "Encrypted: ";
	display(words, i);

	decrypt(words, i);
	cout << "Decrypted: ";
	display(words, i);
}