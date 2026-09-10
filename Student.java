import java.util.*;


class Student {


    int id;
    String name;
    int marks;



    Student(int id,String name,int marks){

        this.id=id;
        this.name=name;
        this.marks=marks;

    }

}



class StudentComparator implements Comparator<Student>{



    public int compare(Student s1, Student s2){


        // Higher marks first

        if(s1.marks != s2.marks){

            return s2.marks - s1.marks;

        }


        // Alphabetical name

        if(!s1.name.equals(s2.name)){

            return s1.name.compareTo(s2.name);

        }


        // Smaller id first

        return s1.id-s2.id;

    }

}



public class CustomComparatorTask {


    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);



        int n=sc.nextInt();



        Student[] students=new Student[n];



        for(int i=0;i<n;i++){


            int id=sc.nextInt();

            String name=sc.next();

            int marks=sc.nextInt();



            students[i]=new Student(
                    id,name,marks
            );

        }



        Arrays.sort(
                students,
                new StudentComparator()
        );



        for(Student s:students){


            System.out.println(
                    s.id+" "+
                    s.name+" "+
                    s.marks
            );

        }



        sc.close();

    }
}