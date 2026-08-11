class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = 0;
        int answer = arr[0];
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int newOneDelete = Math.max(oneDelete+current,noDelete);
            int newNoDelete = Math.max(current , noDelete + current);
            oneDelete = newOneDelete;
            noDelete = newNoDelete;
            answer = Math.max(answer,oneDelete);
            answer = Math.max(answer,noDelete);
        
        }
        return answer;
    }
}