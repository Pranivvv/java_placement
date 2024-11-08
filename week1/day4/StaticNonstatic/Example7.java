class Example7 {
    public void show(){
        System.out.println("Non static show");
    }
    {
        show();
    }
    static{
        System.out.println("I am in static block ");
        }
        public static void main(String[] args) {
            Example7 s=new Example7();
            System.out.println("I am in main");
        }
}