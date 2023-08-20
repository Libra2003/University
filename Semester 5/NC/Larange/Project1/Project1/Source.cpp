#include<iostream>
using namespace std;


int main() {
	float table[10][2], xp, temp_ans = 0.0;
	int no, y = 0, a = 7, i, j;

	cout << "How many values of x?" << endl;
	cin >> no;
	cout << "Enter the value of X and f(x)\n";
	cout << "\n\t     x         |           f(x)";
	cout << "\n\t-------------------------------";
	for (int i = 0; i < no; i++)
	{
		gotoxy(11, a);
		cin >> table[i][y];
		gotoxy(21, a);
		cin >> table[i][y + 1];
		a++;
	}
	cout << "Enter the value of X   :    ";
	cin >> xp;

	for (int j = 0; j < no; j++)
	{
		temp_ans = 1;for (int i = 0; i < no; i++)
		{
			if (i != j) {
				temp_ans *= ((xp - table[i][0]) / (table[j][0] - [i][0]));
				temp_ans += temp_ans * table[j][i];
			}
			cout << "A N S W E R =         : " << temp_ans;
		}
	}
}