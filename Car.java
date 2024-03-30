class Car{
	String color;
	String model;
	public static void main(String[] args){
	
	Car c1= new Car("red","swift");
	Car c2= new Car("white","seltos");
	
	c1.start();
	c1.move();
	c2.start();
	c2.move();
	

}
	Car(String col, String m)
	{
		this.color= col;
		this.model= m;
	}
	void start(){
		System.out.println(color+" "+model+" starts");
	}
	void move(){
		System.out.println(color+" "+model+" moves");
	}

}