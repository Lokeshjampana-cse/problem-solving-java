import java.util.*;

public class LargestNumber {


    public static String largestNumber(int[] nums){


        String[] arr=new String[nums.length];



        for(int i=0;i<nums.length;i++){

            arr[i]=String.valueOf(nums[i]);

        }



        Arrays.sort(arr,new Comparator<String>(){


            public int compare(String a,String b){

                return (b+a).compareTo(a+b);

            }

        });



        if(arr[0].equals("0"))
            return "0";



        StringBuilder sb=new StringBuilder();



        for(String s:arr){

            sb.append(s);

        }



        return sb.toString();

    }



    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);



        int n=sc.nextInt();


        int[] nums=new int[n];



        for(int i=0;i<n;i++){

            nums[i]=sc.nextInt();

        }



        System.out.println(
                largestNumber(nums)
        );


        sc.close();

    }
}