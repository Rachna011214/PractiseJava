package basicJava;
import java.io.File;

public class RenameFile {
   public static void main(String[] args) {
      File oldName = new File("C://Users//bhave//Downloads//rac.txt");
      File newName = new File("C://Users//bhave//Downloads//racHNA.txt");
      
      if(oldName.renameTo(newName)) {
         System.out.println("renamed");
      } else {
         System.out.println("Error");
      }
   }
}

