package DaaPracTanisha;

public class DecimalDominant {

public static void findDecimalDominant(int[] arr) {
    int n = arr.length;
    int count = 1;
    int candidate = arr[0];

    for (int i = 1; i < n; i++) {
        if (arr[i] == candidate) {
            count++;
        } else {
            count--;
        }
        if (count == 0) {
            candidate = arr[i];
            count = 1;
        }
    }
    count = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] == candidate) {
            count++;
        }
    }
    if (count > n / 10) {
        System.out.println("Decimal dominant element is: " + candidate);
    } else {
        System.out.println("No decimal dominant element found.");
    }
}
public static void main(String[] args) {
    int[] arr = {3, 1, 3, 3, 3, 2, 3, 3, 2};
    findDecimalDominant(arr);
}
}





