package DS.Lab3.q8;

public class q8 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);
        for(int[] row: m){
            System.out.printf("(%d, %d) ", row[0], row[1]);
        }
        System.out.println();
    }

    public static void shuffle(int[][] m){
        for(int i = 0; i<m.length; i++){
            int randIndex = (int)(Math.random() * m.length);

            int[] temp = m[i];
            m[i] = m[randIndex];
            m[randIndex] = temp;
        }
    }
}
