package OOP;
public class Person {
    public String name;
    public int age;
    public boolean gender;
    public double height;
    public int weight;
    public Person(String name, int age,boolean gender,double height,int weight){
        //gọi lại thuộc tính từ lớp
        this.name = name;
        this.age = age;
        this.gender=gender;
        this.height=height;
        this.weight=weight;
        this.getInfo();
    }
    /*
    * gọi lại phương thức khởi tạo
    * Khi gọi lại phương thức khởi tạo thì this(method) nằm ở hàng đầu tiên
    * */
    public Person(String name,int age,double height){
        this(age,height);
        this.name =name;
    }
    public Person(int age,double height){
        this.age =age;
        this.height = height;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(boolean gender) {
        this.gender = gender;
    }

    public Person(double height) {
        this.height = height;
    }
    public Person(String name, double height, int weight){
        this(height);
        this.weight = weight;
    }
    public void getInfo(){
        System.out.println("Name is: " + this.name);
        System.out.println("Age is: " + this.age);
        System.out.println("Gender is: " + this.gender);
    }

    public static void main(String[] args) {
        Person person =  new Person("Thanh", 24, 1.72f);
    }
}
