package String;

public class ReplaceEachDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            if (i > 0) sum += arr[i - 1] - '0';
            if (i < arr.length - 1) sum += arr[i + 1] - '0';
            System.out.print(sum);
        }

	}

}
