public interface Foo {
  public String getName();
  public Bar getCollaborator();
  public List<Datum> getData();
}

public interface MutableFoo extends Foo {
  public void setName(String name);
  public void setCollaborator(Bar collaborator);
  public void addDatum(Datum datum);
  public void removeDatum(Datum datum);
}

public class FooImpl implements Foo, MutableFoo {
  public String getName();
  public void setName(String name);

  public Bar getCollaborator();
  public void setCollaborator(Bar collaborator);

  public List<Datum> getData();
  public void addDatum(Datum datum);
  public void removeDatum(Datum datum);

  private String name;
  private Bar collaborator;
  private Object[] data;
}
