class Constructor2 {
    int id;
    String name;


    Constructor2(int Id, String Name) {
        id = Id;
        name = Name;
    }


    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[]args) {

        Constructor2 obj= new  Constructor2(20, "Ruwan");
        Constructor2 obj1= new Constructor2(50, "Perera");


        obj.display();
        obj1.display();
    }
}
