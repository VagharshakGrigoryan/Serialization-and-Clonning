package com.example.simple.externalizeble;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Teacher implements Externalizable {

    private int id;
    private transient String userName;

    public Teacher(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }


    public Teacher() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeInt(id);
        out.writeObject(userName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        userName = (String) in.readObject();
    }
}
