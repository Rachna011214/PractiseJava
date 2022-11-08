package basicJava;
import java.io.File;

public class RenameFolder {
   public static void main(String[] args) {
      File oldName = new File("C://Users//bhave//Downloads//Rac");
      File newName = new File("C://Users//bhave//Downloads//racHNA");
      
      if(oldName.renameTo(newName)) {
         System.out.println("renamed");
      } else {
         System.out.println("Error");
      }
   }
}

