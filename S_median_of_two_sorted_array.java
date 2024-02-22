public class S_median_of_two_sorted_array {
    // O(n+m) approach
    static float findmedian(int arr1[], int arr2[]) {
        int i = 0, j = 0, k = 0;
        int m[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                m[k] = arr1[i];
                i++;
            } else {
                m[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (j < arr2.length) {
            m[k] = arr2[j];
            j++;
            k++;
        }
        while (i < arr1.length) {
            m[k] = arr1[i];
            i++;
            k++;
        }
        if (m.length % 2 == 0) {
            int mid = m.length / 2;
            return (float) (m[mid] + m[mid - 1]) / 2;
        } else {
            int mid = m.length / 2;
            return m[mid];
        }
    }

    // O(log(min(n, m))) efficient method
    static float findMe(int arr1[], int arr2[]) {
        if (arr2.length < arr1.length) {
            // Swap arrays to ensure arr1 is the smaller one
            return findmedian(arr2, arr1);
        }
        int l = 0, h = arr1.length;
        while (l <= h) {
            int m1 = (l + h) / 2;
            int m2 = (arr1.length + arr2.length + 1) / 2 - m1;
            int l1 = (m1 == 0) ? Integer.MIN_VALUE : arr1[m1 - 1];
            int r1 = (m1 == arr1.length) ? Integer.MAX_VALUE : arr1[m1];
            int l2 = (m2 == 0) ? Integer.MIN_VALUE : arr2[m2 - 1];
            int r2 = (m2 == arr2.length) ? Integer.MAX_VALUE : arr2[m2];
            if (l1 <= r2 && l2 <= r1) {
                if (((arr1.length + arr2.length) % 2) == 0) {
                    // Corrected calculation for even length arrays
                    return (Integer.max(l1, l2) + Integer.min(r1, r2)) / 2.0f;
                } else {
                    // Corrected calculation for odd length arrays
                    return Integer.max(l1, l2);
                }
            } else if (l2 > r1) {
                l = m1 + 1;
            } else {
                h = m1 - 1;
            }
        }
        return 0.0f;
    }


    

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 6, 7, 8, 9, 10 };
        System.out.println(findmedian(arr1, arr2));
        System.out.println(findMe(arr1, arr2));
    }
}
