package com.bhq;

public class Users implements Comparable<Users> {
    private String username;
    private int userage;

    public Users(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }

    public Users(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Users.equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userage != users.userage) return false;
        return username != null ? username.equals(users.username) : users.username == null;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + userage;
        return result;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }

    @Override
    public int compareTo(Users o) {
        if (this.userage < o.userage) {
            return 1;
        }
        if (this.userage == o.userage) {
            return this.username.compareTo(o.getUsername());
        }
        return -1;

    }
}
