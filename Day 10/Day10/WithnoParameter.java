package Day10;

	@FunctionalInterface
	interface Sayable{
		
		public String  say();
		
	}

	public class WithnoParameter {			
		public static void main(String ar[]) {
			
			//functional style
			Sayable s =() ->{
				return "hi how are you"; 
			};
			System.out.println(s.say());
		}

}
