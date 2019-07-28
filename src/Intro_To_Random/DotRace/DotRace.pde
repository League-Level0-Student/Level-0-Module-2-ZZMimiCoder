int X = 0;
void setup() {
    size(800, 200);
}
void draw() {
   //3. make the ellipse a nice color
   background(0, 255, 255);
   if (mousePressed) {
     X = X + 5;
     ellipse(X, 100, 25, 25);
     if (X > 795) {
       PlaySound();
     }
   }
}
import ddf.minim.*;
boolean SoundPlayed = false;
void PlaySound() {
    if (!SoundPlayed) {
        Minim Player = new Minim(this);
        AudioSample Sound = Player.loadSample("Ding.wav");
        Sound.trigger();
        SoundPlayed = true;
    }
}
