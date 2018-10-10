public class GridGenerator {
    Integer[][] GRID = new Integer[9][9];
    static int MAX = 9;
    static int MIN = 1;
    static int range = MAX - MIN + 1;



    for (int i = 0; i < MAX; i++) {
        for (int j = 0; j < MAX; j++) {

            if(!(GRID[i][j] == 0)) {
                GRID[i][j] = (int) (Math.random() * range) + MIN;
            }
        }
    }


}
