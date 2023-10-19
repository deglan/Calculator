package org.example;

public class Calculator<T> {

    public T performOperation(T a, T b, Operation<T> operation) {
        return operation.execute(a, b);
    }

}