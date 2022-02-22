import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    String[] whiteChord= {"a", "s", "d", "f", "g","h","j","k","l",";","'","]"};
    String[] blackChord= {"w", "e", "", "t","y","u","","o","p","","["};
    String[] whiteSound= {"3c","3d","3e", "3f","3g", "3a","3b", "4c", "4d", "4e","4f","4g"};
    String[] blackSound= {"3c#", "3d#","","3f#","3g#", "3a#","","4c#","4d#","","4f#"};
    public MyWorld()
    {    
        super(800, 400, 1); 
        pianoKeys();
    }
    private void pianoKeys(){
        for (int i = 0; i < whiteChord.length; i++){
            Key wk = new Key(whiteChord[i], whiteSound[i]+ ".wav", "white-key.png", "white-key-down.png");
            addObject(wk, 54 + i * 63, 130);
        }
        
        for (int i = 0; i < blackChord.length; i++){
            if (blackSound[i] != ""){
            Key bk = new Key(blackChord[i], blackSound[i]+ ".wav", "black-key.png", "black-key-down.png");
            addObject(bk, 86 + i * 63, 86);
        }
        }
    }
}