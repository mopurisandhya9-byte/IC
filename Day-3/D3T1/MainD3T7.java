
class CharacterFinder {
    private final String word;

    CharacterFinder() {
        this.word = "Programming";
    }

    void findCharacters() {
        int gPosition = this.word.indexOf('g');
        int mPosition = this.word.indexOf('m');

        System.out.println("Position of g: " + gPosition);
        System.out.println("Position of m: " + mPosition);
    }
}

class MainD3T7 {
    public static void main(String[] args) {
        CharacterFinder obj = new CharacterFinder();
        obj.findCharacters();
    }
}
