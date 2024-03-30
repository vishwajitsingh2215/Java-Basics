class MarksValidation{
	public static void main(String[] args){
		int marks=58;
	if(marks>=0 && marks<=35){
		System.out.println("Fail");	
	}
	else if(marks>=36 && marks<=70){
		System.out.println("Fc");
	}
	else if(marks>=71 && marks<=100){
		System.out.println("Fcd");
	}
	else{
		System.out.println("Invalid marks");
	}
	
}
}