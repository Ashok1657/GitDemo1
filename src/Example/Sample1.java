package Example;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "my name is ashok";
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.print(str.charAt(j));
				}
			}
		}
		//System.out.print("my name is ashok");

	}

}
