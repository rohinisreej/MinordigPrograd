import java .util.Scanner;
class Minordig{
    public static void minordig(int[][] array,int N)
    {
        int i=0;
        int j=N-1;
        int sum=0;
        while(i<N && j>=0)
        {
            sum+=array[i][j];
            i++;
            j--;
        }
        System.out.println(sum);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=scanner.nextInt();
        System.out.println("Enter the values: ");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Minordig md=new Minordig();
        md.minordig(arr,n);
    }
}