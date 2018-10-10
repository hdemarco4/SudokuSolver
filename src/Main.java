

public class Main {
    Integer[][] GRID = new Integer[9][9];
    static int MAX = 9;
    static int MIN = 1;
    static int range = MAX - MIN + 1;


    public static void main(String[] args) {



        gridGenerator();
        newCheck();
        System.out.print(GRID);

    }


    public void gridGenerator() {

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {

                if(!(GRID[i][j] == 0)) {
                    GRID[i][j] = (int) (Math.random() * range) + MIN;
                }
            }
        }
    }



    public void newCheck() {

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {

                int num = GRID[i][j];

                if(inRow(num, i) || inColumn(num, j) ||inSquare(num, i, j)) {
                    GRID[i][j] = (int) (Math.random() * range) + MIN;
                    newCheck();
                }

            }
        }


    }

    public boolean inRow(int num, int row){
        boolean inr = false;

        for (int k = 0; k < MAX; k++){

            if(GRID[row][k] == num){
                inr = true;
            }
        }
        return inr;
    }

    public boolean inColumn(int num, int column){
        boolean inc = false;

        for (int k = 0; k < MAX; k++){

            if(GRID[k][column] == num){
                inc = true;
            }
        }
        return inc;
    }

    public boolean inSquare(int num, int r, int c){
        boolean ins = false;
        int row;
        int column;

        if(r >= 6){
            row = 9;
        } else if(r >= 3){
            row = 6;
        } else {
            row = 3;
        }

        if(c >= 6){
            column = 9;
        } else if(c >= 3){
            column = 6;
        } else {
            column = 3;
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if(GRID[i][j] == num && !(i == r) &&!(j == c)){
                    ins = true;
                }
            }
        }
        return ins;
    }


}