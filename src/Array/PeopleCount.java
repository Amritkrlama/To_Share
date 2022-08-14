package Array;

public class PeopleCount {

    public static void main(String[] args) {
        validate(peopleCount("UfUfufUf"), 3);
        validate(peopleCount(""), 0);
        validate(peopleCount("uf"), 1);
        validate(peopleCount("Uf"), 1);
        validate(peopleCount("ufuf"), 1);
        validate(peopleCount("UfUfUf"), 1);
        validate(peopleCount("UfUfUfufufuf"), 2);
        validate(peopleCount("ufufUfUfUfUfufUfuf"), 6);
    }

    static int peopleCount(String s){
        boolean wasLastUf = false;
        boolean wasLastuf = false;
        int count = 0;

        for(int i=0; i<s.length(); i+=2){
            if(s.charAt(i) == 'U'){
                if(wasLastUf == false){  // can be simplified as if(!wasLastUf)
                    count++;
                    wasLastUf = true;
                    wasLastuf = false;
                }
            }else if(s.charAt(i) == 'u'){
                if(wasLastuf == false){
                    count++;
                    wasLastuf = true;
                    wasLastUf = false;
                }
            }
        }
        return count;
    }

    static void validate(int actual, int expected){
        if(expected != actual){
            throw new RuntimeException("Mismatch between expected and actual. Expected was: "+expected+", actual was: "+actual);
        }
    }
}
