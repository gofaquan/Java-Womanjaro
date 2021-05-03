package poly.array;

public class test {
    public static void main(String[] args) {
        //create dynamic array
        Person[] persons = new Person[5];
        //import value in
        persons[0] = new Person("fqa",22);
        persons[1] = new Student("xiao_hong",15,100);
        persons[2] = new Student("xiao_qiang",18,59);
        persons[3] = new Teacher("mrs1",50,9999);
        persons[4] = new Teacher("mrs2",500,99999);

        //for circle get value
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());


//            //in this code always break at the first situation, bad try!
//            if (persons[i] instanceof Person) {
//                System.out.println("Person " + persons[i].getName());
//            } else if (persons[i] instanceof Student) {
//                //two parentheses or it cant be compiled
//                ((Student) persons[i]).Studying();
//            } else if (persons[i] instanceof Teacher) {
//                ((Teacher) persons[i]).Teaching();
//            } else {
//                System.out.println("no such fk_ing type");
//            }

            //right code
            if (persons[i] instanceof Student) {
                //two parentheses or it cant be compiled
                ((Student) persons[i]).Studying();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).Teaching();
            }else if(persons[i] instanceof Person){
                System.out.println("Person " + persons[i].getName());}
            else {
                System.out.println("no such fk_ing type");
            }
        }
    }
}
