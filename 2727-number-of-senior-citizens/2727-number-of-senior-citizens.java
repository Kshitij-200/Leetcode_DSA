class Solution {
    public int countSeniors(String[] details) {
        int seniorPassengers = 0;
        for (String passenger : details) {
            int age = Integer.parseInt(passenger.substring(11, 13));
            if (age > 60) {
                seniorPassengers++;
            }
        }
        return seniorPassengers;
    }
}