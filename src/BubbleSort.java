public class BubbleSort {
    //Sathvik Y per.2
    public static void main(String[] args)
    {
        System.out.println(bubbleSort("mangoes"));
    }

    public static String bubbleSort(String x) {
        char[] a = x.toCharArray();
        for (int i = 0; i < a.length-1; i++) {
            for (int n = 0; n < a.length-1-i; n++) {
                if (a[n] > a[n+1]) {
                    char o = a[n];
                    a[n] = a[n+1];
                    a[n+1] = o;
                }
            }
        }
        String sortedString = new String(a);
        return sortedString;
    }

}

