class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Arrays.sort(candies);
        List<Boolean> list = new ArrayList<>();
        boolean var = false;

        for (int i = 0; i < candies.length; i++) {
            list.add(var);
        }
int max =  candies[0];
        for(int i = 0  ; i < candies.length;i++ ){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0  ; i < candies.length ; i++){
           if(extraCandies + candies[i]  >= max){
            list.set(i , true);
           } 
        }
return list ;
    }
}