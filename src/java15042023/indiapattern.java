package java15042023;

public class indiapattern {
	public static void main(String[] args) {
		String s="india";
			char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++) {
				for(int j=0;j<= i;j++) {
					System.out.print(ch[j]+" ");
				}
				System.out.println();
			}
	}

}
