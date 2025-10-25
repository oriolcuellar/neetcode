class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer num1=null;
        Integer num2=null;
        int [] org=nums.clone();
        Arrays.sort(nums);

        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    num1=nums[i];
                    num2=nums[j];
                    break;
                }
                if(nums[i]+nums[j]>target) j=nums.length;
            }
            if(num1!=null)break;
            //if (nums[i])
        }

        Integer pos1=null;
        Integer pos2=null;
        for (int i=0;i<nums.length;i++){
            System.out.println("ITER: "+String.valueOf(i));
            System.out.println(String.valueOf(nums.length));
            System.out.println(String.valueOf(org[i]));
            System.out.println(String.valueOf(num1));
            if (org[i]==num1 )
                System.out.println("ENTRO0");
            if (pos1==null )
                System.out.println("ENTRO1");
            if(org[i]==num1 && pos1==null){
                pos1=i;
                System.out.println("ENTRO");
            }
            if(org[i]==num2 && pos2==null){
                if((pos1!=null && pos1!=i) || pos1==null)
                    pos2=i;

            }
        }
        System.out.print(Arrays.toString(org));
        if(pos1>pos2){
            int aux=pos1;
            pos1=pos2;
            pos2=aux;
        }
        int [] vect={pos1,pos2};
        return vect;
    }
}
