program for java maps(hashmaps) 
package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(2, "sachin");
		hm.put(3, "kohli");
		hm.put(4, "rohit");
		hm.put(5, "kl rahul");
		hm.put('a', "sachin");
		hm.put(9, "dhoni");
		System.out.println(hm);
		 for(Object ob:hm.keySet()) {
        	 System.out.println(ob);
         }
		 for(Object ob:hm.entrySet()) {
        	 System.out.println(ob);
         }
		 System.out.println("Iterator values");//Iterator values
		Collection c=hm.values();
		
		Iterator itr=c.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		 System.out.println("Iterator keys");//Iterator keys
		 Set s=hm.keySet();
		 Iterator itr2=s.iterator();
		 while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		 System.out.println("entry set return boths  keys and values");//entry set return both  keys and value
		 for(Object ob:hm.entrySet()) {
        	 System.out.println(ob);
         }
		 

	}

}
