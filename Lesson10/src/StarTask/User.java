package StarTask;

class User implements Cloneable {
    private int userId;
    private String name;
    private Address address;

    public User(int userId, String name, Address address) {
        this.userId = userId;
        this.name = name;
        this.address = address;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User deepClone() {
        User deepCopy = null;
        try {
            deepCopy = (User) this.clone();
            deepCopy.address = (Address) this.address.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepCopy;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}



