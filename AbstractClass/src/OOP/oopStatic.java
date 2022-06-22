package OOP;

import org.w3c.dom.ls.LSOutput;

public class oopStatic {
        private int ID;
        private String name;
        private String ofclass;
        private String classity;
        private static String college = "WWsK";
        static void changeCollege(){

            oopStatic.college = "KLpoA";
        }
        public oopStatic(int ID,String name, String ofclass,String classity){
            this.ID=ID;
            this.name =name;
            this.ofclass=ofclass;
            this.classity=classity;
        }
        void display(){
            System.out.println(ID + " " + name +" " + ofclass + " " + " " + classity+" " +college);
        }

    public static void main(String[] args) {
        oopStatic  oopStatic = new oopStatic(2,"550","7","p");
        System.out.println(college);
        changeCollege();
        System.out.println(college);
        OOP.oopStatic.college = "hihi";
        System.out.println(college);
    }
    }


