class Button1{
	String label;
	String bgcolor;
	public static void main(String[] args){
		Button1 b1= new Button1("OK","BLUE");
		b1.click();
		Button1 b2= new Button1("CANCEL","RED");
		b2.click();			
}
	Button1(String l, String bg){
	this.label = l;
	this.bgcolor = bg;
	}
	void click(){
	System.out.println(this.label+" button clicked");
	}
}