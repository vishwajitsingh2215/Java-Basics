class Login{
	public static void main(String[] args){
		String id="admin";
		int pwd = 123;
	if(id=="admin"){
		System.out.println("ID is valid");

		if(pwd==123){
			System.out.println("Logged in successfully");
		}
		else{	
			System.out.println("Password is invalid");	
			System.out.println("Login unsuccessful");
		}
	}
	else{
		System.out.println("ID is invalid");	
		System.out.println("Login unsuccessful");
		
	}

	}
}