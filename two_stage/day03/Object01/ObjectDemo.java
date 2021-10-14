package two_stage.day03.Object01;

public class ObjectDemo {
    public static void main(String[] args) {
        Student stu = new Student(10,"asdasd");
        Student s = new Student(10,"asdasd");
        Student s1 = new Student(10,"asdas");
        System.out.println(stu);//two_stage.day03.Object01.Student@49e4cb85
        System.out.println(stu.toString());
        System.out.println(stu.equals(s));
        System.out.println(stu.equals(s1));

//        public void println(Object x) {  //x = stu;
//            String s = String.valueOf(x);
//            synchronized (this) {
//                print(s);
//                newLine();
//            }
//        }

//        public static String valueOf(Object obj) { //obj = stu
//            return (obj == null) ? "null" : obj.toString();
//        }

//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }



    }
}
