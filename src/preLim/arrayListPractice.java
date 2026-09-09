
package preLim;

import java.util.ArrayList;

public class arrayListPractice {
    
    public static void main(String[] args) {
        
        ArrayList<String> name = new ArrayList<>();
        
        name.add("Reigner");
        name.add("John");
        name.add("Flores");
        name.add(1, "JanJan");
        name.addFirst("Coldsnap");
        name.addLast("Tagalog");
        
        System.out.println(name);
        
        name.set(0, "NerNer");
        
        
        System.out.println(name.size());
        
        
        for (int i = 0; i < name.size(); i++) {
            
            System.out.print(name.get(i) + " ");
        }
        
        System.out.println("");
        
        System.out.println(name.contains("Reigner"));
        
        name.remove("NerNer");
        
        for (int i = 0; i < name.size(); i++) {
            
            System.out.print(name.get(i) + " ");
            
        } System.out.println("");
        
        name.clear();
        
        System.out.println(name.isEmpty());
        
        
    }
    
}
