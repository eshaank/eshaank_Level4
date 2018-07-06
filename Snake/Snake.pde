// 1. Follow the recipe instructions inside the Segment class.
// This class will be used to represent each part of the moving snake.
class Segment {
  //2. Create x and y member variables to hold the location of each segment.
  int x;
  int y;
  // 3. Add a constructor with parameters to initialize each variable.
  Segment(int x, int y) {
    this.x = x;
    this.y = y;
  }
  // 4. Add getter and setter methods for both the x and y member variables.

  int getX() {
    return x;
  }
  int getY() {
    return y;
  }
  void setX(int x) {
    this.x = x;
  }
  void setY(int y) {
    this.y = y;
  }
}
// 5. Create (but do not initialize) a Segment variable to hold the head of the Snake
Segment head;


// 6. Create and initialize String to hold the direction of your snake e.g. "up"
final String up = "up";
final String down = "down";
final String left = "left";
final String right = "right";
String direction = up;

// 7. Create and initialize a variable to hold how many pieces of food the snake has eaten.
int foodEaten = 0;

// 8. Create and initialize foodX and foodY variables to hold the location of the food.
// (Hint: use the random method to set both the x and y to random locations within the screen size (500 by 500).)
int foodX = ((int)random(50)*10);
int foodY = ((int)random(50)*10);

void setup() {
  // 9. Set the size of your sketch (500 by 500).
  size(500, 500);

  // 10. initialize your head to a new segment.
  head = new Segment(250, 250);
  // 11. Use the frameRate(int rate) method to set the rate to 20.
  frameRate(15);
 
}

void draw() {
  background(0);

  //12. Call the drawFood, drawSnake, move, and collision methods.
  drawFood();
  move();
  drawSnake();
  collision();
  bodyCollision();
  drawTail();
}

// 13. Complete the drawFood method below. (Hint: each piece of food should be a 10 by 10 rectangle).
void drawFood() {
  fill(255, 0, 0);
  rect(foodX, foodY, 10, 10);
}

//14. Draw the snake head
void drawSnake() {
  fill(0, 255, 0);
  rect(head.x, head.y, 10, 10);
  //test your code
}

// 15. Complete the move method below.
void move() {
  // 16. Create a switch statement using your direction variable. Depending on the direction, add a new segment to your snake.
  // The first case will look like this
  switch(direction) {
  case up:
    head = new Segment(head.getX(), head.getY() - 10);
    break;
  case down:
    head = new Segment(head.getX(), head.getY() + 10);
    break;
  case left:
    head = new Segment(head.getX() - 10, head.getY());
    break;
  case right:
    head = new Segment(head.getX() + 10, head.getY() );
    break;
  
     }
  checkBoundaries();

  // 17. Call the checkBoundaries method to make sure the snake doesn't go off the screen.
}

// 18. check if your head is out of bounds (teleport you snake to the other side).
void checkBoundaries() {
  if (head.x < 0) {
    head.setX(width);
  } else if (head.x > width) {
    head.setX(0);
  } else if (head.y < 0) {
    head.setY(width);
  } else if (head.y > width ) {
    head.setY(0) ;
  }
}


// 19. Complete the keyPressed method below. Use if statements to set your direction variable depending on what key is pressed. 
void keyPressed() {
  if (keyCode == UP) {
    direction = up;
    
  } 
  else if (keyCode == DOWN) {
    direction = down;
   
  } 
  else if (keyCode == RIGHT) {
    direction = right;
    
  } 
  else if (keyCode == LEFT) {
    direction = left;
    
  }
}
//20. Make sure that the key for your current direction’s opposite doesn’t work(i.e. If you’re going up, down key shouldn’t work)


// 21. Complete the missing parts of the collision method below.
void collision() {
  // If the segment is colliding with a piece of food...
if(head.getX() == foodX && head.getY() == foodY){
  foodEaten +=1;
  foodX = ((int)random(50)*10);
  foodY = ((int)random(50)*10);
  
}
  // Increase the amount of food eaten and set foodX and foodY to new random locations.
}


/**
 ** Part 2: making the tail 
 **/
//  1. Create and initialize an ArrayList of Segments. (This will be your snake!)
ArrayList<Segment>snake = new ArrayList<Segment>();

// 2. Complete the missing parts of the drawTail method below.
void drawTail() {
  // Add your head to your ArrayList
snake.add(head);
  // Draw a 10 by 10 rectangle for each Segment in your snake ArrayList.
 for (Segment s : snake) {
    rect(s.x, s.y, 10, 10);
  }

  // While the snake size is greater than your food, remove the first Segment in your snake.
    while (snake.size()>foodEaten) {
    snake.remove(0);
  }

}

// 3. Complete the missing parts of the bodyCollision method below.
void bodyCollision() {
  // If different segments have the same location...
  // Set food back to 3.
 for (Segment s : snake) {
    if(s.x == head.x && s.y == head.y){
      foodEaten = 2;
  }
 
}
}
