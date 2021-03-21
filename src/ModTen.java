
public class ModTen {
	
	public static void main(String[] args) {
		String  creditCardNumber= "5555555555544444";
		
		System.out.println(check(creditCardNumber)); 
	}
	
	
	
	
	public static boolean check(String ccNumber)
    {
            int sum = 0;
            boolean alternate = false;
            for (int i = ccNumber.length() - 1; i >= 0; i--)
            {
                    int n = Integer.parseInt(ccNumber.substring(i, i + 1));
                    if (alternate)
                    {
                            n *= 2;
                            if (n > 9)
                            {
                                    n = (n % 10) + 1;
                            }
                    }
                    sum += n;
                    alternate = !alternate;
            }
            return (sum % 10 == 0);
    }
	
	

}
