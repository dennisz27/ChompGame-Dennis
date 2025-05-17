import java.sql.SQLOutput;

public class Board {

    public static void main(String[] args) {
        Board mycode=new Board();
    }

    public Board () {
//        for(int i =1; i< 4; i++){
//            for(int j =0; j <= i; j++) {
//                for(int k=0; k <= j; k++) {
//                    System.out.println(i + "" + j + k);
//                }
//            }
//        }

        oneMove(3,3,3);
    }

    public void oneMove(int a, int b, int c) {
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j <= b && j <= i; j++) {
                for (int k = 0; k <= c && k <= j; k++) {
                    System.out.println(i + "" + j + k);

                    if (i == 1) {
                        if (j == 0) {
                            System.out.println("you lose");
                        } else if (j == 1) {
                            System.out.println("you win -- move (2,1)");
                        }
                    }

                    if (i == 2) {
                        if(j == 0) {
                            System.out.println("you win -- move (1,2)");
                        } else if(j == 1 && k == 0){
                            System.out.println("you lose");
                        } else if(j == 1 && k == 1) {
                            System.out.println("you win -- move (3,1)");
                        } else if (j == 2 && k == 0) {
                            System.out.println("you win -- move (2,2)");
                        } else if (j == 2 && k == 1) {
                            System.out.println("you lose");
                        } else {
                            System.out.println("you win -- move (3,2)");
                        }
                    }

                    if(i == 3) {
                        if(j == 0) {
                            System.out.println("you win -- move (1, 2)");
                        } else if(j == 1 && k == 0){
                            System.out.println("you win -- move (1, 3)");
                        } else if(j == 1 && k == 1) {
                            System.out.println("you lose");
                        } else if (j == 2 && k == 0) {
                            System.out.println("you lose");
                        } else if (j >= 2 && k >= 1) {
                            System.out.println("you win -- move (2,2)");
                        } else if (j == 3 && k == 0) {
                            System.out.println("you win -- move (2,3)");
                        }
                    }

                }
            }
        }
    }
    }

