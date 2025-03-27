class StaticBloc {
    static {
        System.out.println("static block is invoked");
    }

    public static void main(String[] args) {
        System.out.println("Hello main");
    }
}

//Output
// static block is invoked
// Hello main