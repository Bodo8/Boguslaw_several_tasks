package myHashMap;

public class MyEntry<K, V> {

  private K key;
  private V value;

  public MyEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MyEntry)) {
      return false;
    }

    MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;

    if (key != null ? !key.equals(myEntry.key) : myEntry.key != null) {
      return false;
    }
    return value != null ? value.equals(myEntry.value) : myEntry.value == null;
  }

  @Override
  public int hashCode() {
    int result = key != null ? key.hashCode() : 0;
    result = 31 * result + (value != null ? value.hashCode() : 0);
    return result;
  }
}
