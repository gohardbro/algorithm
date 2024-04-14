import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for (String phone : phone_book) {
            set.add(phone);
        }

        // 각 번호의 마지막숫자 전까지 잘라보면서 phone_book에 그 번호가 있으면 return false
        for (int i=0; i< phone_book.length; i++) {
            for (int j=1; j<phone_book[i].length(); j++) {
                if (set.contains(phone_book[i].substring(0, j)))
                    return false;
            }
        }
        
        return true;
    }
}