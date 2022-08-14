package Array;

public class IndexCapitalization {

    public static void main(String[] args) {
        String s = "learn by doing";
        int[] indexes = {0, 6, 9, 100};

        String result = indexCapitalization(s, indexes);
        System.out.println(result);
        assert result.equals("Learn By Doing");
    }

    static String indexCapitalization(String s, int[] indexes){
        //convert string to char array
        char[] chars = s.toCharArray();

        for(int i : indexes){
            //checking if the index is smaller than the length of the string
            //if yes, only then proceed
            if(chars.length > i){
                char aChar = chars[i];
                char upperCaseChar = Character.toUpperCase(aChar);
                chars[i] = upperCaseChar;
            }
        }

        //convert char array to string
        return String.valueOf(chars);
    }
}
