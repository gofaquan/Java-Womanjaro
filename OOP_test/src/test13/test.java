package test13;

public class test {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        Person temp;
        people[0] = new Student("xiao_1", "male", 18, 9999);
        people[1] = new Student("xiao_2", "female", 180, 7999);
        people[2] = new Teacher("xiao_3", "female", 1810, 1);
        people[3] = new Teacher("xiao_4", "female", 10, 123);

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length-i-1; j++) {
                if (people[j].getAge() > people[j+1].getAge()){
                    temp = people[j+1];
                    people[j+1] = people[j];
                    people[j] = temp;
                }
            }
        }


        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        for (int i = 0; i < people.length; i++) {
            GetInfo(people[i]);
        }
    }



    public static void GetInfo(Person p){
        if (p instanceof Student){
            ((Student) p).Study();
        }
        if (p instanceof Teacher){
            ((Teacher) p).teach();
        }
    }
}
