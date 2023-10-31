package tasks1_2;

public class GenericClass<T,V,K> {
    T TVar;
    V VVar;
    K KVar;

    public GenericClass(T TVar, V VVar, K KVar) {
        this.TVar = TVar;
        this.VVar = VVar;
        this.KVar = KVar;
    }

    public T getTVar() {
        return TVar;
    }

    public V getVVar() {
        return VVar;
    }

    public K getKVar() {
        return KVar;
    }

    public void showTypes() {
        System.out.println("Type T: " + this.TVar.getClass());
        System.out.println("Type V: " + this.VVar.getClass());
        System.out.println("Type K: " + this.KVar.getClass());
    }
}
