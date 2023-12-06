public class Q1 {
    public static void main(String[] args) {
        int [] temp={78,65,90,80,100,88,75};

        int highestTemp = temp[0];
        int lowestTemp = temp[0];
        for (int i = 0; i <temp.length ; i++) {
            if (temp[i]> highestTemp) {
                highestTemp = temp[i];
            } else if (temp[i] < lowestTemp) {
                lowestTemp = temp[i];


            }
        }
        System.out.println("Highest temperature for the week: "+highestTemp);
        System.out.println("Lowest temperature for the week: "+lowestTemp);
    }
}
