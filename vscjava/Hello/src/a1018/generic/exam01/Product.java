package a1018.generic.exam01;

//제네릭 타입
public class Product<K, M> {
  private K kind;
  private M model;

  public K getKind() {
    return kind;
  }

  public void setKind(K kind) {
    this.kind = kind;
  }

  public M getModel() {
    return model;
  }

  public void setModel(M model) {
    this.model = model;
  }

  // 메소드

}
