interface Sports {
    void play();
}

interface Academics {
    void study();
}

class Student implements Sports, Academics {
    public void play() {
        System.out.println("Student is playing.");
    }

    public void study() {
        System.out.println("Student is studying.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.play();
        s.study();
    }
}