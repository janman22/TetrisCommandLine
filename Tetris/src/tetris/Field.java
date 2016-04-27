
public class Field{
    
    int difficulty = 5;
    
    int fieldHeight = 15;
    int fieldWidth = 20;
    
    public char[][] field = new char[fieldHeight + 6][fieldWidth + 6];
    public Field()
    {
        for (int i = 0; i < field.length; i++){
            for (int a = 0; a < field[i].length; a++){
                if(i == field.length-4){
                   field[i][a] = Stones.FULL; 
                }    
                else{field[i][a] = Stones.EMP;}
            }
        }
    }
    
    public void Update()
    {
        //TODO Steine nach unten bewegen
        //TODO Nach vollen linien gucken
    }
      
    public void Draw()
    {
        System.out.print("\u001b[2J");
        System.out.flush();
        
        for (int iLine = 3; iLine < field.length - 3; iLine++){
            for (int iRow = 3; iRow < field[iLine].length - 3; iRow++){
                    System.out.print(field[iLine][iRow]);
            }
            System.out.println();
        }
        try {
        Thread.sleep(1000/difficulty);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
}
    }
    
    public void clear()
    {
                
        for (int i = 0; i < field.length; i++){
            for (int a = 0; a < field[i].length; a++){
                if(i == field.length-4){
                   field[i][a] = Stones.FULL; 
                }    
                else{field[i][a] = Stones.EMP;}
            }
        }
    }
}
