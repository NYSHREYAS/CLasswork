public class Array {
    public Array() {
    }

    public static void main(String[] args) {
        System.out.println();
        new String();
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(test);
        System.out.println(test.length);

        for(int t = test.length; t != 0; --t) {
            System.out.println(test[t - 1]);
        }

    }
}

