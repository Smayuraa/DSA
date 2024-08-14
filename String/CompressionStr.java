// input: aaabbcccdd
//output: a3b2c3d2
package String;

public class CompressionStr {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        StringBuilder newStr = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                newStr.append(str.charAt(i));
                // Append the count if greater than 1
                if (count > 1) {
                    newStr.append(count);
                }
                // Reset the count for the next character
                count = 1;
            }
        }

        System.out.println(newStr.toString());
    }
}
 