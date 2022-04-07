package programming.practice;

import java.util.*;

public class HighestSubString {



    public static void main(String[] args){
        String subString = "abcbfeznghkb";
        String highestSubString = getHighestSubStrWithUniquChars(subString);
        System.out.println(highestSubString);
    }

    public static String getHighestSubStrWithUniquChars(String subString){
        Set setOfSubStr = calcSubStringWithuotRepeate(subString);
        return getHighestSubString(setOfSubStr);

    }
    private static Set calcSubStringWithuotRepeate(String stingGiven){
        String substring = "";
        char[] subStrArr = stingGiven.toCharArray();
        Set setOfUniqueChars = null;
        Set setOfSubStr = new LinkedHashSet();
        for(int i=0;i<subStrArr.length;i++){
            setOfUniqueChars = new HashSet();
            substring = "";
            char[] subStrArr2 = stingGiven.substring(i,stingGiven.length()).toCharArray();
            //substing.indexOf(i)
            for(int j=0;j<subStrArr2.length;j++){
                if(setOfUniqueChars.contains(subStrArr2[j])){
                    setOfSubStr.add(substring);
                    setOfUniqueChars = null;
                    //i=j;
                    break;
                }
                else {
                    setOfUniqueChars.add(subStrArr2[j]);
                    substring += subStrArr2[j];
                }
            }
        }
        System.out.println(setOfSubStr);
        return setOfSubStr;
        //return getHighestSubString(setOfSubStr);
    }

    private static String getHighestSubString(Set setOfSubStr) {
        List<String> arr = new ArrayList();
        String highestSubString = "";
        Iterator it = setOfSubStr.iterator();
        while (it.hasNext() ) {
            String substr =(String) it.next();
            if(highestSubString.length() <= substr.length()) highestSubString = substr;
        }



        return highestSubString;
    }
}
