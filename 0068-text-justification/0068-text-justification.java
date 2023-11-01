
public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder builder = new StringBuilder();
            builder.append(words[index]);

            int diff = last - index - 1;
            if (last == words.length || diff == 0) {
                for (int i = index + 1; i < last; i++) {
                    builder.append(" ");
                    builder.append(words[i]);
                }

                for (int i = builder.length(); i < maxWidth; i++) {
                    builder.append(" ");
                }
            } else {
                int spaces = (maxWidth - totalChars) / diff;
                int r = (maxWidth - totalChars) % diff;

                for (int i = index + 1; i < last; i++) {
                    for(int k=spaces; k > 0; k--) {
                        builder.append(" ");
                    }
                    if(r > 0) {
                        builder.append(" ");
                        r--;
                    }

                    builder.append(" ");
                    builder.append(words[i]);
                }
            }

            result.add(builder.toString());
            index = last;
        }

        return result;
    }
}
