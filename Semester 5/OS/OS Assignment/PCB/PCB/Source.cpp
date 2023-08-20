#include<iostream>
#include<Memory>
using namespace std;

struct AllocationMetircs {
	uint32_t totalAllocated = 0;
	uint32_t totalFree = 0;
	uint32_t currentUsage() {
		return totalAllocated - totalFree; 
	};
};

static AllocationMetircs s_AllocationMetrics;



void* operator new(size_t size) {
	
	s_AllocationMetrics.totalAllocated += size;

	return malloc(size);
}
void operator delete(void* memory, size_t size) {
	s_AllocationMetrics.totalFree+= size;
	free(memory);
}

static void printMemoryUsage() {
	cout << "Memory Usage: " << s_AllocationMetrics.currentUsage() << " bytes\n";
}

struct Object {
	int arr[250000];
};



int main() {
	printMemoryUsage();
	{
		unique_ptr<Object> obj = make_unique<Object>();
		printMemoryUsage();
	}
	printMemoryUsage();

}