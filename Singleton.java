class Singleton {

    private static Singleton singleInstance;

    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {

        if (singleInstance == null) {
            singleInstance = new Singleton();
        }

        return singleInstance;
    }
}