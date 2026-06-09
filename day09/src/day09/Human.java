package day09;

public class Human extends Animal {

		// TODO Auto-generated method stub
		
		private String addr;
		
		public Human() {
			
		}
		public Human(String name, int age) {
			super(name,age);
			}
		
		
		//  getter
		public String getAddr() {
			return addr;
		}
		
		// setter
		public void setAddr(String addr) {
			this.addr = addr;
		}
	

}
