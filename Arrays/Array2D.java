public class Array2D{
    public static void main(String[] args){
        double[][] array2d = {{2, 4, 6},
                              {8, 10, 12}};
        System.out.println(array2d[1][0]);

        double[][] arr = new double[1][2];
        arr[0][1] = 10;
        System.out.println(arr[0][1]);
    }
}