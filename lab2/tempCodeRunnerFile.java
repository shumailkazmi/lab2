public class PrintF {
    public static void main(String[] args) {
        int height = 9;
        int width = 14;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == 0 || i == height - 1) || (j == 0 && i <= height / 2)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
