package java_Learning;

public class Variables1 {
	int age=30;
	static int score=150;

	public static void main(String[] args) {
		int num=20;  //local variable
		
		System.out.println(num);
		System.out.println(score);
		Variables1 var=new Variables1();
		var.method();
		var.method1();
		System.out.println("excurted");
	}
	public void method(){
		System.out.println("method"+age);
	}
	public void method1(){
		System.out.println("method1"+age);
	
	
	}

}
