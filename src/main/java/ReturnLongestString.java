
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int finalstr = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int str1 = arr[i].length();
            int str2 = arr[i+1].length();
            if (str2 > str1) {
                finalstr = i + 1;
            }
        }
        return arr[finalstr];
    }
}
