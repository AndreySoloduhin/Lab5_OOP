public class Main {
    public static void main(String[] args){
        
        try{
           First sort = new First ("Привет Привет как дела дела");
           sort.NoRepitMassive();
        }
        catch(Exception e){

        }

        try{
            Second sort = new Second ( "Привет как ты Опаздываешь на пару по программированию");
            sort.NoLongWordMassive();
        }
        catch (Exception e) {e.printStackTrace();}

        try{
            Third sort = new Third ( "Привет как ты Опаздываешь на пару по программированию");
            sort.OrderMassive();
        }
        catch (Exception e) {e.printStackTrace();}
    }
}
