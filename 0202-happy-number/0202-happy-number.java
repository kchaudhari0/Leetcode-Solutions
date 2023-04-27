class Solution {
	public boolean isHappy(int n) {
    
		do {
			n =NumberSqrt(n);    
		} while (n != 1 && n != 4);
    
		if (n == 1) {
			return true;
		}
		return false;
	}
    
    
	static int NumberSqrt(int num) {

		int sum = 0;
		while (num > 0) {
			int Rem = num % 10;
			num /= 10;
			sum += (Rem * Rem);
		}
		return sum;
	}
}