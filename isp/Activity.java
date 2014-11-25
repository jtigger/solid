public interface Successor {
    Date latestStart();
}
public interface Predecessor {
    Date earliestFinish();
}

class Activity implements Successor, Predecessor {
  List<Predecessor> predecessors() ...
  List<Successor> successors() ...
  ...
}

