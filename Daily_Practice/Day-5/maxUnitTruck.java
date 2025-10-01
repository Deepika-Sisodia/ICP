import java.util.Arrays;

public class maxUnitTruck {
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3},{2,2},{3,1}}; 
        int truckSize = 4;
        int units = 0;
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        for(int i=0; i<boxTypes.length; i++){
            if(truckSize>=boxTypes[i][0]){
                units = units + (boxTypes[i][0]*boxTypes[i][1]);
                truckSize -= boxTypes[i][0];
            }
            else{
                units = units + (truckSize)*boxTypes[i][1];
                break;
            }
        }
        System.out.println(units);
    }
}
