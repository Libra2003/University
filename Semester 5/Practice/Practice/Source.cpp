#include<iostream>
#include<queue>
using namespace std;

int a[7] = { 0,30,15,45,6,22, 2 };

//Insertion Sort
void insertSort() {
	int min, temp;
	for (int i = 0;i < 7;i++) {
		min = i;
		for (int j = i + 1;j < 7;j++) {
			if (a[min] > a[j]) {
				min = j;
			}
		}
		swap(a[min], a[i]);
	}

	for (int i = 0; i < 7;i++) {
		cout << a[i] << " ";
	}
}

//Selection Sort
void selectionSort() {
	int Size = 7;
	for (int i = 0;i < Size-1;i++) {
		 
		for (int j = 0;j < Size-1;j++) {
			if (a[j] > a[j + 1]) {
				swap(a[j], a[j + 1]);
			}
		}
	}

	for (int i = 0; i < 7;i++) {
		cout << a[i] << " ";
	}
}

int main() {
	queue<int> intQueue;

}