class MyHashSet {
    private final boolean[] present;

    public MyHashSet() {
        present = new boolean[1_000_001];
    }

    public void add(int key) {
        present[key] = true;
    }

    public void remove(int key) {
        present[key] = false;
    }

    public boolean contains(int key) {
        return present[key];
    }
}