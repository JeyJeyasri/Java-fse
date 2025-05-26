class Box {
    int length, width, height;

    Box() {
        length = width = height = 0;
    }

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }
}

public class ConstructorOverloadDemo {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(3, 4, 5);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
    }
}
