class RelationalAndLogical {
	
	public static void main(String[] args){

	int x=10;
	int y=20;
	System.out.println(x<y);
	System.out.println(x>y);
	System.out.println(x==y);
	System.out.println(x<=y);
	System.out.println(x>=y);
	System.out.println(x==10);
	System.out.println(x!=10);
	System.out.println("---------------------------------------");
	//LogicalOperators
	System.out.println(x<y || x==10);
	System.out.println(x<y || x!=10);
	System.out.println(x<y && x==10);
	System.out.println(x<y && x!=10);
	System.out.println(!true);
	System.out.println(!false);
	System.out.println(!(x<y));
}
}
