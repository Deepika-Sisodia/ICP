import java.util.ArrayList;
import java.util.Collections;

public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("deepika",20, 153);
        Person p2 = new Person("bhumika",20,152);
        Person p3 = new Person("kratika",19,152);
        Person p4 = new Person("khushi",20,150);

        System.out.println(p1.toString());

        ArrayList<Person> ll = new ArrayList<>();
        
        ll.add(p1);
        ll.add(p2);
        ll.add(p3);
        ll.add(p4);
        
        Collections.sort(ll);
        for(int i=0; i<ll.size(); i++){
            System.out.println(ll.get(i).name);
        }
    }
}
