#include<iostream>
using namespace std;


class Heap{
public:
int arr[1000];
int size;

 Heap(){

arr[0]=-1;
size=0;

}


void insert(int val ){


size=size+1;

int index=size;
arr[index]=val;

while(index>1){

int parent=index/2;
if(arr[parent]<arr[index]){


swap(arr[parent],arr[index]);

index=parent;
}
else
    return ;




}


}
void deleteheap(){



if(size==0)
{

cout<<"nothing to delete"<<endl;
}

arr[1]=arr[size];


int i=1;

while(i<size){
int l=2*i;

int r=2*i+1;

 if(l<size&&arr[l]>arr[i]){
 swap(arr[i],arr[l]);
 i=l;}
else if(r<size&&arr[r]>arr[i]){
 swap(arr[i],arr[r]);
 i=r;}
 else
     return ;




}

}



void display()
{

for (int i=1; i<=size; ++i)
   cout << arr[i] << " ";
   cout << "\n";


}

};

void heapify(int arr[], int size, int i){

    int largest =i;

     int l=2*i;
     int  r=2*i+1;


     if(l<=size&&arr[l]>arr[largest]){
            largest=l;
        
     }    
    
    
     if(r<=size&&arr[r]>arr[largest]){
            largest=r;
        
     } 

 if(i!=largest){


swap(arr[largest],arr[i]);

i=largest;


 }








}

void heapsort(int arr[],int n ){


int size=n;


while(size>1){




    swap(arr[size],arr[1]);
    size--;

    heapify(arr,size,1);
}



}

int main(){


Heap h;



h.insert(60);
h.insert(50);
h.insert(40);
h.insert(30);
h.insert(20);
h.insert(155);


h.display();

h.deleteheap();

h.display();

int n=5;
int arr[6]={-1,5,4,8,9,6};

for(int i=n/2;i>0;i--)
heapify(arr,n,i);


for(int i=1;i<=n;i++)
cout<<arr[i]<<" ";

cout<<endl;



heapsort(arr,n);


for(int i=1;i<=n;i++)
cout<<arr[i]<<" ";


}



