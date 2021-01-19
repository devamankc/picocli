package picocli.com;

import picocli.CommandLine;
import picocli.CommandLine.Command;
@Command(
        name = "hello",
        description = "says hello"
)
public class HelloWorld implements Runnable{
    public static void main(String[] args) {
        CommandLine.run(new HelloWorld(),args);
    }
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
