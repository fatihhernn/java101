package ArrayAlgorithms;

public class ProductsOfArrayExceptSelf {

    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
    }

    public static int[] productExceptSelf(int[] numbs){

        int[] sol=new int[numbs.length];

        sol[0]=1;
        for (int i = 1; i <numbs.length ; i++) {
            sol[i]=sol[i-1]*numbs[i-1];
        }

        int rightProduct=1;
        for (int i = numbs.length -1; i >=0 ; i--) {
            sol[i]=sol[i]*rightProduct;
            rightProduct*=numbs[i];
        }

        return sol;
    }
}
