public class ChainedException {
    public static void main(String [] args){
     try {
         printingMessage();
     } catch (Exception e){
         e.printStackTrace();
     }
    }
    static void printingMessage() throws Exception{
        try{
            int num = 25/0;
        }catch (ArithmeticException e){
            throw new Exception("Exception occurred in method", e);
        }
    }
}
