package myHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MyHashMap<K, V> implements Map<K, V> {

  List<List<MyEntry<K, V>>> myMap = new ArrayList<>();


  @Override
  public int size() {
    int size = 0;
    for (int i = 0; i < myMap.size(); i++) {
      if (myMap.get(i) != null) {
        size++;
      }
    }
    return size;
  }

  @Override
  public boolean isEmpty() {
    if (myMap.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public boolean containsKey(Object key) {
    return false;
  }

  @Override
  public boolean containsValue(Object value) {
    return false;
  }

  @Override
  public V get(Object key) {

    return (V) getResult(key);
  }

  private List<V> getResult(Object key) {
    List<V> value = new ArrayList<>();
    for (int i = 0; i < myMap.get(hash(key)).size(); i++) {
      value.add((key == null) ? null : (V) myMap.get(hash(key)).get(i).getValue());
    }
    return value;
  }

  @Override
  public V put(K key, V value) {
    MyEntry myEntry = new MyEntry<K, V>(key, value);
    System.out.println(hash(key));

    addMyMap(addInsideMap(myEntry, key, value), key, value);
    return null;
  }

  public List<MyEntry<K, V>> addInsideMap(MyEntry<K, V> myEntry, K key, V value) {

    List<MyEntry<K, V>> newInsideList = new ArrayList<>();
    newInsideList.add(0, myEntry);
    return newInsideList;
  }


  private List<List<MyEntry<K, V>>> addMyMap(List<MyEntry<K, V>> newInsideList, K key, V value) {
    int size = myMap.size();
    int trueControl = 0;

    if (size < hash(key) && key != null) {
      for (int i = size; i <= hash(key); i++) {
        myMap.add(i, null);
      }
      myMap.set(hash(key), newInsideList);
    } else {
      if (myMap.get(hash(key)) != null) {

        List<MyEntry<K, V>> oldValueList = new ArrayList<>();
        oldValueList.addAll(myMap.get(hash(key)));
        int sizeOldList = oldValueList.size();

        for (int i = 0; i < sizeOldList; i++) {
          if (newInsideList.get(0).equals(oldValueList.get(i))) {
            trueControl++;
          }
        }
        if (trueControl == 0) {
          oldValueList.addAll(newInsideList);
          myMap.set(hash(key), oldValueList);
        } else {

          return myMap;
        }
      } else {
        myMap.set(hash(key), newInsideList);
      }
    }
    return myMap;
  }

  @Override
  public V remove(Object key) {
    return null;
  }

  @Override
  public void putAll(Map<? extends K, ? extends V> m) {

  }

  @Override
  public void clear() {
    myMap.clear();
  }

  @Override
  public Set<K> keySet() {
    return null;
  }

  @Override
  public Collection<V> values() {
    return null;
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    return null;
  }

  static int hash(Object key) {
    int h;
    return (key == null) ? 0 : (h = (key.hashCode()) / 100);
  }

}



