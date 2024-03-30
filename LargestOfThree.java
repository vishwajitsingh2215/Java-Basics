class LargestOfThree{
	public static void main(String[] args){
	int a= 30;
	int b=20;
	int c=10;
	if(a>b && a>c){
		System.out.println(a+"  is the largest");	
	}
	else if(b>a && b>c){
		System.out.println(b+"  is the largest");
	}
	else if(c>a && c>b){
		System.out.println(c+"  is the largest");
	}
	else{
		System.out.println("Invalid");
	}

}
}