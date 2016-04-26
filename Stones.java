public class Stones{
    static char emp = ' ';
    static char full = '▣';
    
    public int height = 0, width = 0;
    public boolean movable = true;

    public int[] position = new int[2];
    public char[][] form = new char[4][4];
    
    static char[][] formQ = {{full,full,emp,emp},
                             {full,full,emp,emp},
                             {emp,emp,emp,emp},
                             {emp,emp,emp,emp}};
    static char[][] formL = {{full,emp,emp,emp},
                             {full,emp,emp,emp},
                             {full,full,emp,emp},
                             {emp,emp,emp,emp}};
    static char[][] formI = {{full,emp,emp,emp},
                             {full,emp,emp,emp},
                             {full,emp,emp,emp},
                             {full,emp,emp,emp}};
    static char[][] formS = {{full,emp,emp,emp},
                             {full,full,emp,emp},
                             {emp,full,emp,emp},
                             {emp,emp,emp,emp}};
    static char[][] formZ = {{emp,full,emp,emp},
                             {full,full,emp,emp},
                             {full,emp,emp,emp},
                             {emp,emp,emp,emp}};
    static char[][] formD = {{full,full,full,emp},
                             {emp,full,emp,emp},
                             {emp,emp,emp,emp},
                             {emp,emp,emp,emp}};
    static char[][][] forms = {formQ, formL, formI, formS, formZ, formD};
    
    public static Field FillWithStone(Stones stone, Field field)
    {
        for(int iLine = 0; iLine < 4; iLine++){ 
            for(int iRow = 0; iRow < 4; iRow++){
                if(field.field[iLine+stone.position[1]][iRow+stone.position[0]] == emp)
                {
                field.field[iLine+stone.position[1]][iRow+stone.position[0]] = stone.form[iLine][iRow];
                }
                else if(field.field[iLine+stone.position[1]+1][iRow+stone.position[0]] == full)
                {
                    stone.movable = false;
                }
                
            }
        }
        stone.position[1]++;
        return field;
    }
    public Stones(int a, int b, int chooseForm) {
        height = a;
        width = b;
        form = forms[chooseForm];
        position[0] = a;
        position[1] = b;
        movable = true;
    }
}