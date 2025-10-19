
	public class Armstrong{
		public static void main(String[] args){

			for(int cont = 1; cont <= 100; cont ++){
			int number = cont;
			int mod = 0;
			int div = cont;
			int modsum = 1;
			int count = 1;
			int addmod = 0;
			
			while(div > 0){
				mod = div % 10;
				
				while(count != 4){

					modsum *= mod;

					count++;
											
				}
				addmod += modsum;
				
				modsum = 1;
				count = 1;	
				div = div / 10;
			
				
			}

			if( addmod == number){
				 
					System.out.printf("%d is a armstrong number",number);

				}
				else{
				System.out.printf("%d is a not armstrong number %n",number);
				}
	}
		
		}
	    
	}