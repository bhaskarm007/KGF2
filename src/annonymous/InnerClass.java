package annonymous;

//Program to create Anonymous inner class for interface and implement its method

interface Animal{
	void sound();
}
public class InnerClass{
	public static void main(String[] args) {
		Animal c=new Animal() {

			@Override
			public void sound() {
				System.out.println("Mewo Mewo");
				
			}
	 };
	 c.sound();
	 Animal d=new Animal() {

		@Override
		public void sound() {
			System.out.println("Bow Bow");
			
		}
		 
	 };
	 d.sound();
  }
}