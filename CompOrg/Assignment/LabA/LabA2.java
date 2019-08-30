public class LabA2{

	public static void main(String args[]){

		int raw = Integer.parseInt(args[0]);
		System.out.println(Integer.toHexString(raw));
		int reverse = Integer.reverse(raw);
		System.out.println(Integer.toHexString(reverse));
		int reverseByte = Integer.reverseBytes(raw);
		System.out.println(Integer.toHexString(reverseByte));
	}
}
