public class Main {

    public static void main(String[] args) {
        char[][] star = new char[15][15];
        char[][] temp = new char[15][15];


        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == j || i == 7 || j == 7 || i + j == 14) {
                    star[i][j] = 'X';
                }

                else {
                    star[i][j] = ' ';
                }

                if (
                        (i == 2 && (j == 0 || j == 1))
                    || (i==5 && j == 0 )
                    || (i==6 && j == 1 )
                    || (i==8 && j == 1 )
                    || (i==9 && j == 0 )
                    || (i== 12 &&  (j == 0 || j == 1))
                    || (i== 13 &&  (j == 2 || j == 6|| j == 8|| j == 12))
                    || (i== 14 &&  (j == 2 || j == 5|| j == 9|| j == 12)) )
                {
                    star[i][j] = 'X';
                    star[j][i] = 'X';

                }


            }


        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(" "+star[i][j]);
            }
            System.out.println();
        }
    }
}
