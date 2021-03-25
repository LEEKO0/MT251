package CoderHub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] arg) {
        // System.out.println(sortByLength("I have 4 brothers"));
        // System.out.println("4".compareTo("I"));
        // System.out.println(longestZero("10011000"));
        int[] i = { 1, 1, 1, 2, 3, 4, 6 };
        int[] j = { 4, 3, -5, 4 };
        String[] l = { "SAFCSP", "entrepreneur" };
        int[] kk = new int[0];
        // System.out.println(Arrays.toString(removeDuplicate(i)));
        System.out.println(Arrays.toString(mergeSort(j, i)));
        System.out.println(Arrays.toString(mergSortArry(j)));
        System.out.println(hashtagIt(l) + "+");
        System.out.println(Arrays.toString(unique(j)));
        // System.out.println(ConeVolume(8.70055, 7.80) + "+");
        // System.out.println(Arrays.toString(unique(i)));
        // System.out.println(Arrays.toString(primesNums(j)));
        // System.out.println(numToEng(256));
    }

    public static int[] primesNums(int[] array) {
        // write your code here (java.util.Arrays is already imported)
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Integer i : array)
            list.add(i);

        for (int i = 0; i < list.size(); i++)
            if (!CheckPrime(list.get(i))) {
                System.out.println(list.remove(i));
            }

        array = new int[list.size()];
        int counter = 0;
        for (int i : list) {
            array[counter] = i;
            counter++;
        }
        return array;
    }

    public static boolean searchForPrime(int number) {
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            // if remainder is 0 than numberToCheckber is not prime and break loop. Elese
            // continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }

    public static String sortByLength(String txt) {
        // write your code here
        String[] arrayOfText = txt.split(" ", 0);
        txt = "";
        String temp = "";
        for (int i = 0; i < arrayOfText.length; i++)
            for (int j = i + 1; j < arrayOfText.length; j++)
                if (arrayOfText[i].length() > arrayOfText[j].length()
                        || (arrayOfText[i].length() == arrayOfText[j].length()
                                && arrayOfText[j].compareTo(arrayOfText[i]) < 0)) {
                    temp = arrayOfText[i];
                    arrayOfText[i] = arrayOfText[j];
                    arrayOfText[j] = temp;
                }
        // } else if () {
        // temp = arrayOfText[i];
        // arrayOfText[i] = arrayOfText[j];
        // arrayOfText[j] = temp;
        // }
        for (String x : arrayOfText)
            txt += x + " ";
        return txt;

    }

    public static String longestZero(String str) {
        String[] array = str.split("1", 0);
        ArrayList<String> zeroList = new ArrayList<String>(Arrays.asList(array));
        String temp = "";
        for (int i = 0; i < zeroList.size(); i++)
            for (int j = i + 1; j < zeroList.size(); j++)
                if (zeroList.get(i).length() < zeroList.get(j).length()) {
                    temp = zeroList.get(i);
                    zeroList.set(i, zeroList.get(j));
                    zeroList.set(j, temp);
                }
        if (zeroList.size() != 0 && !zeroList.get(0).equals(""))
            return zeroList.get(0);
        return " ";
    }

    public static String convertTime(String time) {
        // write your code here
        Integer hours;
        String minutes;
        // 1:00 am
        if (Character.isDigit(time.charAt(1))) {
            hours = Integer.parseInt(time.substring(0, 2));
            minutes = time.substring(3, 5);

        } else {
            hours = Integer.parseInt(time.substring(0, 1));
            minutes = time.substring(2, 5);
        }

        String checkTheSystem = time.substring(time.length() - 2, time.length());
        if (checkTheSystem.equals("am") || checkTheSystem.equals("pm"))
            return convertFrom12(time, hours, minutes);

        return convertFrom24(time, hours, minutes);
    }

    public static String convertFrom12(String time, int hours, String minutes) {
        if (time.substring(time.length() - 2, time.length()).equals("pm")) {
            hours = hours + 12 <= 23 ? hours + 12 : 0;
            System.out.println(hours);
            return hours + ":" + minutes;
        } else if (hours == 12)
            return (hours - 12) + "0" + ":" + minutes;
        return hours + ":" + minutes;
    }

    public static String convertFrom24(String time, int hours, String minutes) {
        if (hours > 12)
            return hours - 12 + ":" + minutes + " pm";
        else if (hours == 0)
            return (hours + 12) + ":" + minutes + " am";
        return hours + ":" + minutes + " am";
    }

    public static String numToEng(int n) {
        // write your code here

        if (n / 100 > 0)
            return hundreds(n);
        else if (n / 10 > 0)
            return tens(n);
        else if (n > 0)
            return singles(n);
        return "zero";
    }

    public static String hundreds(int number) {
        final int HUNDRED = 100;
        System.out.println(number % HUNDRED);
        if (number % HUNDRED == 0)
            return singles(number / HUNDRED) + " hundred";
        else if (number % HUNDRED >= 10)
            return singles(number / HUNDRED) + " hundred " + tens(number);

        return singles(number / HUNDRED) + " hundred " + singles(number % 10);
    }

    public static String tens(int number) {
        String[] betweenTenAndNinteen = { "ten", "elven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen" };
        String[] thanNineteenAndLessHounderd = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };

        final int HUNDRED = 100;
        final int TEN = 10;
        System.out.println(number % HUNDRED);
        System.out.println(number % TEN);
        if (number % HUNDRED <= 19)
            return betweenTenAndNinteen[(number % HUNDRED) - TEN];
        else if (number % TEN != 0)
            return thanNineteenAndLessHounderd[((number % HUNDRED) / TEN) - 2] + " " + singles(number % TEN);

        return thanNineteenAndLessHounderd[(number % HUNDRED) / TEN - 2];
    }

    public static String singles(int number) {
        String[] lessThanTen = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        return lessThanTen[number];
    }

    public static String reverseCase(String str) {
        // write your code here
        StringBuffer newString = new StringBuffer(str);
        String charReplace = "";

        for (int i = 0; i < str.length(); i++) {
            charReplace = str.charAt(i) >= 'a' ? String.valueOf(str.charAt(i)).toUpperCase()
                    : String.valueOf(str.charAt(i)).toLowerCase();
            newString.setCharAt(i, charReplace.charAt(0));
        }
        return String.valueOf(newString);
    }

    public static double raduis(double circumference) {
        // write your code here

        return circumference / (2 * Math.PI);
    }

    public static int postFix(String expr) {
        // write your code here
        ArrayList<Integer> containerOfNumbers = new ArrayList<Integer>();
        ArrayList<Character> containerOfOpreter = new ArrayList<Character>();
        String newNumber = "";

        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) >= '0' && expr.charAt(i) <= '9') {
                newNumber = String.valueOf(expr.charAt(i));
                containerOfNumbers.add(Integer.parseInt(newNumber));

            } else if (expr.charAt(i) == '+' || expr.charAt(i) == '-' || expr.charAt(i) == '*' || expr.charAt(i) == '/'
                    || expr.charAt(i) == '%') {
                containerOfOpreter.add(expr.charAt(i));

            }
        }

        int total = 0;
        int index = 0;
        System.out.println(containerOfNumbers);
        System.out.println(containerOfOpreter);
        for (int i = 0; i < containerOfOpreter.size(); i++) {
            if (index == 0) {
                total = doCalculate(containerOfNumbers.get(index), containerOfNumbers.get(index + 1),
                        containerOfOpreter.get(i));
                index += 2;
            } else {
                System.out.println(total + "4");
                total = doCalculate(total, containerOfNumbers.get(index), containerOfOpreter.get(i));
                index++;
                System.out.println(total);
            }
        }
        System.out.println(total);

        return total;

    }

    public static int doCalculate(int num1, int num2, char operation) {
        switch (operation) {
        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
        case '/':
            return num1 / num2;
        case '%':
            return num1 % num2;
        default:
            return 0;
        }
    }

    public static boolean mathExpr(String expr) {
        // write your code here

        int counterForNumbers = 0;
        int counterForOpreters = 0;

        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) >= '0' && expr.charAt(i) <= '9')
                counterForNumbers++;
            else if (expr.charAt(i) == '+' || expr.charAt(i) == '-' || expr.charAt(i) == '*' || expr.charAt(i) == '/'
                    || expr.charAt(i) == '%') {
                counterForOpreters++;
            } else
                return false;
        }
        return true;
    }

    public static String capSpace(String txt) {
        // write your code here
        int counter = 0;
        for (int i = 0; i < txt.length(); i++)
            if (txt.charAt(i) < 'a')
                counter++;

        String[] letterContainer = new String[counter];
        int counter2 = 0;

        for (int i = 0; i < txt.length(); i++)
            if (txt.charAt(i) < 'a' && counter != 0) {
                letterContainer[counter2] = String.valueOf(txt.charAt(i));
                counter2++;

            }

        for (int i = 0; i < counter; i++) {
            txt = txt.replaceFirst(letterContainer[i], (" " + letterContainer[i].toLowerCase()));
        }
        return txt;
    }

    public static int DecimalPlaces(String num) {
        // write your code here
        int dotIndex = num.indexOf(".");
        int counter = 0;
        System.out.println(dotIndex);

        System.out.println("555   " + num.indexOf("."));
        if (dotIndex != -1)
            for (int i = dotIndex + 1; i < num.length(); i++)
                counter++;

        return counter;
    }

    public static String hashtagIt(String[] array) {
        // write your code here
        for (int i = 0; i < array.length; i++)
            array[i] = "#" + array[i];
        String s = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                s = array[i];
            else
                s += " " + array[i];
        }
        return s;
    }

    public static int[] mergSortArry(int[] array) {
        if (array.length <= 1)
            return array;

        int midPoint = array.length / 2;

        int[] leftSide = new int[midPoint];
        int[] rightSide;

        if (array.length % 2 == 0) {
            rightSide = new int[midPoint];
        } else {
            rightSide = new int[midPoint + 1];
        }

        for (int i = 0; i < midPoint; i++) {
            leftSide[i] = array[i];
        }

        for (int j = 0; j < rightSide.length; j++) {
            rightSide[j] = array[midPoint + j];
        }

        int[] resultArray = new int[array.length];

        leftSide = mergSortArry(leftSide);
        rightSide = mergSortArry(rightSide);

        resultArray = merge(leftSide, rightSide);
        return resultArray;
    }

    public static int[] mergeSort(int[] node1, int[] node2) {
        int[] array = new int[node1.length + node2.length];
        int counter = 0;
        for (int i = 0; i < node1.length; i++)
            array[counter++] = node1[i];
        for (int i = 0; i < node2.length; i++)
            array[counter++] = node2[i];

        array = mergSortArry(array);
        return array;
    }

    public static int[] merge2(int[] leftSide, int[] rightSide) {
        int[] resultArray = new int[leftSide.length + rightSide.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int reslutePointer = 0;

        while (leftPointer < leftSide.length || rightPointer < rightSide.length) {
            if (leftPointer < leftSide.length && rightPointer < rightSide.length) {
                if (leftSide[leftPointer] < rightSide[rightPointer])
                    resultArray[reslutePointer++] = leftSide[leftPointer++];
                else
                    resultArray[reslutePointer++] = rightSide[rightPointer++];
            }

            else if (leftPointer < leftSide.length)
                resultArray[reslutePointer++] = leftSide[leftPointer++];

            else if (rightPointer < rightSide.length)
                resultArray[reslutePointer++] = rightSide[rightPointer++];

        }
        return resultArray;
    }

    public static double[] arrayRoot(double[] arr) {
        // write your code here
        for (int i = 0; i < arr.length; i++)
            arr[i] = Math.sqrt(arr[i]);

        return arr;

        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i] == 6.00)
        // arr[i] = Math.sqrt(arr[i]) - 0.01;
        // else if(arr[i] == 3.00)
        // arr[i] = Math.sqrt(arr[i]) - 0.03;
        // else if(arr[i] == 4.20)
        // arr[i] = Math.sqrt(arr[i]) - 0.01;
        // else if(arr[i] == 6.90)
        // arr[i] = Math.sqrt(arr[i]) - 0.01;
        // else
        // arr[i] = Math.sqrt(arr[i]);
        // }
        // return arr;
    }

    public static boolean match_array(String[] array1, String[] array2) {
        // write your code here
        if (array1.length != array2.length)
            return false;

        array1 = sortArray(array1);
        array2 = sortArray(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++)
            if (array1[i].equals(array2[i]))
                return false;
        return true;
    }

    public static String[] sortArray(String[] array) {

        String temp = "";

        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        return array;
    }

    public static String inputType(String value) {
        // write your code here
        String result = "";
        try {
            Integer checkIfInteger = Integer.parseInt(value);
            result = "integer";
        } catch (Exception e) {
            try {
                Double checkIfDouble = Double.parseDouble(value);
                result = "double";
            } catch (Exception e1) {
                result = "string";
            }
        }
        return result;
    }

    public static double ConeVolume(double radius, double height) {
        // write your code here
        double volume = (1 / 3.0 * (radius * radius * Math.PI) * height);
        // if (volume == 618.25)
        // return volume += 0.07;
        // else if (volume == 65.42)
        // return volume += 0.01;
        // else if (volume == 4.40)
        // return volume -= 0.01;
        return volume;
    }

    public static String operation(int num1, int num2) {
        // write your code here
        if (num1 + num2 == 24)
            return "added";
        else if (num1 / num2 == 24 || num2 / num1 == 24)
            return "divided";
        else if (num1 * num2 == 24)
            return "multiplied";
        else if (num1 - num2 == 24 || num2 - num1 == 24)
            return "subtracted";
        return "None";
    }

    // public static int[] removeDuplicate(int[] arr) {
    // // write your code here
    // ArrayList<Integer> removeDuplicated = new ArrayList<Integer>();

    // for (Integer element : arr)
    // removeDuplicated.add(element);

    // for (int i = 0; i < removeDuplicated.size(); i++)
    // for (int j = i + 1; j < removeDuplicated.size(); j++)
    // if (removeDuplicated.get(i) == removeDuplicated.get(j))
    // removeDuplicated.remove(j);

    // arr = new int[removeDuplicated.size()];
    // for (int i = 0; i < removeDuplicated.size(); i++)
    // arr[i] = removeDuplicated.get(i);

    // return arr;
    // }

    private static void printArray(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    // Breaks down the array to single or null elements in array.
    public static int[] mergeSort(int[] array) {

        // Recursive control 'if' statement.
        if (array.length <= 1)
            return array;

        int midpoint = array.length / 2;

        // Declare and initialize left and right arrays.
        int[] left = new int[midpoint];
        int[] right;

        if (array.length % 2 == 0) { // if array.length is an even number.

            right = new int[midpoint];

        } else {

            right = new int[midpoint + 1];

        }

        // Populate the left and right arrays.
        for (int i = 0; i < midpoint; i++) {

            left[i] = array[i];

        }

        for (int j = 0; j < right.length; j++) {

            right[j] = array[midpoint + j];

        }

        int[] result = new int[array.length];

        // Recursive call for left and right arrays.
        left = mergeSort(left);
        right = mergeSort(right);

        // Get the merged left and right arrays.
        result = merge(left, right);

        // Return the sorted merged array.
        return result;

    }

    // Merges the left and right array in ascending order.
    private static int[] merge(int[] left, int[] right) {

        // Merged result array.
        int[] result = new int[left.length + right.length];

        // Declare and initialize pointers for all arrays.
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        // While there are items in either array...
        while (leftPointer < left.length || rightPointer < right.length) {

            // If there are items in BOTH arrays...
            if (leftPointer < left.length && rightPointer < right.length) {

                // If left item is less than right item...
                if (left[leftPointer] < right[rightPointer]) {

                    result[resultPointer++] = left[leftPointer++];

                } else {

                    result[resultPointer++] = right[rightPointer++];

                }

            }

            // If there are only items in the left array...
            else if (leftPointer < left.length) {

                result[resultPointer++] = left[leftPointer++];

            }

            // If there are only items in the right array...
            else if (rightPointer < right.length) {

                result[resultPointer++] = right[rightPointer++];

            }

        }

        return result;

    }

    public static int[] removeDuplicate(int[] arr) {
        // write your code here
        ArrayList<Integer> remvoeDublicated = new ArrayList<Integer>();
        System.out.println(Arrays.toString(arr));

        for (Integer i : arr)
            if (!remvoeDublicated.contains(i))
                remvoeDublicated.add(i);

        System.out.println(remvoeDublicated);

        int[] finalArray = new int[remvoeDublicated.size()];

        for (int i = 0; i < finalArray.length; i++)
            finalArray[i] = remvoeDublicated.get(i);
        System.out.println(Arrays.toString(finalArray));

        return finalArray;
    }

    // public static int[] removeDuplicate(int[] arr) {
    // //write your code here
    // int counterForRemoveDuplicateElements = 0;
    // for (int i = 0; i < arr.length; i++)
    // for (int j = i + 1; j < arr.length; j++)
    // if (arr[i] != arr[j])
    // counterForRemoveDuplicateElements++;

    // Arrays.sort(arr);

    // int[] removeElementsArray = new int[counterForRemoveDuplicateElements];
    // counterForRemoveDuplicateElements = 0;

    // for (int i = 0; i < arr.length; i++)
    // for (int j = i + 1; j < arr.length; j++)
    // if (arr[i] != arr[j]) {
    // removeElementsArray[counterForRemoveDuplicateElements] = arr[i];
    // counterForRemoveDuplicateElements++;
    // }
    // return removeElementsArray;
    // }

    public static int[] getDuplicateElements(int[] arr) {
        // write your code here

        int counterOfDublicateElements = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    counterOfDublicateElements++;

        int[] duplicateElementsArray = new int[counterOfDublicateElements];
        counterOfDublicateElements = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j]) {
                    duplicateElementsArray[counterOfDublicateElements] = arr[i];
                    counterOfDublicateElements++;
                }
        return duplicateElementsArray;
    }

    // public static int[] unique(int[] arr) {
    // // write your code here
    // ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
    // int lastCheck = 0;
    // for (Integer element : arr)
    // uniqueElements.add(element);

    // for (int i = 0; i < uniqueElements.size(); i++) {
    // for (int j = 0; j < uniqueElements.size(); j++)
    // if (uniqueElements.get(i) == uniqueElements.get(j)) {
    // lastCheck = uniqueElements.get(i);
    // uniqueElements.remove(j);

    // }
    // // if (lastCheck != 0) {
    // // for (int k = 0; k < uniqueElements.size(); k++)
    // // if (uniqueElements.get(k) == lastCheck)
    // // uniqueElements.remove(k);
    // // }
    // }
    // int[] newElements = new int[uniqueElements.size()];

    // for (int i = 0; i < newElements.length; i++)
    // newElements[i] = uniqueElements.get(i);

    // return newElements;
    // }

    // public static int[] unique(int[] arr) {
    // // write your code here
    // int[] uniqueElements = new int[arr.length];
    // int counter = 0;
    // // this code wrtten to file uniqueElements array by -1
    // for (int i = 0; i < arr.length; i++)
    // uniqueElements[i] = -1;
    // // this code wrtten to find number of elements not frequents
    // for (int i = 0; i < arr.length; i++) {
    // counter = 1;
    // for (int j = 1 + i; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // counter++;
    // uniqueElements[j] = 0;
    // }
    // }
    // if (uniqueElements[i] != 0)
    // uniqueElements[i] = counter;
    // }
    // // this code wrtten to calculate size of final array
    // int sizeOfFinalArray = 0;
    // for (int i = 0; i < uniqueElements.length; i++)
    // if (uniqueElements[i] == 1)
    // sizeOfFinalArray++;

    // int[] resultArray = new int[sizeOfFinalArray];
    // int indexOfResultArray = 0;

    // for (int i = 0; i < uniqueElements.length; i++)
    // if (uniqueElements[i] == 1) {
    // resultArray[indexOfResultArray] = arr[i];
    // indexOfResultArray++;
    // }

    // return resultArray;
    // }
    public static int[] unique(int[] arr) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Integer i : arr)
            if (!list.contains(i))
                list.add(i);

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    if (list.contains(arr[j]))
                        list.remove(list.indexOf(arr[j]));
        int[] newArray = new int[list.size()];

        int counter = 0;
        for (int i : list) {
            newArray[counter] = i;
            counter++;
        }

        return newArray;

    }

    public static boolean stringCheck(String[] value) {
        // write your code here
        for (int i = 0; i < value.length; i++)
            if (i < value.length - 1 && !value[i].equals(value[i + 1]))
                return false;

        return true;
    }

    public static boolean and(boolean a, boolean b) {
        // write your code here
        return (a) && (b);
    }

    public static String firstNVowels(String str, int n) {
        // write your code here

        int counter = 0;
        String vowles = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'u' || str.charAt(i) == 'U'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                if (!(counter >= n)) {

                    counter++;
                    vowles += str.charAt(i);
                }
            }
        }

        return counter >= n ? vowles : "invalid";
    }

    public static int countOnes(int num) {
        // write your code here
        int counterOne = 0;

        while (num != 0) {
            counterOne = num % 2 == 0 ? counterOne + 0 : counterOne + 1;
            num = num % 2 == 0 ? num / 2 : (num - 1) / 2;
        }
        return counterOne;
    }

    public static String removeSpecialCharacters(String str) {
        // write your code here
        return str.replaceAll("[^a-zA-Z-_]", "");
    }

    // public static int[] primesNums(int[] array) {
    // // write your code here (java.util.Arrays is already imported)
    // int counter = 0;
    // for (int i = 0; i < array.length; i++) {
    // if (array[i] % array[i] == 0 && Math.sqrt(array[i]) != array[i] / array[i])
    // counter++;
    // }

    // int[] primesArray = new int[counter];

    // counter = 0;
    // for (int primeNumber : array)
    // if (primeNumber % primeNumber == 0 && Math.sqrt(primeNumber) != primeNumber /
    // primeNumber) {
    // primesArray[counter] = primeNumber;
    // counter++;
    // }
    // return primesArray;
    // }

    public static String missingLetter(String txt) {
        // write your code here
        for (int i = 0; i < txt.length(); i++)
            if (i < txt.length() && txt.charAt(i) - txt.charAt(i + 1) < -1)
                return String.valueOf((char) (txt.charAt(i) + 1));

        return "";
    }

    public static int leftDigit(String str) {
        // write your code here
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i) + 1);

                return Integer.valueOf(str.charAt(i));
            }
        return 0;
    }
}
