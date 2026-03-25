public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        
        if (args.length == 0) {
            nameBuilder.append("World");
        } else {
            for (String name : args) {
                if (nameBuilder.length() > 0) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
            }
        }
        
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}