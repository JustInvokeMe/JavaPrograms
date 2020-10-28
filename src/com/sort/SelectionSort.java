package com.sort;

public class SelectionSort
{
    void selectionSort(int[] arr)
    {
        int len = arr.length;

        for (int i = 0; i < len-1; i++)
        {
            // Finding the minimum element in the unsorted part of array.

            int min = i;

            for (int j = i+1; j <len; j++)
            {
                if (arr[j] < arr[min])

                    min= j;
            }

            /* Swapping the found minimum element with the first
             * element of the sorted subarray using temp variable.
             */

            int temp= arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Displays the array elements.

    void printArr(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        SelectionSort obj = new SelectionSort();

        int[] numarr =  {101,5,18,11,80,67};

        System.out.print("Original array: ");

                obj.printArr(numarr);

        // Calling method for selection sorting.

        obj.selectionSort(numarr);

        System.out.print("Sorted array: ");

        obj.printArr(numarr);
    }
}
