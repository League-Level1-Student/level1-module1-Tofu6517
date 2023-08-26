package _07_duck;

public class Duck {
	int numberOfFriends=0;
	String favoriteFood="";
	
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
	void quack() {
System.out.println("quack");
	}
	void waddel() {
		
		
	}
	
}
class Cat {
	int numberOfFriends=0;
	String favoritePlace="";
	
	Cat(String favoritePlace, int numberOfFriends) {
      	this.favoritePlace = favoritePlace;
      	this.numberOfFriends = numberOfFriends;
}
	
	void meow() {
		System.out.println("meow");
	}
	void walk() {
		
	}
	
	
}





