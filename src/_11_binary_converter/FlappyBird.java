package _11_binary_converter;


import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x=400;
    int y=300;
    int birdYVelocity = 2;
    int gravity = 1;
    int X=600;
    int pipeGap=200;
    int upperPipeHeight = (int) random(100, 400);
    int lowerY = upperPipeHeight +pipeGap;
    int score = 0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
    	if(intersectsPipes()) {
    		exit();
    	}
    	birdYVelocity=birdYVelocity+gravity;
    	y=y+birdYVelocity;
    	background(0,0,150);
    	fill(100,0,0);
    	stroke(100,0,0);
    	ellipse(x,y,20,20);
    	fill(0,200,0);
    	X-=2;
    	rect(X,-1,50,upperPipeHeight);
    	rect(X,lowerY,50,400);
    	rect(0,600,800,-20);
    	if (y>=580) {
    		exit();
    		
    	}
    	if(x==X) {
    	checkCatch(x);
    	}
    		text("Score: " + score, 20, 20);
    
    	
    	if(X<=-50) {
    	upperPipeHeight = (int) random(100, 400);
    	lowerY = upperPipeHeight +pipeGap;
    		X+=850;
    	}
    }
    
    void checkCatch(int x) {
        if (x==X) {
            score++;
        } else if (score > 0) {
            score--;
        }
        println("Your score is now: " + score);
    }

    boolean intersectsPipes() { 
        if (y < upperPipeHeight && x > X && x < (X+50)){
           return true; }
       else if (y>lowerY && x > X && x < (X+50)) {
           return true; }
       else { return false; }
}
    
    public void mousePressed(){
    	if(mousePressed) {
    		birdYVelocity=-15;
    	}
    }
    public void teleportPipes(){
    	if(X<=-50) {
    		X+=650;
    		rect(X,-1,50,400);
    	}
    }

    
    
    
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}