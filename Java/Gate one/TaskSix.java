public class TaskSix{
public static void main(String[]args){

int number = 10;
int count = 4;
int k = 1;
for(count = 4; count <= number; count = count*2){
 for(int div = 1; div <= count; div++){
 k = k * count;
System.out.println(k);   

}

}
for(count = 8; count <= number; count = count*2){
 for(int hap = 1; hap <= count; ++){
 k = k * count;
System.out.println(k);
}

}