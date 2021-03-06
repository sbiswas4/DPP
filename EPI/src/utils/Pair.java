package utils;

/** Created by Pankaj on 7/12/15. */
public class Pair<T1, T2> {
  private final T1 _first;
  private final T2 _second;

  public Pair(T1 first, T2 sec) {
    _first = first;
    _second = sec;
  }

  public T1 first() {
    return _first;
  }

  public T2 second() {
    return _second;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || !(o instanceof Pair)) return false;
    Pair other = (Pair) o;
    return other._first.equals(_first) && other._second.equals(_second);
  }
}
