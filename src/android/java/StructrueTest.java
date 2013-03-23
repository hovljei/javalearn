package android.java;

class A2 {
	public A2() {
		System.out.println("Parent A!!");
	}

	public A2(String agr) {
		System.out.println("Parent A:" + agr);
	}
}

class B3 extends A2 {
	public B3() {
		System.out.println("Child B");
	}

	public B3(String agr) {
		if(true){
		System.out.println("Child B:" + agr);
		}
	}
}

public class StructrueTest {
	public static void main(String agrs[]) {
		B3 a = new B3("D");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		B3 b = new B3(null);
		for (int i=1;i<10;i++){
			for(int j=1;j<i+1;j++){
				if (j==i){
				System.out.println(i+ "x"+j+"="+i*j+" ");
				}else{
					System.out.print(i+ "x"+j+"="+i*j+" ");
				}
			}
		}
	}
}
//有n个人站一排依次从1开始编号，从头开始依次报数1，2，3，报到3的出队，
//接着从下一个人依次报数1，2，3报到3的出队，
//队尾那个人报数完接到开头继续报数出队，直到最后只剩一个人，输出最后那个人的编号