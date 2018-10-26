package Generics_Collections_StreamAPI.task01;

class Pair<A, B> {

    private A a;
    private B b;

    private Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getFirst() {
        return a;
    }

    public B getSecond() {
        return b;
    }

    public static <A, B> Pair<A, B> of(A a, B b) {
        return new Pair<>(a, b);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        if (a != null) result = prime * result + a.hashCode();
        if (b != null) result = prime * result + b.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Pair other = (Pair) obj;
        if ((a != null && !a.equals(other.a)) || (other.a != null && !other.a.equals(a))) return false;
        if ((b != null && !b.equals(other.b)) || (other.b != null && !other.b.equals(b))) return false;

        return true;
    }
}