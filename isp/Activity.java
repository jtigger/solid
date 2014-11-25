public interface Successor {
    Date latestStart();
}
public interface Predecessor {
    Date earliestFinish();
}

class Activity {
  List<Predecessor> predecessors() ...
  List<Successor> successors() ...
  ...
}

