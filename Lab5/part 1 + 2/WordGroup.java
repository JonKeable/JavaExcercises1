import java.util.HashSet;
import java.util.HashMap;

public class WordGroup
{
    String words;

    protected WordGroup(String str){
        words = str.toLowerCase();
        }
        
    protected String[] getWordArray(){
        return words.split(" ",0);
        }
        
    protected HashSet<String> getWordSet(WordGroup wrdGrp){
        HashSet<String> mySet = new HashSet<String>();
        for(int i = 0; i < this.getWordArray().length; i++){
            mySet.add(this.getWordArray()[i]);
        }
        for(int i = 0; i < wrdGrp.getWordArray().length; i++){
            mySet.add(wrdGrp.getWordArray()[i]);
        }
        return mySet;
    }
    
    protected HashMap<String, Integer> getWordCounts(){
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        for(String w : this.getWordArray()){
            Integer i = myMap.get(w);
            if(i == null) myMap.put(w, 1);
            else myMap.put(w, i + 1);
        }
        return myMap;
    }
}
