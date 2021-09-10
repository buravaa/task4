package main.task4;

public class Solution4 {
	public static void main(String[] args) {
		int[] numbers = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}
		System.out.println(test(numbers));
	}
	
	public static int test(int[] numbers) {
		int count = 0;
		int distinction = getMax(numbers) - getMin(numbers);
		for (int number : numbers) {
			if (number < distinction) {
				count += distinction - number;
			}
			if (number > distinction) {
				count += number - distinction;
			}
		}
		return count;
	}
	
	public static int getMax(int[] numbers) {
		int maxValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}
	
	public static int getMin(int[] numbers) {
		int minValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
}
