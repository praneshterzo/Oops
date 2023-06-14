class Student {
    String name ;
    int age;
    String address;

    public Student(String name, int age, String address){
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
        Student Daniel = new Student("Daniel", 20,"nowhere");
        Daniel.setName("Pranesh");
        Daniel.setAge(15);
        System.out.println(Daniel.getName());
        System.out.println(Daniel.toString());;
    }
}