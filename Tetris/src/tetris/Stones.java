public class Stones{
    static final char EMP = ' ';
    static final char FULL = '▣';
    
    public int height = 0, width = 0;
    public boolean movable = true;

    public int[] position = new int[2];
    public char[][] form = new char[4][4];
    
    static final char[][] FORMQ = {{FULL,FULL,EMP,EMP},
                             {FULL,FULL,EMP,EMP},
                             {EMP,EMP,EMP,EMP},
                             {EMP,EMP,EMP,EMP}};
    static final char[][] FORML = {{FULL,EMP,EMP,EMP},
                             {FULL,EMP,EMP,EMP},
                             {FULL,FULL,EMP,EMP},
                             {EMP,EMP,EMP,EMP}};
    static final char[][] FORMI = {{FULL,EMP,EMP,EMP},
                             {FULL,EMP,EMP,EMP},
                             {FULL,EMP,EMP,EMP},
                             {FULL,EMP,EMP,EMP}};
    static final char[][] FORMS = {{FULL,EMP,EMP,EMP},
                             {FULL,FULL,EMP,EMP},
                             {EMP,FULL,EMP,EMP},
                             {EMP,EMP,EMP,EMP}};
    static final char[][] FORMZ = {{EMP,FULL,EMP,EMP},
                             {FULL,FULL,EMP,EMP},
                             {FULL,EMP,EMP,EMP},
                             {EMP,EMP,EMP,EMP}};
    static final char[][] FORMD = {{FULL,FULL,FULL,EMP},
                             {EMP,FULL,EMP,EMP},
                             {EMP,EMP,EMP,EMP},
                             {EMP,EMP,EMP,EMP}};
    static final char[][][] ALLFORMS = {FORMQ, FORML, FORMI, FORMS, FORMZ, FORMD};
    
    public static Field FillWithStone(Stones stone, Field field)
    {
        int[] pos = stone.position;
        for(int iLine = 0; iLine < 4; iLine++){ 
            for(int iRow = 0; iRow < 4; iRow++){
                if(field.field[iLine+pos[1]][iRow+pos[0]] == EMP)
                {
                field.field[iLine+pos[1]][iRow+pos[0]] = stone.form[iLine][iRow];
                }
                else if(field.field[iLine+stone.position[1]+1][iRow+stone.position[0]] == FULL)
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
        form = ALLFORMS[chooseForm];
        position[0] = a;
        position[1] = b;
        movable = true;
    }
}
