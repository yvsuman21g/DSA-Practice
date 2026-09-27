package gfg;
class example3 {
    static int fun(int i)
    {
        if (i % 2 == 1) return (i++);
        else return fun(fun(i - 1));
    }
    
    // Driver code
    public static void main (String[] args) {
        System.out.println(" " + fun(200) + " ");
    }
}    