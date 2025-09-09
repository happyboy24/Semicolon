import java.util.Scanner;

// Method for finding the oldest and youngest scores

public class Ages{

 public static void main(String[] args){
  
 Scanner input = new Scanner(System.in);


        System.out.print("Enter first person name: ");

        String name1 = input.next();

     System.out.print("Enter second person name: ");

        String name2 = input.next();

      System.out.print("Enter third person name: ");

        String name3 = input.next();

       System.out.print("Enter first person age: ");

        int age1 = input.nextInt(); 

       System.out.print("Enter second person age: ");


        int age2 = input.nextInt();

        System.out.print("Enter third person age: ");

        int age3 = input.nextInt();

      String oldestName = name1;
       int oldest = age1;
            if(age2 >= age1){
       oldest = age2;
       oldestName = name2;
       }

     if(age3 >= age1){
      oldest = age3;
      oldestName = name3;
    }
      System.out.printf("The oldest is:  " + oldest);

       System.out.println(" The person name with oldest age: " + oldestName );
     
      int youngest = age2;
      String youngestName = name2;

      if(age1 <= age2){
       youngest = age2;
       youngestName = name2;
      
}
      if(age3 <= age1){
        youngest = age3;
	youngestName = name3;
        }
       System.out.printf("The youngest is:  " + youngest);

       System.out.println(" The person name with youngest age:" + youngestName );
     

}
}