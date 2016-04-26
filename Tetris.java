public class Tetris{
    public static void main (String[] args){
        
        //--------------------------------------------------- 
        
        Boolean running = true;
                
        Stones quadrat = new Stones(8,0,0);
        
        Field spielfeld = new Field();
        
        
        //---------------------------------------------------
        //Game loop:
        while(running){
            
            for (int i = 0; i < 20; i++){
                    spielfeld.clear();
                    Stones.FillWithStone(quadrat, spielfeld);
                    spielfeld.Draw();
            }

            spielfeld.Update();
            
           running = false; 
        }
        
        
        
        
        
        
        
        
        
        
        //---------------------------------------------------
        
        
    }
}