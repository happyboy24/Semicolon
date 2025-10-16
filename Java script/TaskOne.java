public class TaskOne {
public static void main(String[] args) {

String[] days = {"m","o","n","d","a","y"};

for(int i = 5; i < days.length; i = i - 1) {
  if (i < 0) {
    break;
   }
System.out.println(days[i]);
  

  }
 }
}