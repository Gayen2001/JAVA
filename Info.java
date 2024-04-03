class Parson {
    private String name;
    private int age;
public String getName(){
    return name;

}
public void  setName(String n){
    this.name =n;

}
public int getAge(){
    return age;
}
public void setAge(int ag){
    this.age=ag;
}
}

public class Info{
    public static void main(String[] args) {
        //Object creation
        Parson p= new Parson();
        //SEt Age
        p.setAge(30);
        //get age
        p.getAge();
        //set Name
        p.setName("Partha");
        System.out.println("Name : "+p.getName());
        System.out.println("Age="+p.getAge());

    }

}