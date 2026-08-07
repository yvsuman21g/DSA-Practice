public class unionOfSortedArray {
    public static void main(String []args){
        unionOfSortedArray sol = new unionOfSortedArray();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        sol.unionOfTwoSortedArray(a, b);
    }

    public void unionOfTwoSortedArray(int[] nums1, int[] nums2){
        for(int i = 0, j = 0; i < nums1.length && j < nums2.length; ){
            if(nums1[i] < nums2[j]){
                nums1[i] = nums2[j];
                System.out.print(nums1[i]);
                i++;
            }

            else if(nums1[i] > nums2[j]){
                nums2[j] = nums1[i];
                System.out.print(nums2[j]);
                j++;
            }

            else{
                System.out.print(nums1[i]);
                i++;
                j++;
            }
        }
    }
}
