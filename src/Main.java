class Main{
    String name ;
    int age;
    String address;

    public Main(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String toString(){
        return "Student name : "+name+"\nAge : "+age+"\nAddress : "+address;
    }

    public static void main(String[] args) {
        Main Daniel = new Main("Daniel", 20,"nowhere");
        Daniel.setName("Pranesh");
        Daniel.setAge(15);
        Daniel.setAddress("Perungudi");
        System.out.println(Daniel.getName());
        System.out.println(Daniel.toString());;
    }
}