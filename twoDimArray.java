public class twoDimArray {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,4,5},{8,12,45,11},{14,21,22,28}};
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(mat1[i][j]+",");
        //     }
        //     System.out.println();
        // }
        // Using foreach
        for (int[] ia : mat1) {
            for (int is : ia) {
                System.out.print(is+",");
            }
            System.out.println();
        }
    }
}
