public class Ex89 {
    public static void main(String[] args) {
        Integer[] V1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Integer[] V2 = {2,6,9,23,54,12,8,77,44,11,13,53,75,89,81};

        for(int x = 0; x < V1.length; x++){
            for(int y = 0; y < V2.length; y++){
                if(V1[x] == V2[y]){
                System.out.println("V1 pos " + x + " val "+ V1[x]+ " // V2 pos "+y+" val "+ V2[y]);
                }
            }
        }
    }
}