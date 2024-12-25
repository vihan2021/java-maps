//program for java maps(hashtable)
package maps;
import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Hashtable ht=new Hashtable();
         ht.put(1,"hevaji");
         ht.put(2,"sai");
         System.out.println(ht);
         for(object ob:ht.entryset()) {
        	 System.out.println(ob);
         }
	}

}
