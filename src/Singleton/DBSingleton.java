package Singleton;

public class DBSingleton {

    private static final DBSingleton INSTANCE = new DBSingleton();

    private DBSingleton() {
    }

    public static DBSingleton getInstance() {
        return INSTANCE;
    }

}
