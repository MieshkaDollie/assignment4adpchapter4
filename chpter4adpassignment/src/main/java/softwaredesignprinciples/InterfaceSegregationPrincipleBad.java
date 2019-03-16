package softwaredesignprinciples;

 class InterfaceSegregationPrincipleBad {
}

// interface segregation principle - bad example
interface IWorker2 {
    public void work();
    public void eat();
}

class Worker2 implements IWorker2{
    public void work() {
        // ....working
    }
    public void eat() {
        // ...... eating in launch break
    }
}

class SuperWorker2 implements IWorker2{
    public void work() {
        //.... working much more
    }

    public void eat() {
        //.... eating in launch break
    }
}

class Manager2 {
    IWorker worker;

    public void setWorker(IWorker w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}

