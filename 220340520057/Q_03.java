class twoStacks{
	int size;
	int tos1;
	int tos2;
	int a[];
	twoStacks(int d){
		a=new int[d];
		size=d;
		tos1=-1;
		tos2=size;
 }
 void push1(int x){
	 if(tos1<tos2-1){
		 tos1++;
		 a[tos1]=x;
	 }
	 else{
		 System.out.println("overflow");
	 }
 }
 void push2(int y){
		if(tos1<tos2-1){
			tos2--;
			a[tos2]=y;
		}
		else{
			System.out.println("overflow");
		}
 }
 void pop1(){
	 if(tos1<size){
		 System.out.println("Popped element from stack1 is "+a[tos1]);
		 tos1--;
		 return;
	 }
	 else{
		 System.out.println("underflow");
	 }
 }
 void pop2(){
	 if(tos2<size){
		 System.out.println("Popped element from stack2 is "+ a[tos2]);
		 tos2++;
		 return;
	 }
	 else{
		 System.out.println("underflow");
	 }
 }
public static void main(String args[]){
	twoStacks ts=new twoStacks(10);
	ts.push1(5);
	ts.push2(10);
	ts.push2(15);
	ts.push1(11);
	ts.push2(7);
	ts.push2(40);
	ts.pop1();
	ts.pop2();
}


}