PImage Zombie ;
void setup() {
    size (700,600);

Zombie = loadImage("NeonBoi.jpeg");
Zombie.resize (700,600);
}
void draw() {
  image (Zombie,0,0);

  fill (mouseX,mouseY,mouseX-mouseY);  
  ellipse(195,221,75,75);
  
  
  
  ellipse(305,221,75,75);
  
  
  
  fill (#030000);
  ellipse(195,221,15,15);
  fill (#030000);
  ellipse(305,221,15,15);












}
