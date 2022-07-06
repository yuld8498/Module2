package CollectionsP.comparealbe;

/*Compare dùng để sắp xếp các phần tử của  1 mảng đối tượng theo
1 đặc điểm nào đó.
-Comparable thì cần implements vào Class của đối tượng trong mảng
và overwrite lại phương thức compareTo. Phương thức compareTo trả
về 1 giá trị. nếu object trước > object sau thì trả về >0, object trước < object sau
thì trả về âm.
-Comparetor thì không cần implements vào class của đối tượng trong mảng.
cần khai báo Collections.sort(list, list comparetor) trong phương thức thực hiện
để tiến hành Overwrite lại phương thức compare để sắp xếp theo mong muốn.
* */

public class Person implements Comparable<Person> {
    private int ID;
    private String name;
    private String gender;
    private int fee;

    public Person(){

    }
    public Person(int ID, String name, String gender, int fee){
        this.ID=ID;
        this.fee=fee;
        this.name=name;
        this.gender=gender;
    }
    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name +
                ", gender='" + gender +
                ", fee=" + fee +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.getName());
//    }
//    public int compareTo(Person o) {
//        return this.gender.compareTo(o.getGender());
//    }
    public int compareTo(Person o) {
        return this.fee - o.getFee();
    }
//    public int compareTo(Person o) {
//        return this.ID -o.getID();
//    }


}
