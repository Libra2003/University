#include <iostream>
#include <string>
using namespace std;

string CipheredText = "";

string Decryption(int decrpt_key) {
    string deciphereText = "";
    for (int i = 0; i < CipheredText.length(); i++) {
        int letter = int(CipheredText[i]) - decrpt_key;
        char new_letter = char(letter);
        deciphereText += new_letter;
    }
    return deciphereText;
}
static int encrypt_key = 0;


int main() {
    while (true) {
        string plaintext;
        cout << "Enter the plain text: ";
        cin.ignore();
        getline(cin, plaintext);
        if (plaintext.length() == 0) {
            cout << "Error: Empty string was entered" << endl;
        }
        else {
            cout << "Enter Key: ";
            cin >> encrypt_key;
            cin.ignore(); // Ignore the remaining newline character
            for (int i = 0; i < plaintext.length(); i++) {
                int letter = int(plaintext[i]) + encrypt_key;
                char new_letter = char(letter);
                CipheredText += new_letter;
            }
        }
        cout << "Plain Text: " << plaintext << endl;
        cout << "Ciphered Text: " << CipheredText << endl;

        cout << "Decryption: " << endl;
        int decrpt_key = 0;
        cout << "Enter Decryption Key: ";
        cin >> decrpt_key;

        if (decrpt_key == encrypt_key) {
            cout << "Correct Key" << endl;
            cout << "Deciphered Text" << endl;
            cout << "Ciphered Text: " << CipheredText << endl;
            cout << "Deciphered Text: " << Decryption(decrpt_key) << endl;
        }
        else {

            cout << "Wrong Key" << endl;
            cout << "Deciphered Text" << endl;
            cout << "Ciphered Text: " << CipheredText << endl;
            cout << "Deciphered Text: " << Decryption(decrpt_key) << endl;
        }
        // Clear CipheredText for the next iteration
        CipheredText = "";
    }

    return 0;
}
