import java.util.*;

class Priority {

    int id;
    String name;
    double cgpa;


    Student(int id, String name, double cgpa){

        this.id=id;
        this.name=name;
        this.cgpa=cgpa;

    }


    public int getId(){
        return id;
    }


    public String getName(){
        return name;
    }


    public double getCgpa(){
        return cgpa;
    }

}



class StudentComparator implements Comparator<Student>{


    public int compare(Student s1, Student s2){


        if(s1.cgpa != s2.cgpa){

            return Double.compare(s2.cgpa,s1.cgpa);

        }


        if(!s1.name.equals(s2.name)){

            return s1.name.compareTo(s2.name);

        }


        return s1.id-s2.id;

    }

}



public class JavaPriorityQueue {


    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);


        PriorityQueue<Student> pq =
                new PriorityQueue<>(new StudentComparator());


        int n=sc.nextInt();



        for(int i=0;i<n;i++){


            int id=sc.nextInt();

            String name=sc.next();

            double cgpa=sc.nextDouble();



            pq.add(new Student(id,name,cgpa));

        }



        while(!pq.isEmpty()){


            Student s=pq.poll();


            System.out.println(
                    s.getName()
            );

        }


        sc.close();

    }
}