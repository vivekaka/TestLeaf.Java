package selenium90Days.Java;

public class ReverseEvenString {
	
	public static void main(String[] args) {
		
		String str = "When the world realise its own mistake, corona will dissolve automatically";
		
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			if(i%2 != 0 ) {
				
				StringBuffer buffer = new StringBuffer(split[i]).reverse();
				
				split[i] = buffer.toString();
			}
			
		}
		
		for (int i = 0; i < split.length; i++) {
			
			System.out.print(split[i]+" ");
			
		}
		
	}
}
