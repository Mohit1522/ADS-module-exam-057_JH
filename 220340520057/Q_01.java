import java.util.*;
class Q_01{
	static int size;
	void insertion(int a[]){
		int temp=a[size-1];
		if(temp>a[size-2]){
			swapping(a);
			size--;
		}
		for(int i=1;i<size;i++){
			int k=a[i];
			int j=i-1;
			while(j>=0 && a[j]>k){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=k;
		}
		
	}
	void swapping(int a[]){
		
	}
	
void display(int a[]){
	for(int i=0;i<size;i++){
		System.out.print(a[i]+" ");
	}
}


public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	Q_01 q=new Q_01();
	System.out.println("enter the size of array");
	size=sc.nextInt();
	System.out.println("now enter the array element");
	int []a=new int[size];
	for(int i=0;i<size;i++){
		a[i]=sc.nextInt();
	}
	q.insertion(a);
	q.display(a);
	
}
}