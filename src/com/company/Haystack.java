package com.company;

public class Haystack{
 public void findNeedle (Object[] haystack){
    int pos=0;
    for(Object hay : haystack){
        int cont =+1;
        if(hay == "needle"){
            pos = cont;
        }
    }
    System.out.println("found the needle at position " + pos);
 }

/*public void findNeedle (Object[] haystack){
    int pos=0;
    for(int i= 0; i< haystack.length;i++){
        if(haystack[i] == "needle"){
            pos = haystack[i];
            pos+=1;
        }
    }
    System.out.println("found the needle at position " + pos);
}*/

}
