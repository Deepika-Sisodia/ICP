import java.util.*;;
public class Person implements Comparable<Person> {
    String name;
    int age;
    int height;

    Person(){

    }

    Person(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString(){
        return "[name: "+ name + " age: " + age + " height: " + height + "]";
    }

    // @Override 
    // public int compareTo(Person other){
    //     if(this.height < other.height) return -1;
    //     else if(this.height > other.height) return 1;
    //     else return 0;
    // }

    @Override 
    public int compareTo(Person other){
        if(this.age == other.age){
            return this.height-other.height;
        }
        else if(this.height == other.height){
            return this.name.compareTo(other.name);
        }

        return this.age - other.age;
    }

}
