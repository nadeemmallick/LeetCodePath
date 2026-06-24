class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for(int i =0; i<n; i++){
            sum = sum+salary[i];

            if(salary[i] < min){
                min = salary[i];
            }

            if(salary[i] > max){
                max = salary[i];
            }
        }
        return (double)(sum-min-max)/(n-2);
    }
}