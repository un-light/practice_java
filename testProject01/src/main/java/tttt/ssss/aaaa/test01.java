package tttt.ssss.aaaa;

public class test01 {
    public static void main(String[] args) {
        //    *
        //   ***
        //  *****
        //   ***
        //    *

        int start = 1;
        int end = 5;
        for (int i = start; i <= end; i = i + 2){
            PrintSpace(i);
            PrintStar(i);
            System.out.println();
        }

        start = 3;
        end = 1;
        for (int i = start; i >= end; i = i - 2){
            PrintSpace(i);
            PrintStar(i);
            System.out.println();
        }
    }

    private static void PrintSpace(int length){
        int space = 3;
        for(int i = 1; i <= space - Math.floor((double) length / 2); i++){
            System.out.print(" ");
        }
    }

    private static void PrintStar(int length){
        for(int i = 1; i <= length ; i++) {
            System.out.print("*");
        }
    }
}
