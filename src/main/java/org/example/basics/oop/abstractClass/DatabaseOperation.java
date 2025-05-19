package org.example.basics.oop.abstractClass;

public abstract class DatabaseOperation {
    protected void connect() {
        System.out.println("connecting to database");
    }
    protected abstract void validate();
    protected  abstract void query();
    protected void disconnect() {
        System.out.println("Disconnecting from database...");
    }

    public final void execute() {
        connect();
        validate();
        query();
        disconnect();
    }
}


class SelectUserOperation extends DatabaseOperation {
    @Override
    protected void validate() {
        System.out.println("Validating SELECT parameters...");
    }

    @Override
    protected void query() {
        System.out.println("Executing SELECT * FROM users...");
    }
}

class InsertUserOperation extends DatabaseOperation {
    @Override
    protected void validate() {
        System.out.println("Validating INSERT parameters....");
    }

    @Override
    protected void query() {
        System.out.println("Executing INSERT INTO users (name, email)");
    }
}