class Demo{
    public static void sum(int...a)
    {
    System.out.println("Number of arguments: "+a.length);
}
    public static void main(String args[])
    {
        sum();
        sum(10);
        sum(10,20);
        sum(10,20,30);
    }
}