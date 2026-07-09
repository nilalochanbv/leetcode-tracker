// Last updated: 7/9/2026, 9:47:59 AM
class Solution {
    public int[] dailyTemperatures(int[] t) {
        int arr[] = new int[t.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=0;i<t.length;i++){
            if(t[st.peek()] < t[i]){
                while(!st.isEmpty() && t[st.peek()] < t[i])
                {
                    arr[st.peek()] = i-st.peek();
                    st.pop();
                }
                st.push(i);
            }
            else{
                st.push(i);
            }
        }
        return arr;
    }
}