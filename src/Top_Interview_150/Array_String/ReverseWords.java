package Top_Interview_150.Array_String;

public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length() - 1;
        int maxIndex = len;

        for (int i = len ; i >= 0 ; i--)
        {
            if (s.charAt(i) != ' ')
            {
                maxIndex = i;
                break;
            }
        }

        for (int i = maxIndex ; i >= 0 ; i--)
        {
            if (i == 0 && s.charAt(0) != ' ' || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')
            {
                sb.append(s.substring(i,maxIndex + 1));
            }

            else if (i > 0 && s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
            {
                sb.append(' ');
                maxIndex = i - 1;
            }
        }

        return sb.toString();
    }
}
