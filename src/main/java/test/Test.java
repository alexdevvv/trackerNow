package test;

public class Test {
    public static int[][] rows(int count) {
        int value = 1;
        int[][] triangle = new int[count][count];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < value; j++) {
                triangle[i][j] = value;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(rows(3));
    }
}


//[1]
//[2 3]
//[4 5 6]
