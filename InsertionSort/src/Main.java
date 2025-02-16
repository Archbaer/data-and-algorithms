public class Main {
    public static void main(String[] args) {
        String[] names = {"Augusta", "Ria", "Jodee", "Sophia", "James"};
        insertionSortDescending(names);

        System.out.print("Sorted names in reverse order: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    public static void insertionSortDescending(String[] arr) {
        //TODO: Write the logic to sort the names in descending order

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
