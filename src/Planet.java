class Planet{
	void revolve(){
		System.out.println("The Planets revolve around the sun");
}
	public static void main(String[] args){
		Planet Earth = new Planet();
		Planet Mars = new Planet ();
		Earth.revolve();
		Mars.revolve();
}
}
