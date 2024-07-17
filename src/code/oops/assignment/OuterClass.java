package code.oops.assignment;


    public class OuterClass {
        private String outerField = "Outer field";

        // Static Nested Class
        public static class StaticNestedClass {
            public void printMessage() {
                System.out.println("Message from static nested class");
            }
        }

        // Inner Class
        public class InnerClass {
            public void display() {
                System.out.println("Accessing: " + outerField);
            }
        }

        public static void main(String[] args) {
            // Creating an instance of the static nested class
            OuterClass.StaticNestedClass staticNestedInstance = new OuterClass.StaticNestedClass();
            staticNestedInstance.printMessage();

            // Creating an instance of the outer class to create an instance of the inner class
            OuterClass outerInstance = new OuterClass();
            OuterClass.InnerClass innerInstance = outerInstance.new InnerClass();
            innerInstance.display();
        }
    }

