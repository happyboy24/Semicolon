public class TaskTwo{
public static void main(String[] args){

int[] numbers = {1,2,3,4,5};

for(int i = 5; i < numbers.length; i = i - 1) {
  if (i < 0) {
    break;
   }
System.out.println(numbers[i]);
  

  }
 }
}