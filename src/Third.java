import java.util.Scanner;

public class Third {
    private String str;
    boolean OrderChar;


    Third (String str){
        this.str=str;
    }

    public void OrderMassive(){
        String[] words = str.split(" ");
        OrderChar = true;
        for (int i = 1; i < words.length; i++){

            if(words[i].length() < words[i-1].length()){
                OrderChar = false;
                break;
            }
        }
        if (OrderChar){
            System.out.println(" ");
            System.out.print("Слова строки находятся в порядке возрастания длин слов.");
        }
        else{
            System.out.println(" ");
            System.out.println("Слова строки не находятся в порядке возрастания длин слов.\nВ упорядоченном порядке:");

              for(int i = (words.length - 1); i > 0;i--){

                for (int j = 0; j < i;j++){
                    if(words[j].length() < words[j+1].length()){
                        String tmp = words[j];
                        words[j] = words[j+1];
                        words[j+1] = tmp;
                    }
                }

              }
            for (int i = 0; i < words.length; i++){
                System.out.print(words[i] + " ");
            }
        }
    }






}
