package softwaredesignprinciples;

public class InterfaceSegregationPrincipleGood {
}

// interface segregation principle - good example


interface IWorkable {
    public void work();
}

interface IFeedable{
    public void eat();
}

interface IWorker3 extends IFeedable, IWorkable {
}

class Worker3 implements IWorkable, IFeedable{
    public void work() {
        // ....working
    }

    public void eat() {
        //.... eating in launch break
    }
}

class Robot implements IWorkable{
    public void work() {
        // ....working
    }
}

class SuperWorker3 implements IWorkable, IFeedable{
    public void work() {
        //.... working much more
    }

    public void eat() {
        //.... eating in launch break
    }
}

class Manager3 {
    IWorkable worker;

    public void setWorker(IWorkable w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}
