import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args){
        WordGroup plato = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup roosevelt = new WordGroup("When you play play hard when you work dont play at all");
        String[] platArray = plato.getWordArray();
        String[] roosArray = roosevelt.getWordArray();
        
        System.out.println();
        System.out.println();
        System.out.print("Plato quote:    ");
        for(int i = 0; i < (platArray.length); i++){
            System.out.print(platArray[i] + " ");
        }
        
        System.out.println();
        System.out.println();
        System.out.print("Roosevelt quote:    ");
        for(int i = 0; i < (roosArray.length); i++){
            System.out.print(roosArray[i] + " ");
        }
        
        WordGroup groupA = new WordGroup("The quick brown fox jumped over the lazy dog");
        WordGroup groupB = new WordGroup("The clumsy red fox tripped over the brown dog");
        HashSet<String> myHash;
        myHash = groupA.getWordSet(groupB);
        Iterator it = myHash.iterator();
        
        System.out.println();
        System.out.println();
        System.out.println("HashSet:    ");
        while(it.hasNext()){
            System.out.println(it.next());    
        }
        
        HashMap<String, Integer> HashA = new HashMap<String, Integer>();
        HashMap<String, Integer> HashB = new HashMap<String, Integer>();
        HashA = groupA.getWordCounts();
        HashB = groupB.getWordCounts();
        Set keySetA = HashA.keySet();
        Set keySetB = HashB.keySet();
        
    }
}
