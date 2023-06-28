import app.School;
import dependencyInjection.MyDependencyInjector;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        //object that needs dependency injection
        School school = new School();

        //dependency injector starter
        MyDependencyInjector DI = new MyDependencyInjector();

        //preparing DI graph
        DI.injectDependencies(new Object());

        DI.getDependableClassForDI(school);

        school.runApp();
    }
}