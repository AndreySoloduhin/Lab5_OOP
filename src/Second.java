public class Second {
    private String str;

    Second (String str){
        this.str=str;
    }

    public void NoLongWordMassive() {

        String[] words = str.split(" ");
        for (int i = 0; i < words.length;i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].length() < words[j].length()){
                    System.out.print(words[i] + " ");
                    i = j;
                }

            }
            System.out.print(words[i] + " ");
            break;
            }
        }

    }
