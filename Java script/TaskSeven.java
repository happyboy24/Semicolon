public class TaskSeven{
public static void main(String[]args){
int sum = 0;
int average = 0;
for (int i = 1; i <= 100; i++ ){
	sum += i;
	average = sum/100;
}
System.out.print(average);
}

}