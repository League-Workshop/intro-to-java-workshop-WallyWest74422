PImage rainbow;
PImage unicorn;
void setup() {
  rainbow=loadImage("rainbow.jpeg");
  unicorn=loadImage("unicorn.jpeg");
  size(800,600);
  rainbow.resize(800,600);
}
void draw() {
background(rainbow);  
if (mousePressed) {

image(unicorn,mouseX,mouseY);}
}
