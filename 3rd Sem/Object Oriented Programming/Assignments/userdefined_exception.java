import java.util.*;
import java.io.IOException;
class FewArgumentsException extends RuntimeException{
    
    public FewArgumentsException(){
        super("command line args");
    }
    public FewArgumentsException(String args){
        super(args);
    }
      
}
public class extends FewArgumentsException{
public static void main(String args[]) {
   Scanner sc= new Scanner(System.in);
       if(args.length < 3){
           throw new FewArgumentsException("args are less than 3");
       }

   
  else{
      for(int i = 0; i<args.length;i++){
          System.out.println(args[i]);
      }
  }  
}
}