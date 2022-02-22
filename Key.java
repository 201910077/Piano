import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Key extends Actor
{
    String key;
    String sound;
    Boolean isPressed = false;
    String upImage;
    String downImage;
    
    public Key(String keyName, String file, String notPressed, String Pressed){
        
        setImage(notPressed);
        key = keyName;
        sound = file;
        upImage = notPressed;
        downImage = Pressed;
    }
   
    public void act() 
    {
         keyPress();
    }
    public void keyPress(){
        if (Greenfoot.isKeyDown(key) && isPressed == false){
             setImage(downImage);
             soundPlay();
             isPressed = true;
           }
        if (!Greenfoot.isKeyDown(key) && isPressed){
             setImage(upImage);
             isPressed = false;
           }   
    }
    public void soundPlay(){
        Greenfoot.playSound(sound);
    }
}
