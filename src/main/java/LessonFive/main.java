package LessonFive;

public class main {

        public static void main(String[] args) {
            Dog dog = new Dog("Бобик");
            Cat cat = new Cat("Мурзик");

            dog.run(400);
            dog.swim(8);

            cat.run(150);
            cat.swim(5);

            Bowl bowl = new Bowl(10);
            cat.eat(bowl, 5);
            bowl.showFood();
        }
    }
    class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void run(int distance) {
            System.out.println(name + " пробежал " + distance + " метров.");
        }

        public void swim(int distance) {
            System.out.println(name + " проплыл " + distance + " метров.");
        }
    }
    class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }

        @Override
        public void run(int distance) {
            if (distance <= 500) {
                super.run(distance);
            } else {
                System.out.println(name + " не может пробежать больше 500 метров.");
            }
        }

        @Override
        public void swim(int distance) {
            if (distance <= 10) {
                super.swim(distance);
            } else {
                System.out.println(name + " не может проплыть больше 10 метров.");
            }
        }
    }
    class Cat extends Animal {
        boolean isFull = false;

        public Cat(String name) {
            super(name);
        }

        @Override
        public void run(int distance) {
            if (distance <= 200) {
                super.run(distance);
            } else {
                System.out.println(name + " не может пробежать больше 200 метров.");
            }
        }

        @Override
        public void swim(int distance) {
            System.out.println(name + " не умеет плавать.");
        }

        public void eat(Bowl bowl, int food) {
            if (bowl.food >= food) {
                bowl.food -= food;
                isFull = true;
                System.out.println(name + " покушал и теперь сыт.");
            } else {
                System.out.println("Для " + name + " недостаточно еды в миске.");
            }
        }
    }
    class Bowl {
        int food;

        public Bowl(int food) {
            this.food = food;
        }

        public void addFood(int food) {
            this.food += food;
            System.out.println("Добавили " + food + " еды в миску.");
        }

        public void showFood() {
            System.out.println("В миске осталось: " + food);
        }
    }

