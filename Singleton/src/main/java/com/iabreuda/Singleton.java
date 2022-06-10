package com.iabreuda;

/**
 * You can also call final to avoid extends this class
 */
public class Singleton {

    /**
     * Static variable to store the instance.
     */
    private static volatile Singleton instance;

    /**
     * Variable to test instance.
     */
    private String content = "InitialValue";

    /**
     * Let private constructor to avoid class instantiation
     */
    private Singleton() {}

    /**
     * Get instance of Singleton. Synchronized to avoid cases where threads call at same time.
     *
     * @return {@link Singleton} Instance of singleton if none previous created, otherwise return current instance
     */
    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    /**
     * Get Variable content.
     */
    public String getContent() {
        return content;
    }

    /**
     * Define content variable.
     */
    public void setContent(String content) {
        this.content = content;
    }
}
