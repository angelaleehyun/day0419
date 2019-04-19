package day0419;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		System.out.println("두수의 합"+c);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("두수를 입력하세요"+e.getMessage());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("작업종료");
		}
	}

}
