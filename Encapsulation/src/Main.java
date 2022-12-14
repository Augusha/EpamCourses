public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Ivan", "Hrynkevych", 18, "Programmer",2.5 );
        System.out.println("Worker: \n" + worker.Output());
        System.out.println("\nWorker's full name: \n" + worker.getName() + " " + worker.getSurname());
        worker.setName("Mykola");
        System.out.println("\nWorker's full name after change: \n" + worker.getName() + " " + worker.getSurname());
    }
}