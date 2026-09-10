import java.util.*;


public class SortThePeople {



    public static String[] sortPeople(
            String[] names,
            int[] heights
    ){


        int n=names.length;



        Integer[] index=new Integer[n];



        for(int i=0;i<n;i++){

            index[i]=i;

        }



        Arrays.sort(index,
                new Comparator<Integer>(){


            public int compare(Integer a,Integer b){


                return heights[b]-heights[a];

            }


        });



        String[] result=new String[n];



        for(int i=0;i<n;i++){


            result[i]=names[index[i]];


        }



        return result;

    }



    public static void main(String[] args){



        Scanner sc=new Scanner(System.in);



        System.out.print("Enter number of people: ");

        int n=sc.nextInt();



        String[] names=new String[n];

        int[] heights=new int[n];



        System.out.println("Enter names:");

        for(int i=0;i<n;i++){

            names[i]=sc.next();

        }



        System.out.println("Enter heights:");

        for(int i=0;i<n;i++){

            heights[i]=sc.nextInt();

        }



        String[] result =
                sortPeople(names,heights);



        System.out.println(
                "Sorted People:"
        );


        for(String s:result){

            System.out.print(s+" ");

        }



        sc.close();

    }
}