class MethodExample{
	String name;
	public static void main(String[] args){
		MethodExample m1= new MethodExample();
		MethodExample m2= new MethodExample();
		MethodExample m3= new MethodExample();
		
		m1.print("Luffy");
		m2.print("Luffy");


}
		void print(String n){
			this.name =n;
			System.out.println("Name ="+this.name);
			System.out.println("this ="+this);
}
}