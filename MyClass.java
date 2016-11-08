package mypackage;

public class MyClass {
	
	static int[] arr = {0, 23, 10, 14, 5, 9, 7};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 4; //change 'start' variable
		int end = 6; //change 'end' variable
	
		System.out.println(path(start, end) + " km");	
	}
	public static int path(int c, int d){
		int distance = 0;
		for(int i = c + 1; i < d+1; i++){
			distance = distance + arr[i];
		}
		return distance;
	}
}
