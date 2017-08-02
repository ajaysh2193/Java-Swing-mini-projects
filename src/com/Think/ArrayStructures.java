package com.Think;

public class ArrayStructures {

	private int[] theArray = new int[50]; // Creates an array with 50 indexes

	private int arraySize = 10; // Elements in theArray

	// Fills the Array with random values

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			// Random number 10 through 19

			theArray[i] = (int) (Math.random() * 10) + 10;

		}

	}

	public int[] getTheArray() {

		return theArray;

	}

	public int getArraySize() {

		return arraySize;

	}

	// Prints the Array on the screen in a grid

	public void printArray() {

		System.out.println("----------");

		for (int i = 0; i < arraySize; i++) {

			System.out.print("| " + i + " | ");

			System.out.println(theArray[i] + " |");

			System.out.println("----------");

		}

	}

	// Gets value at provided index

	public int getValueAtIndex(int index) {

		if (index < arraySize)
			return theArray[index];

		return 0;

	}

	// Returns true or false if a value is in the Array

	public boolean doesArrayContainThisValue(int searchValue) {

		boolean valueInArray = false;

		for (int i = 0; i < arraySize; i++) {

			if (theArray[i] == searchValue) {

				valueInArray = true;

			}

		}

		return valueInArray;

	}

	// Delete Array row for the index and move elements up

	public void deleteIndex(int index) {

		if (index < arraySize) {

			// Overwrite the value for the supplied index
			// and then keep overwriting every index that follows
			// until you get to the last index in the array

			for (int i = index; i < (arraySize - 1); i++) {

				theArray[i] = theArray[i + 1];

			}

			arraySize--;

		}

	}

	public void insertValue(int value) {

		if (arraySize < 50) {

			theArray[arraySize] = value;

			arraySize++;

		}

	}

	// Linear Search : Every index must be looked at

	public String linearSearchForValue(int value) {

		boolean valueInArray = false;

		String indexsWithValue = "";

		System.out.print("The Value was Found in the Following Indexes: ");

		for (int i = 0; i < arraySize; i++) {

			if (theArray[i] == value) {
				valueInArray = true;

				System.out.print(i + " ");

				indexsWithValue += i + " ";
			}

		}

		if (!valueInArray) {
			indexsWithValue = "None";

			System.out.print(indexsWithValue);
		}

		System.out.println();

		return indexsWithValue;

	}

	// This bubble sort will sort everything from
	// smallest to largest

	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];

		theArray[indexOne] = theArray[indexTwo];

		theArray[indexTwo] = temp;

	}

	public void bubbleSort() {

		// i starts at the end of the Array
		// As it is decremented all indexes greater
		// then it are sorted

		for (int i = arraySize - 1; i > 1; i--) {

			// The inner loop starts at the beginning of
			// the array and compares each value next to each
			// other. If the value is greater then they are
			// swapped

			for (int j = 0; j < i; j++) {

				if (theArray[j] > theArray[j + 1]) {

					swapValues(j, j + 1);

				}

			}

		}

	}

	public static void main(String[] args) {

		ArrayStructures newArray = new ArrayStructures();

		newArray.generateRandomArray();

		newArray.printArray();

		System.out.println(newArray.getValueAtIndex(3));

		System.out.println(newArray.doesArrayContainThisValue(18));

		newArray.deleteIndex(4);

		newArray.printArray();

		newArray.insertValue(55);

		newArray.printArray();

		newArray.linearSearchForValue(17);
	}

}
