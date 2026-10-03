public class RemoveDuplicate_String {

    public static void removeDuplicate(String str, StringBuffer sb,
                                        int index, boolean map[]) {

        if (str.length() == index) {
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(index);

        if (map[currChar - 'a'] == true) {
            // Duplicate
            removeDuplicate(str, sb, index + 1, map);

        } else {
            map[currChar - 'a'] = true;

            removeDuplicate(str, sb.append(currChar), index + 1, map);
        }
    }

    public static void main(String args[]) {

        String str = "applebanana";

        boolean map[] = new boolean[26];

        StringBuffer sb = new StringBuffer();

        removeDuplicate(str, sb, 0, map);
    }
}