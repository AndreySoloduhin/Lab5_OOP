public class First {
    private String str;
    boolean repeatedChar;

    First(String str){
        this.str=str;
    }

    void NoRepitMassive() {
        String[] words = str.split(" ");
        int x = words.length;
        for(int i = 0; i < x; i++){
            repeatedChar = false;
            for(int j = i + 1; j < x; j++){

                if( words[i].equals(words[j]) ){
                    repeatedChar = true;
                    break;
                }
            }
            if (repeatedChar == false){
                System.out.println(words[i] + " ");
            }

        }

    }
}
