
class journey{
int distance;
String destination = "home";
	
	
	
	

 journey(int distance, String destination){
	this.distance= distance;
	this.destination=destination;
	
	
	
	
}
 public static void main(String[] args) {
	journey j = new journey(50, "home");
	System.out.println(j.destination);
	System.out.println(j.distance);
}
}
