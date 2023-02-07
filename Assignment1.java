public class Assignment1 {
    static int largestnumber(int x, int y, int z)
    {
        if (x >= y && x >= z)
            return x;
        else if (y >= x && y >= z)
            return y;
        else
            return z;
    }
    public static void main(String args[]) {
        int a = 5;
        int b = 4;
        int c = 8;

        int largest = largestnumber(a, b, c);
        System.out.println(largest + " is the largest number.");

    }
}

