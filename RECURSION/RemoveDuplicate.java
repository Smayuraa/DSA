public class RemoveDuplicate {
    public static void RemoveFun(String name, int i, boolean[] map, StringBuilder newname) {
        if (i == name.length()) {
            System.out.println(newname.toString());
            return;
        }
        
        // Get the current character
        char currChar = name.charAt(i);

        if (currChar != ' ' && map[currChar - 'a'] == true) {

            RemoveFun(name, i + 1, map, newname);
        } else {
            if (currChar != ' ') {
                map[currChar - 'a'] = true;
            }
            newname.append(currChar);
            RemoveFun(name, i + 1, map, newname);
        }
    }

    public static void main(String[] args) {
        String name = "Appnnnaaa Schoolll";
        StringBuilder newname = new StringBuilder();
        boolean[] map = new boolean[26]; // To track if a character has been encountered
        
        // Call the function to remove duplicates
        RemoveFun(name.toLowerCase(), 0, map, newname); // Converted to lowercase for simplicity
    }
}
