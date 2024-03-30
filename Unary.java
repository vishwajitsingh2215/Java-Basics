class Unary{
	public static void main(String[] args){
	//post increment
	int a=100;
	int b=a++;
	System.out.println("Post Increment");
	System.out.println("a: "+a+"   "+"b: "+b);
	//post decrement
	int c=a--;
	System.out.println("Post decrement");
	System.out.println("a: "+a+"   "+"c: "+c);
	//-----------------------------------------	
	
	//pre increment
	int d= ++a;
	System.out.println("Pre Increment");
	System.out.println("a: "+a+"   "+"d: "+d);

	/ff
	 int e= --a;
	System.out.println("Pre Decrement");
	System.out.println("a: "+a+"   "+"e: "+e);
}


}