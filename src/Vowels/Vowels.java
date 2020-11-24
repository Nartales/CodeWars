package Vowels;
public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    
    for (int i = 0; i < str.length(); i++){
        char c = str.charAt(i); 
        
        switch (c) {
        case 'a':
        	vowelsCount++;
        	break;
        case 'e':
        	vowelsCount++;
        	break;
        case 'i':
        	vowelsCount++;
        	break;
        case 'o':
        	vowelsCount++;
        	break;
        case 'u':
        	vowelsCount++;
        	break;      	
        }
    }

    return vowelsCount;
  }

}