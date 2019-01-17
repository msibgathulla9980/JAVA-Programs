package com.bridgelabz.designpatternprograms.creational;

public class ThreadSafeSingletonUsingDoubleLocking {
private static ThreadSafeSingletonUsingDoubleLocking instance;
    
    private ThreadSafeSingletonUsingDoubleLocking(){}

public static ThreadSafeSingletonUsingDoubleLocking getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingletonUsingDoubleLocking();
            }
        }
    }
    return instance;
}
}
