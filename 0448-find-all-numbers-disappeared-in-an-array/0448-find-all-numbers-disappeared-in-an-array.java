class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
     	List<Integer> l=new ArrayList<>();
		int i=0;
		while (i<arr.length) {
			int correctindex=arr[i]-1;
			if(arr[i]!=arr[correctindex])
				swap(arr, i, correctindex);
			else
				i++;
		}
		
		for (int i1 = 0; i1 < arr.length; i1++) {
			if(arr[i1]!=i1+1)
				l.add(i1+1);
		}
		return l;
    }

	private static void swap(int[] arr, int i, int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;		
	}
}