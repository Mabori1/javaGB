public class Dz1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //--------1----------------------------------------------------------------------------
    public String mergeAlternately(String word1, String word2) {
        StringBuilder w1 = new StringBuilder(word1);
        StringBuilder w2 = new StringBuilder(word2);
        StringBuilder w3 = new StringBuilder();
        int i = 0, j = 0;

        for (int x = 0; x < w1.length() || x < w2.length(); x++) {
            if (i != w1.length()) {
                w3.append(w1.charAt(x));
                i++;
            }
            if (j != w2.length()) {
                w3.append(w2.charAt(x));
                j++;
            }
        }
        return w3.toString();
    }

    //---------2----------------------------------------------------------------------------
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    //----------3---------------------------------------------------------------------------
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = --m;
        int i2 = --n;

        while (i1 >= 0 && i2 >= 0) {
            if (nums1[i1] >= nums2[i2]) {
                nums1[i1 + i2 + 1] = nums1[i1--];
            } else {
                nums1[i1 + i2 + 1] = nums2[i2--];
            }
        }
        while (i2 >= 0) {
            nums1[i2] = nums2[i2--];
        }
    }

    //----------4---------------------------------------------------------------------------
    public String reverseWords(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }

        String res = "";
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i > 0; --i) {
            res += words[i] + " ";
        }
        return res + words[0];
    }

    //----------5---------------------------------------------------------------------------
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

