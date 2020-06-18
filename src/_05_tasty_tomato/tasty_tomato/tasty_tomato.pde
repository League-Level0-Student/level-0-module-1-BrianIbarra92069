void setup() {
    size(500, 500);
    background(0,250, 0);
}
void draw() {
    background(200, 200, 200);
    fill(#00FFC1);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#00FF12);
    rect(176, 103, 12, 32);
    noStroke();
    
    if(mousePressed){
    fill(#FFFFFF);
      ellipse(250,200,50,50);
    
    }     
 }
