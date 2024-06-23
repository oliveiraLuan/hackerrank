final class Singleton{
    public String str = "Hello I am a singleton! Let me say hello world to you";

    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleInstance(){
        if(singleton == null)
            singleton = new Singleton();

        return singleton;
    }
}