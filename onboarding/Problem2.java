package onboarding;

import java.util.LinkedList;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";

        LinkedList<String> linkedlist = new LinkedList<>();

        for (String s : cryptogram.split("")) {
            linkedlist.add(s);
        }

        while (checkDup(linkedlist)) {
            
            for (int i=0;i<linkedlist.size()-1;i++) {
               
                if (linkedlist.get(i).equals(linkedlist.get(i+1))){
                    linkedlist.remove(i);
                    linkedlist.remove(i);
                }
            }

        }
        answer = combine(linkedlist);
        return answer;
    }

    public static Boolean checkDup(LinkedList<String> list) {
        for(int i=0;i<list.size()-1;i++) {
            if (list.get(i).equals(list.get(i+1)))
                return true;
        }
        return false;
    }

    public static String combine(LinkedList<String> list) {
        String result = "";
        for (int i=0;i< list.size();i++) {
            result+=list.get(i);
        }
        return result;
    }
}