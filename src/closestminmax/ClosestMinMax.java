package closestminmax;

import java.util.Scanner;

public class ClosestMinMax {

	public static int closestMinMax(int array[], int size) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int latestMinIndex = -1;
        int latestMaxIndex = -1;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (array[i] == min) {
                latestMinIndex = i;
                if (latestMaxIndex >= 0) {
                    result = Math.min(result, i - latestMaxIndex + 1);
                }
            }
            if (array[i] == max) {
                latestMaxIndex = i;
                if (latestMinIndex >= 0) {
                    result = Math.min(result, i - latestMinIndex + 1);
                }
            }
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int results = closestMinMax(array,n);
        System.out.println(results);
	}

}
